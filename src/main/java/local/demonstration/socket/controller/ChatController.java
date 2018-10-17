package local.demonstration.socket.controller;

import local.demonstration.socket.entity.Message;
import local.demonstration.socket.repository.MessageRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author ITRex Group
 */

@Controller
public class ChatController {

    @Autowired
    private MessageRepository messageRepository;

    @MessageMapping("/hello")
    @SendTo("/topic/chat")
    public MessageClass messaging(@Payload MessageClass message){
        System.out.println(message);
        Message mess = new Message();
        mess.setChatId(1l);
        mess.setFromId(1l);
        mess.setMessage(message.getMessage());
        mess.setToId(1l);
        mess = messageRepository.save(mess);
        return message;
    }


}
@Data
@NoArgsConstructor
@AllArgsConstructor
class MessageClass{
    private String message;
}