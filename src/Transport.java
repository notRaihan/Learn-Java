public class Transport {
    public String type;
    public String name;
    public int wheels;

    public Transport(String type, String name, int wheels) {
        this.type = type;
        this.name = name;
        this.wheels = wheels;
    }
    public void turn(String direction){
        System.out.println(this.name + " Turn " + direction);
    }
    public void honk(){
        System.out.println(this.name + " is Honking!");
    }
}
