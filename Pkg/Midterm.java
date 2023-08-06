package Pkg;

public class Midterm {

    public static abstract class A {

        public void showTheDataWhichBelongsToThisClass(){
            System.out.println("in Class A");
        }
    }
    public static class B extends A{

        public void showTheDataWhichBelongToThisClass(){
            System.out.println("in Class B");
        }
    }
    public static void main(String[] args) {
        B objB = new B();
//        objB.showTheDataWhichBelongsToThisClass();
    }
}
