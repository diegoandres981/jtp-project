package jtp.project.first.services;

import jtp.project.first.model.Developer;
import jtp.project.first.model.Profile;
import jtp.project.first.model.User;
import jtp.project.first.repositories.DeveloperCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProfileService {

    @Autowired
    public DeveloperCrudRepository developerCrudRepository;


    public List<Profile> findAll() {
        Iterable iterableDevs = developerCrudRepository.findAll();
        List<Developer> devs = (List)iterableDevs;
        ArrayList<Profile> profiles = new ArrayList<>();
        for (Developer d : devs){
            profiles.add(d.getProfile());
        }
        return profiles;
    }

    public Profile findById(long id) {
        Optional<Developer> opD = developerCrudRepository.findById(id);
        return opD.get().getProfile();
    }

    public void deleteById(long id) {
        developerCrudRepository.deleteById(id);
    }

    public boolean existsById(long id) {
        return developerCrudRepository.existsById(id);
    }

    public Profile save(Profile profile) {
        developerCrudRepository.save(profile.getDev()); //?
        return profile;
    }
}
