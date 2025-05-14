import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class L3EX3 
{
	//Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        boolean redButtonState = false;
        boolean greenButtonState = false;
        int count = 0;
        
        //Use your Phidgets 
        while(true)
        {

            //Red Button
        	if(redButton.getState() && !redButtonState)
        	{
        		redLED.setState(true);
        		count++;
        		System.out.println(count);
        	}
        	else if(!redButton.getState() && redButtonState)
        	{
        		redLED.setState(false);
        	}
        	
        	
        	
        	redButtonState = redButton.getState();
            Thread.sleep(150);
        }
    
}

}
