import java.util.List;

public class CompetitorWebsite extends Message
{
    //Pipes and Filters
    public CompetitorWebsite(String s){}
    public List<String> filter(List<String> message)
    {
        for (int j=0; j<message.size(); j++)
        {
            if(message.get(j).contains("http"))
            {
                message.set(j, setThirdSubstring(message.get(j)));
            }
        }
        
        System.out.println("\nCompetitor Website Filter\n");
        for (int i=0; i<message.size(); i++)
        {
            System.out.println(message.get(i));
        }
        
        return message;
    }

    //Blackboard
    public CompetitorWebsite()
    {
        for (int j=0; j<message.size(); j++)
        {
            if(message.get(j).contains("http"))
            {
                message.set(j, setThirdSubstring(message.get(j)));
            }
        }
    }

    private String setThirdSubstring(String message)
    {
        String[] parts = message.split(",");
        parts[2] = parts[2].replace("http", "");
        return String.join(",", parts);
    }
}