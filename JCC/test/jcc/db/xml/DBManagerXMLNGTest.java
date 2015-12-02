/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcc.db.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;
import javax.sound.sampled.Clip;
import jcc.Actor;
import jcc.db.ItemExistException;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ЗолотаревичОВ
 */
public class DBManagerXMLNGTest {

    static Actor actor1;
    static Actor actor2;
    static Actor actor3;
    static Actor actor4;
    static Actor actorNotInList;
    static DBManagerXML instance;
    static File fileLoad;
    static File fileSave;
    static Vector<Actor> actors;

    public DBManagerXMLNGTest() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        instance = new DBManagerXML();
        actor1 = new Actor();
        actor1.setName("Karla Lane");
        Vector<String> akos = new Vector();
        akos.add("Navarro");
        akos.add("Karla");
        actor1.setAko(akos);
        actor1.setDescription("description for Karla Lane");
        actor1.setId(1);

        actor2 = new Actor();
        actor2.setName("Elizabeth Rollings");
        actor2.setDescription("description for Elizabeth Rollings");
        actor2.setId(2);

        actor3 = new Actor();
        actor3.setName("Karla");
        actor3.setDescription("name equals ako of actor1");
        actor3.setId(3);

        actor4 = new Actor();
        actor4.setName("Elizabeth Rollings");
        actor4.setDescription("name equals mame of actor2");
        actor4.setId(4);

        actorNotInList = new Actor();
        actorNotInList.setName("Anorei Collins ");
        actorNotInList.setDescription("non entered in list actor");
        actorNotInList.setId(5);

        actors = new Vector();
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);
        actors.add(actor4);

        fileLoad = new File("test\\XML\\actors_test_load.xml");
        fileSave = new File("test\\XML\\actors_test_save.xml");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        instance.actorData.clear();
        instance.actorData.put(actor1.getName(),actor1);
        instance.actorData.put(actor1.getAko().get(0),actor1);
        instance.actorData.put(actor1.getAko().get(1),actor1);
        instance.actorData.put(actor2.getName(),actor2);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Тест метод load, класса DBManagerXML.
     */
    @Test
    public void testLoad() {
        System.out.println("load");

        instance.fileXML = fileLoad;
        int expCount = 4;

        instance.load();

        int actCount = instance.actorData.values().size();
        assertEquals(actCount, expCount);

        Actor expActor = actor1;
        Set<Actor> actors = instance.actorData.get(actor1.getName());
        Actor actActor[] = actors.toArray(new Actor[0]);
        assertEquals(actActor[0].getName(), expActor.getName());
        assertEquals(actActor[0].getAko().size(), expActor.getAko().size());
        assertEquals(actActor[0].getDescription(), expActor.getDescription());
//        assertEquals(actActor.getPhoto(), expActor.getPhoto());

    }

    /**
     * Тест метод save, класса DBManagerXML.
     */
    @Test
    public void testSave() {
        System.out.println("save");

        if (fileSave.exists()) {
            fileSave.delete();
        }

        instance.fileXML = fileSave;

        instance.save();
        assertTrue(fileSave.exists());
        assertEquals(fileLoad.length(), fileSave.length());
    }

    /**
     * Тест метод getActorsByName, класса DBManagerXML.
     */
    @Test
    public void testGetActorsByName() {
        System.out.println("getActorsByName");

        String name = actor2.getName();

        ArrayList<Actor> result = instance.getActorsByName(name);
        int expSize = 1;
        assertEquals(result.size(), expSize);
        assertEquals(result.get(0).getName(), name);

        name = actor1.getName();
        String ako = actor1.getAko().get(1);

        ArrayList<Actor> resultByName = instance.getActorsByName(name);
        ArrayList<Actor> resultByAko = instance.getActorsByName(ako);
        expSize = 1;
        assertEquals(resultByName.size(), expSize);
        assertEquals(resultByAko.size(), expSize);
        assertEquals(resultByName.get(0), resultByAko.get(0));

        instance.actorData.put(actor3.getName(),actor3);
        resultByAko = instance.getActorsByName(ako);
        expSize = 2;
        assertEquals(resultByAko.size(), expSize);
        assertNotEquals(resultByAko.get(0), resultByAko.get(1));

        instance.actorData.put(actor4.getName(),actor4);
        name = actor2.getName();
        result = instance.getActorsByName(name);
        expSize = 2;
        assertEquals(result.size(), expSize);
        assertEquals(result.get(0).getName(), name);
        assertEquals(result.get(1).getName(), name);
    }

    /**
     * Тест метод addActor, класса DBManagerXML.
     */
    @Test
    public void testAddActor() throws ItemExistException {
        System.out.println("addActor");
        Actor actor = actorNotInList;
        int expSize = instance.actorData.size() + 1;
        instance.addActor(actor);
        int actSize = instance.actorData.size();
        assertEquals(actSize, expSize);
    }

    @Test(expectedExceptions = ItemExistException.class)
    public void testAddActorException() throws ItemExistException {
        System.out.println("addActor");
        Actor actor = actor1;
        instance.addActor(actor);
    }

//    /**
//     * Тест метод getActorById, класса DBManagerXML.
//     */
//    @Test
//    public void testGetActorById() {
//        System.out.println("getActorById");
//
//        for (int i = 0, k = instance.actorData.size(); i < k; i++) {
//            int id = instance.actorData.get(i).getId();
//            Actor expResult = instance.actorData.get(i);
//            Actor result = instance.getActorById(id);
//            assertEquals(result, expResult);
//        }
//    }

    /**
     * Тест метод getClipsByName, класса DBManagerXML.
     */
    @Test
    public void testGetClipsByName() {
        System.out.println("getClipsByName");
        String name = "";

        ArrayList expResult = null;
        ArrayList result = instance.getClipsByName(name);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод addClip, класса DBManagerXML.
     */
    @Test
    public void testAddClip() {
        System.out.println("addClip");

        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод getClipById, класса DBManagerXML.
     */
    @Test
    public void testGetClipById() {
        System.out.println("getClipById");
        int id = 0;
 
        Clip expResult = null;
        Clip result = instance.getClipById(id);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

//    /**
//     * Тест метод existActor, класса DBManagerXML.
//     */
//    @Test
//    public void testExistActor() {
//        System.out.println("existActor");
//        boolean result;
//        for (int i = 0, k = instance.actorData.size(); i < k; i++) {
//            int id = instance.actorData.get(i).getId();
//            result = instance.existActor(instance.actorData.get(i));
//            assertTrue(result);
//        }
//        result = instance.existActor(actorNotInList);
//        assertFalse(result);
//    }

}
