public class cwhpractice_abstract_interface {
    abstract class Baseclass{
        public Baseclass(){
            System.out.println("Mai Baseclass ka constructor hu");
        }

        public void sayHello(){
            System.out.println("hello");
        }
        abstract public void greet();
        abstract public void greet2();
    }
    class base2 extends Baseclass{
        public void greet(){
            System.out.println("Good morning");
        }
        public void greet2(){
            System.out.println("Good morning");
        }
    }

    abstract class base3 extends Baseclass{
        public void th(){
            System.out.println("i am good");
        }
    }

    public static void main(String[] args) {

    }
}
