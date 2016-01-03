/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcc;

import java.awt.Image;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ЗолотаревичОВ
 */
public class Entity {

    /**
     *
     */
    protected int mainNameId = -1;

    /**
     *
     */
    protected Vector<String> names;

    /**
     *
     */
    protected Image image;

    /**
     *
     */
    protected String description;

    /**
     *
     */
    protected Integer id;

    /**
     *
     */
    protected static int nextId = 0;

    static final Logger LOG = Logger.getLogger(Entity.class.getName());

    /**
     * @return the name
     */
    public String getName() {
        //if (0>dispNameId)
        return null;
    }

    /**
     * @param id
     * @return the alternative name by id
     */
    public String getName(int id) {
        //if (0>dispNameId)
        return null;
    }

    /**
     *
     * @param name the name to set
     *
     */
    public void setName(String name) {
        //this.name = name;
    }

    /**
     *
     * @param name the name to set add alternative name
     */
    public void addName(String name) {

    }

    /**
     *
     * @param name the name to set add main name
     *
     */
    public void addMainName(String name) {

    }

    /**
     * @return the photo
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param img
     */
    public void setImage(Image img) {
        this.image = img;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     * @return 
     */
    public int setNextId(int id) {
        this.nextId = id;
        return nextId;
    }

    /**
     * @return 
     */
    public static int getNextId() {
        return nextId;
    }

}
