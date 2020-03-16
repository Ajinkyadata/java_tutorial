class Ccar{

    protected String type="SUV";

}

class SuperCar extends Ccar{
    
    public String name="maruti 800";

    public static void main(String[] args){
    
        Supercar obj= new Supercar();
        System.out.println("type : "+obj.type+" name: "+obj.name);
    }
}
