/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcc;

import java.awt.Image;

/**
 *
 * @author zov
 */
public class EntityNGTest {
    
    public EntityNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Тест метод getName, класса Entity.
     */
    @org.testng.annotations.Test
    public void testGetName_0args() {
        System.out.println("getName");
        Entity instance = new Entity();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод getName, класса Entity.
     */
    @org.testng.annotations.Test
    public void testGetName_int() {
        System.out.println("getName");
        int id = 0;
        Entity instance = new Entity();
        String expResult = "";
        String result = instance.getName(id);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод setName, класса Entity.
     */
    @org.testng.annotations.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Entity instance = new Entity();
        instance.setName(name);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод addName, класса Entity.
     */
    @org.testng.annotations.Test
    public void testAddName() {
        System.out.println("addName");
        String name = "";
        Entity instance = new Entity();
        instance.addName(name);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод addMainName, класса Entity.
     */
    @org.testng.annotations.Test
    public void testAddMainName() {
        System.out.println("addMainName");
        String name = "";
        Entity instance = new Entity();
        instance.addMainName(name);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод getImage, класса Entity.
     */
    @org.testng.annotations.Test
    public void testGetImage() {
        System.out.println("getImage");
        Entity instance = new Entity();
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод setImage, класса Entity.
     */
    @org.testng.annotations.Test
    public void testSetImage() {
        System.out.println("setImage");
        Image img = null;
        Entity instance = new Entity();
        instance.setImage(img);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод getDescription, класса Entity.
     */
    @org.testng.annotations.Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Entity instance = new Entity();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод setDescription, класса Entity.
     */
    @org.testng.annotations.Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Entity instance = new Entity();
        instance.setDescription(description);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод getId, класса Entity.
     */
    @org.testng.annotations.Test
    public void testGetId() {
        System.out.println("getId");
        Entity instance = new Entity();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод setNextId, класса Entity.
     */
    @org.testng.annotations.Test
    public void testSetNextId() {
        System.out.println("setNextId");
        int id = 0;
        Entity instance = new Entity();
        int expResult = 0;
        int result = instance.setNextId(id);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод getNextId, класса Entity.
     */
    @org.testng.annotations.Test
    public void testGetNextId() {
        System.out.println("getNextId");
        int expResult = 0;
        int result = Entity.getNextId();
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
    
}
