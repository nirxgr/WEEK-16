public abstract class Car{
    protected String name;
    protected String description;
    public Car(String name, String description){
        this.name=name;
        this.description=description;
    }
    
    public abstract void display();
}