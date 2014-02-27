
public class Main {


    public static void main(String[] args) {
      //Add a new method in the Phone Interface class called ‘hold ()’. 
     //	Add required functionality in the IPhone class and test in Main.

       System.out.println("Interface Demo");
        Iphone myphone = new Iphone();
        myphone.dial("12345");
        myphone.setOwner("Fred");
        myphone.powerOn(200);
        myphone.dial("12345");
        System.out.println(myphone.getDetails());

    }

}
