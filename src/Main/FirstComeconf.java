package Main;

import java.util.ArrayList;
import java.util.List;

public class FirstComeconf extends Configuration {
	void firstcome(Vehicle vehicle,List<Slot> slots)
    {
		vehicle.info();
		boolean test = false;
        //loop to access list slot
        for(int i = 0;i<slots.size();i++)
        {
            //see wether the slot is empty or not
           if(slots.get(i).getIsEmpty())
           {
               //the slot is empty
               //see wether the dimensions of the vehicle is suitable withe the dimensions of the slot
               if((slots.get(i).getSlotWidth()>vehicle.getVehicleWidth()) && (slots.get(i).getSlotDepth()>vehicle.getVehicleDepth()))
               {
                   //the dimension of the vehicle is suitable
                   //print the slot number
                   System.out.println("Your slot is number "+(i+1));
                   //make the slot full
                   slots.get(i).setIsEmpty(false);
                   test=true;
                   break;
               }
            }  
        }
        //if the slot is unavilable
        if(!test)
        {
            //print no available slots
            System.out.println("No available slots");
        }
    }
}
