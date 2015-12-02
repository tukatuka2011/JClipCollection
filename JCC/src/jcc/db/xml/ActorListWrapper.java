/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcc.db.xml;

import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import jcc.Actor;

/**
 *
 * @author ЗолотаревичОВ
 */
@XmlRootElement(name = "actors")
public class ActorListWrapper {

    private Collection<Actor> persons;

    @XmlElement(name = "actor")
    public Collection<Actor> getPersons() {
        return persons;
    }

    public void setPersons(Collection<Actor> persons) {
        this.persons = persons;
    }
}
