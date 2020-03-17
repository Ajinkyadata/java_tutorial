import java.util.HashMap;
class Myclass1
{
    public static void main(String[] args)
    {
        HashMap<String, String> obj= new HashMap<String, String>();

        obj.put("haha","hoho");
        obj.put("lol","imao");
        obj.put("pipi","titi");
        obj.put("fifi","fufu");
        


        for(String x: obj.values())
        System.out.println(x+"\n");


        for(String x: obj.keySet())
        System.out.println(x+"\n");

    }
}