/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcc.db.xml;

import com.google.common.collect.HashMultimap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import jcc.Actor;
import jcc.db.IDBManager;
import jcc.db.ItemExistException;

/**
 *
 * @author ЗолотаревичОВ
 */
public class DBManagerXML implements IDBManager {

    HashMultimap<String, Actor> actorData;
    File fileXML;

    public DBManagerXML() {
        actorData = HashMultimap.create();
    }

    @Override
    public void load() {
        actorData.clear();

        JAXBContext context;
        try {
            context = JAXBContext
                    .newInstance(ActorListWrapper.class);
            Unmarshaller um = context.createUnmarshaller();

            // Reading XML from the file and unmarshalling.
            ActorListWrapper wrapper = (ActorListWrapper) um.unmarshal(fileXML);

            actorData.clear();
            Collection<Actor> persons = wrapper.getPersons();
            for (Actor person : persons) {
                try {
                    addActor(person);
//                actorData.put(person.getName(), person);
//                if (null != person.getAko()) {
//                    for (String ako : person.getAko()) {
//                        actorData.put(ako, person);
//                    }
//                }
                } catch (ItemExistException ex) {
                    Logger.getLogger(DBManagerXML.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println(actorData.size());
        } catch (JAXBException ex) {
            Logger.getLogger(DBManagerXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save() {
        JAXBContext context;
        try {
            context = JAXBContext
                    .newInstance(ActorListWrapper.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Wrapping our person data.
            ActorListWrapper wrapper = new ActorListWrapper();
            ArrayList actors = new ArrayList();
            Iterator<Actor> itr = actorData.values().iterator();
            Actor firstElement = itr.next();
            actors.add(firstElement);
            while (itr.hasNext()) {
                Actor element = itr.next();
                if (firstElement.getId() != element.getId()) {
                    firstElement = element;
                    actors.add(firstElement);
                }
            }
            wrapper.setPersons(actors);

            // Marshalling and saving XML to the file.
            m.marshal(wrapper, fileXML);

        } catch (JAXBException ex) {
            Logger.getLogger(DBManagerXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Actor> getActorsByName(String name) {
        return new ArrayList(actorData.get(name));
    }

    @Override
    public void addActor(Actor actor) throws ItemExistException {
        actorData.put(actor.getName(), actor);
        if (null != actor.getAko()) {
            for (String ako : actor.getAko()) {
                actorData.put(ako, actor);
            }
        }
    }

    @Override
    public Actor getActorById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Clip> getClipsByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addClip(Clip actor) throws ItemExistException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clip getClipById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existActor(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
