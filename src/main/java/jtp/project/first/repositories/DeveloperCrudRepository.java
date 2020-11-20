package jtp.project.first.repositories;

import jtp.project.first.model.Developer;
import jtp.project.first.model.User;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperCrudRepository extends CrudRepository<Developer, Long>{

    public User getAllByTenure(String tenure);

}
