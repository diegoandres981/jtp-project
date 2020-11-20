package jtp.project.first.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Developer extends User {

    /*????*/
    @Id
    private long id = super.getId();
    /*????*/

    private String fullName;
    private int age;
    private String tenure;
    private int seniority;
    @ElementCollection
    private Collection<String> skills;
    @ElementCollection
    private Collection<String> projects;

    public  Developer(){}

    /*????*/
    //cuestion del id...
    public Developer (String fullName, int age, String tenure, int seniority){
        super();
        this.fullName = fullName;
        this.age = age;
        this.tenure = tenure;
        this.seniority = seniority;
    }

    /*????*/
    public Profile getProfile(){
        return new Profile(this);
    }
    /*????*/

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public Collection<String> getSkills() {
        return skills;
    }

    public void setSkill(String skill) {
        this.skills.add(skill);
    }

    public Collection<String> getProjects() {
        return projects;
    }

    public void setProject(String project) {
        this.projects.add(project);
    }
}
