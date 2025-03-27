import java.util.List;

public class ResizePicture extends Message
{
    //Pipes and Filters
    public ResizePicture(String s){}
    public List<String> filter(List<String> message)
    {
        for (int j=0; j<message.size(); j++)
        {
            message.set(j, setFourthSubstringToLowerCase(message.get(j)));
        }
        
        System.out.println("\nResize Picture Filter\n");
        
        this.Print(message);
        
        return message;
    }

    //Blacboard
    public ResizePicture()
    {
        for (int j=0; j<message.size(); j++)
        {
            message.set(j, setFourthSubstringToLowerCase(message.get(j)));
        }
    }

    private String setFourthSubstringToLowerCase(String input)
    {
        String[] parts = input.split(",");
        parts[3] = parts[3].toLowerCase();
        return String.join(",", parts);
    }

    private void Print(List<String> message)
    {
        for(int i=0; i<message.size(); i++)
        {
            System.out.println(message.get(i));
        }
    }
}