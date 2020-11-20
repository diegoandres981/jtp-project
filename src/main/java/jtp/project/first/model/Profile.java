package jtp.project.first.model;

import javax.persistence.*;
import java.util.Collection;

public class Profile {

    @Id
    private long id;
    @OneToOne
    private Developer dev;

    public Profile(){}

    public Profile(Developer dev){
        this.id=dev.getId();
    }

    public Developer getDev() {
        return dev;
    }

    public void setDev(Developer dev) {
        this.dev = dev;
    }

    public Collection<String> getDevSkills() {
        return dev.getSkills();
    }

    public String getDevSeniority() {
        return Integer.toString(dev.getSeniority());
    }

    public String getDevFullName() {
        return dev.getFullName();
    }

    public String getDevAge(){
        return Integer.toString(dev.getAge());
    }

    public String getDevTenure(){
        return dev.getTenure();
    }

    public Collection<String> getDevProjects(){
        return dev.getProjects();
    }

    public void setNewDevSkill(String skill){ dev.setSkill(skill); }

    public void setNewDevTenure(String tenure) { dev.setTenure(tenure); }

    public void setNewDevProject(String project) { dev.setProject(project); }


}
