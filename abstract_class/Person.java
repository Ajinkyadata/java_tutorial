abstract class Person{
    public String name="pagal";
    public int year=20;
    public abstract void study();
    
}

      


class Student extends Person{
    public int gradyear;
    public void Student(int yr){
        //name =nm;
        gradyear=yr;
    }
        public void study(){
            System.out.println("i hv been studying all day");
        }
        
}


