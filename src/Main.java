import java.util.ArrayList;
import java.util.List;

class Main 
{
    private static List<String> message = new ArrayList<String>()
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

    public static void main(String[] args)
    {
        //Pipes and filters
        System.out.println("Pipes and Filters");

        Pipe p1 = new Pipe();
        Pipe p2 = new Pipe();
        Pipe p3 = new Pipe();
        Pipe p4 = new Pipe();
        Pipe p5 = new Pipe();
        
        CheckBuyers b11=new CheckBuyers("b1");
        CheckProfanities p11=new CheckProfanities("p1");
        CheckPropaganda p21=new CheckPropaganda("p2");
        AnalyzeSentiments a11=new AnalyzeSentiments("a1");
        ResizePicture r11=new ResizePicture("r1");

        p1.setMessages(b11.filter(message));
        p2.setMessages(p11.filter(p1.getMessages()));
        p3.setMessages(p21.filter(p2.getMessages()));
        p4.setMessages(a11.filter(p3.getMessages()));
        p5.setMessages(r11.filter(p4.getMessages()));

        //Blackboard
        System.out.println("\nBlackboard");

        CheckBuyers b1=new CheckBuyers();
        CheckProfanities _p1=new CheckProfanities();
        CheckPropaganda _p2=new CheckPropaganda();
        ResizePicture r1=new ResizePicture();
        CompetitorWebsite c1=new CompetitorWebsite();
        AnalyzeSentiments a1=new AnalyzeSentiments();
        Print output=new Print();
    }
}