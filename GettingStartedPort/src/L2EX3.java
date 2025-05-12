import com.phidget22.*;

public class L2EX3 
{
	
	 //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
       
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets 
        while(true)
        {
            System.out.println("Red Button State: " + redButton.getState());
            Thread.sleep(150);
            
            System.out.println("Green Button State: " + greenButton.getState());
            Thread.sleep(150);
            
        }
    }

}
