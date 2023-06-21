package Main;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BestFitconf extends Configuration {
    public void bestfit(Vehicle vehicle,List<Slot> slots)
    {
    	//Vehicle vehicle=new Vehicle();
    	vehicle.info();
    	// variable to store the the fittest slot
        int min=1;
        Boolean test =false;
        //loop to access the list slots
        for(int i=0;i<slots.size();i++)
        {
            //see wether the slot is empty or not
            if(slots.get(i).getIsEmpty())
            {
                //the slot is empty
                //see wether the dimensions of the vehicle is suitable withe the dimensions of the slot
                if((slots.get(i).getSlotWidth()>vehicle.getVehicleWidth()) && (slots.get(i).getSlotDepth()>vehicle.getVehicleDepth()))
                {   
                    //the dimension of the vehicle is suitable
                    //see wether the last slot dimension is more suitable than this slot dimension or not
                    if((slots.get(min).getSlotWidth()>=slots.get(i).getSlotWidth())&&(slots.get(min).getSlotDepth()>=slots.get(i).getSlotDepth())) 
                    {
                        //put the best fit slot number in min
                        min=i;
                        //state that the slots is taken
                        slots.get(i).setIsEmpty(false);
                        test=true;
                    }
                }
            }
        }
        //if the car will park
        if (test)
        {
            //print the best fit slot nummber
            System.out.println("Your slot is number "+ (min+1));
        }
        // if not
        else
        {
            //print no available slot
            System.out.println("No availble slots");
        }
    }
}
