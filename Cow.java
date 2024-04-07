public class Cow implements Animal,Printable{
    
    @Override
    public void eat(){
        System.out.println("eating.");
    }
    
    @Override
    public void walk(){
        System.out.println("walking.");
    }
    
    @Override
    public void display(){
        System.out.println("Cow is eating and walking.");
    }
}