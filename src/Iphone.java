
public class Iphone extends ElectricalDevice implements Phone {

   private String owner;


    //Need to override abstract method in ElectricalDevice class
    public boolean powerOn(int current) {

        if (current <=  ElectricalDevice.MAXCURRENT){
            this.current = current;
            return true;
        }
        else return false;
    }
    //Iphone Constructor
    public Iphone () {
        System.out.println("In Iphone constructor");
        this.current = 0; //Set current to zero
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    //Need to override Phone methods
    public void dial(String number){
        if (this.current == 0 ){
            System.out.println("Need to switch on before dialing ");
        }
        else  System.out.println("Dialing "+number);
    }
    public void hangUp(){
         System.out.println("Ending call..");
    }

    public String getDetails(){

        return "Owner =  "+ owner +" Current = "+ current;

    }




}
