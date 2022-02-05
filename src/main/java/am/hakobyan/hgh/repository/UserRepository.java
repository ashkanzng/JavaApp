package am.hakobyan.hgh.repository;

import am.hakobyan.hgh.entity.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT e FROM User e WHERE e.userName = ?1")
    User findByUserName(String userName);
}
