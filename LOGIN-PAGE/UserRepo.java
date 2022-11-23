
package com.app.repo;
import org.springframework.data.jpa.repository.jpaRepository;
import com.app.model.user;
@Repository

public interface UserRepo extends JpaRepository<User,String>{

}
