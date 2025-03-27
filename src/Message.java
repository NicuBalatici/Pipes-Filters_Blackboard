import java.util.ArrayList;
import java.util.List;

public class Message
{
    //Blackboard
    public Message(){}
    protected static List<String> message = new ArrayList<String>()
    {
        {
            add("John, Laptop, ok, PICTURE");
            add("Mary, Phone, @#$%), IMAGE");
            add("Peter, Phone, GREAT, ManyPictures");
            add("Ann, Book, So GOOD, Image");
            add("David, Tablet, httpAmazing, Photo");
            add("Oliver, Laptop, Needs Fixing, Screenshot");
            add("Isabella, Camera, +++++, IMAGE");
            add("Evelyn, Camera, -----, PICTURE");
        }
    };
}