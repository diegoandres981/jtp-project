package jtp.project.first.rest;

import jtp.project.first.model.Developer;
import jtp.project.first.model.Profile;
import jtp.project.first.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/profiles")
@RestController
public class ProfilesController {

    @Autowired
    public ProfileService profileService;

    @GetMapping
    public List<Profile> getProfiles(){
        return profileService.findAll();
    }

    @GetMapping("{id}")
    public Profile getProfileByParam(@PathVariable("id") long id){
        return profileService.findById(id);
    }

    /*@DeleteMapping("{id}")
    public void deleteProfileByParam(@PathVariable("id") long id){
        authenticationService.deleteById(id);
        this.getProfiles();
    }

    @PostMapping
    public Profile addProfile(@RequestBody Profile user){
        if (!authenticationService.existsById(user.getId())){
            return authenticationService.save(user);
        }
        return null;
    }*/

    @PutMapping
    public Profile updateProfile(@RequestBody Profile profile){
        return profileService.save(profile);
    }
}
