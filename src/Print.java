public class Print extends Message
{
    //Blackboard
    public Print() 
    {
        System.out.println("\n");
        for (int i=0; i<message.size(); i++) 
        {
            System.out.println(message.get(i));
        }
    }
}