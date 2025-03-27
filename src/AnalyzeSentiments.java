import java.util.List;

public class AnalyzeSentiments extends Message
{
    //Pipes and Filters
    public AnalyzeSentiments(String s){}

    public List<String> filter(List<String> message)
    {
        int lowercase=0;
        int uppercase=0;

        for(int i=0; i<message.size(); i++)
        {
            lowercase=0;
            uppercase=0;

            for (int j=0; j<getThirdSubstring(message.get(i)).length(); j++)
            {
                if(Character.isLowerCase(getThirdSubstring(message.get(i)).charAt(j)))        { lowercase++; }
                else if(Character.isUpperCase(getThirdSubstring(message.get(i)).charAt(j)))   { uppercase++; }
            }

            if(uppercase>lowercase)          {message.set(i, setThirdSubstring(message.get(i), "+")); }
            else if(uppercase<lowercase)     {message.set(i, setThirdSubstring(message.get(i), "-")); }
            else                             {message.set(i, setThirdSubstring(message.get(i), "=")); }
        }
        
        System.out.println("\nAnalyze Sentiments Filter\n");
        for (int i = 0; i < message.size(); i++) {System.out.println(message.get(i));}
        
        return message;
    }

    //Blackboard
    public AnalyzeSentiments()
    {
        int lowercase=0;
        int uppercase=0;

        for(int i=0; i<message.size(); i++)
        {
            lowercase=0;
            uppercase=0;

            for (int j=0; j<getThirdSubstring(message.get(i)).length(); j++)
            {
                if(Character.isLowerCase(getThirdSubstring(message.get(i)).charAt(j))) { lowercase++; }
                else if(Character.isUpperCase(getThirdSubstring(message.get(i)).charAt(j))) { uppercase++; }
            }


            if (uppercase>lowercase)          {message.set(i, setThirdSubstring(message.get(i), "+")); }
            else if (uppercase<lowercase)     {message.set(i, setThirdSubstring(message.get(i), "-")); }
            else                              {message.set(i, setThirdSubstring(message.get(i), "=")); }
        }
    }

    private String getThirdSubstring(String message)
    {
        return message.split(",")[2];
    }

    private String setThirdSubstring(String message, String sign)
    {
        String[] parts = message.split(",");
        parts[2] += sign;
        return String.join(",", parts);
    }
}