public class Car
{
    int year;
    String name;

    public Car(int yr, String nm)
    {
        year=yr;
        name=nm;
    }

    public static void main(String[] args)
    {
        Car  newCar= new Car(2008, "hehe hellooo");
        System.out.println(newCar.year+" "+newCar.name);
    }
}
