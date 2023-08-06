interface  Bicycle{
    int b=45;
    void ApplyBrake(int decrement);
    void speedup(int increment);
    }
    interface HornBicycle{
    int a= 454;
    void blowhornk3g();
    void blowhornmhn();
    }
class AvonCycle implements Bicycle,HornBicycle{
    void blowhorn(){
        System.out.println("Pee Pee");
    }
    public void ApplyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedup(int increment){
        System.out.println("Applying speedup");
    }
    public void blowhornk3g(){
        System.out.println("kabhi");
    }
    public void blowhornmhn(){
        System.out.println("hii bitch");
    }
}

public class cwh_interface {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        a.ApplyBrake(1);
        a.blowhorn();
        System.out.println(a.b);
//        a.b=454; not possible
        a.blowhornk3g();
        a.blowhornmhn();

    }

}
