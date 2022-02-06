package am.hakobyan.hgh.repository;

import am.hakobyan.hgh.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT e FROM User e WHERE e.userName = ?1")
    User findByUserName(String userName);

    List<User> findByHomeAddressZip(String zipCode);

    @Query(value = "SELECT u FROM User u, Task t WHERE u.id = t.user.id")
    List<User> getUserFromTask();

}
