package local.demonstration.socket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ITRex Group
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "from_id")
    private Long fromId;
    @Column(name = "to_id")
    private Long toId;
}
