import java.util.ArrayList;
import java.util.List;

public class CheckProfanities extends Message
{
    //Pipes and Filters
    public CheckProfanities(String m){}
    public List<String> filter(List<String> message)
    {
        for (int j=message.size()-1; j>=0; j--) 
        {
            boolean c=false;
            for (int i=0; i<profanities.size(); i++) 
            {
                if (profanities.get(i).equals(getThirdSubstring(message.get(j))))
                {
                    c=true;
                    break;
                }
            }

            if (c)      {message.remove(j);}
        }

        System.out.println("\nCheck Profanities Filter\n");
        for (int i=0; i<message.size(); i++)    {System.out.println(message.get(i));}

        return message;
    }

    //Blackboard
    private List<String> profanities = new ArrayList<String>() 
    {
        {
            add("@#$%)");
            add("#@)$");
            add(")$$##@");
        }
    };

    public CheckProfanities() 
    {
        for (int j=message.size()-1; j>=0; j--) 
        {
            boolean c=false;
            for (int i=0; i<profanities.size(); i++) 
            {
                if (profanities.get(i).equals(getThirdSubstring(message.get(j))))
                {
                    c=true;
                    break;
                }
            }

            if (c) {message.remove(j);}
        }
    }

    private String getThirdSubstring(String message)  {return message.split(",")[2].trim();}
}