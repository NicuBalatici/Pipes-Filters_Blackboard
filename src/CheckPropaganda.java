import java.util.List;

public class CheckPropaganda extends Message
{
    //Pipes and Filters
    public CheckPropaganda(String i){}
    public List<String> filter(List<String> message)
    {
        for (int j=message.size()-1; j>=0; j--)
        {
            if ("+++++".equals(getThirdSubstring(message.get(j))) 
            || "-----".equals(getThirdSubstring(message.get(j))))
            {
                message.remove(j);
            }
        }

        System.out.println("\nCheck Propaganda Filter\n");
        
        for (int i=0; i<message.size(); i++)
        {
            System.out.println(message.get(i));
        }
        return message;
    }

    //Blackboard
    public CheckPropaganda()
    {
        for (int j=message.size()-1; j>=0; j--)
        {
            if ("+++++".equals(getThirdSubstring(message.get(j))) 
            || "-----".equals(getThirdSubstring(message.get(j))))
            {
                message.remove(j);
            }
        }
    }

    private static String getThirdSubstring(String message)   {return message.split(",")[2].trim();}
}