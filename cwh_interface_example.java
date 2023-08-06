interface camera{
    void takesnap();
    void takevideo();
    default void recordin4k(){
        System.out.println("recording in 4k");
    }
}

interface wifi{
    String[] getnetworks();
    void connecttoNetwork(String Network);

}
class MyCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class Mysmartphone extends MyCellPhone implements wifi,camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void takevideo(){
        System.out.println("taking video");
    }
    public String[] getnetworks(){
        System.out.println("getting list of Networks");
        String[] networklist ={"harry","prasanth","abhi"};
        return networklist;
    }
    public void connecttoNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}

public class cwh_interface_example {
    public static void main(String[] args) {
        Mysmartphone ms = new Mysmartphone();
        String[] ar= ms.getnetworks();
        for (String item:ar){
            System.out.println(item);
        }
        ms.takesnap();
        ms.recordin4k();
    }
}
