public class Motorcycle extends Transport{

    public Motorcycle(String type, String name) {
        super(type, name, 2);
    }
    public void wheeling(int secs){
        System.out.println(this.name + " is wheeling for " + secs + " seconds!");
    }
}
