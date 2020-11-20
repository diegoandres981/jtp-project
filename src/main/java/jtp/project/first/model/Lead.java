package jtp.project.first.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lead extends User {

    /*????*/
    @Id
    private long id = super.getId();
    /*????*/


}
