package local.demonstration.socket.entity;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

import java.util.Date;

/**
 * @author ITRex Group
 */

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Message {
    private Long id;
    private String message;
    private Long chatId;
    private Date postDate;
    private String from;
    private String to;
}
