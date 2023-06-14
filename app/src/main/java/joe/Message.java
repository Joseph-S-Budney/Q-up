package joe;

import org.bson.Document;
import org.bson.types.ObjectId;
import java.util.Date;

public class Message{

    Document message;
    String text;

    public Message(String t){
        message = new Document("_id", new ObjectId());
        text = t;
        message.append("message", text).append("dateSent", new Date().toString());
    }
    public Document getDocument(){
        return message;
    }
    public String getText(){
        return text;
    }
}