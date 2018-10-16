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
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "message")
    private String message;
    @Column(name = "chat_id")
    private Long chatId;
    @Column(name = "from_id")
    private Long fromId;
    @Column(name = "to_id")
    private Long toId;
}
