/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcc;

import java.awt.Image;
import java.util.Vector;

/**
 *
 * @author ЗолотаревичОВ
 */
public class Actor {

    private String name;
    private Vector<String> ako;
    private Image photo;
    private String description;
    private Integer id;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ako
     */
    public Vector<String> getAko() {
        return ako;
    }

    /**
     * @param ako the ako to set
     */
    public void setAko(Vector<String> ako) {
        this.ako = ako;
    }

    /**
     * @return the photo
     */
    public Image getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(Image photo) {
        this.photo = photo;
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
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
