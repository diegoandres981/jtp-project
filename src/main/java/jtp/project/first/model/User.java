package jtp.project.first.model;

import javax.persistence.*;
import java.util.Collection;

public abstract class User {

    /*????*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    /*????*/

    public User(){}

    /*public User(long id) {
        this.id = id;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}