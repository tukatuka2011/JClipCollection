/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcc.db;

import java.util.ArrayList;
import javax.sound.sampled.Clip;
import jcc.Actor;

/**
 *
 * @author ЗолотаревичОВ
 */
public interface IDBManager {

    public void load();

    public void save();

    //Actors 
    public ArrayList<Actor> getActorsByName(final String name);

    public void addActor(Actor actor) throws ItemExistException;

    public Actor getActorById(final int id);

    public boolean existActor(Actor actor);

    //Clips
    public ArrayList<Clip> getClipsByName(final String name);

    public void addClip(Clip actor) throws ItemExistException;

    public Clip getClipById(final int id);

    
}
