public class CarToBuy extends Car{
    private int price;
    private int registeredYear;
    
    public CarToBuy (String name,String description,int price,int registeredYear){
         super (name,description);
         this.price=price;
         this.registeredYear=registeredYear;
    }

    @Override
    public void display(){
        System.out.println("The name of the car is "+this.name);
        System.out.println("The description of car is "+this.description);
        System.out.println("The price of car is "+this.price);
        System.out.println("The registered year of car is "+this.registeredYear);
    }
}