public class MyRestro implements Restro{
    @Override
    public void order(){
        System.out.println("The order");
    }
    @Override
    public void deliver(){
        System.out.println("The deliver");
    }
}