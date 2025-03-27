import java.util.ArrayList;
import java.util.List;

public class CheckBuyers extends Message
{
    //Pipes and Filters
    public CheckBuyers(String s){}
    public List<String> filter(List<String> message)
    {
        for (int j=message.size()-1; j>=0; j--)
        {
            if (!buyers.contains(message.get(j).split(",")[0]))
            {
                message.remove(j);
            }
        }
        
        System.out.println("\nCheck Buyers Filter\n");
        for (int i = 0; i < message.size(); i++)
        {
            System.out.println(message.get(i));
        }
        
        return message;
    }



    //Blackboard
    private List<String> buyers = new ArrayList<String>()
    {
        {
            add("John");
            add("Mary");
            add("Peter");
            add("Isabella");
            add("Evelyn");
        }
    };

    public CheckBuyers() 
    {
        for (int j=message.size()-1; j>=0; j--)
        {
            if (!buyers.contains(message.get(j).split(",")[0]))
            {
                message.remove(j);
            }
        }
    }
}