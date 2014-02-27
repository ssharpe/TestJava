
public abstract class ElectricalDevice {
 
    protected int current;
    static final int MAXCURRENT = 500; //milliamps - CLASS CONSTANT
    
    public abstract boolean powerOn(int current) ;

}
