package local.demonstration.socket.repository;

import local.demonstration.socket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ITRex Group
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
