package local.demonstration.socket.repository;

import local.demonstration.socket.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ITRex Group
 */

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
