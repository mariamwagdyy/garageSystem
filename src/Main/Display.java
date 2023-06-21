package Main;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display implements Screen {
	private int noOfSlots;
	List<Slot> slots = new ArrayList<Slot>();
	public Display(List<Slot> slots)
	   {
	       this.slots=slots;
	       this.noOfSlots=slots.size();
	   }
	
	@Override
	    public void display() {
		System.out.println(slots.size());
	        for(int i=0 ; i<slots.size() ; i++)
	        {
	            // see wether the slot is empty or not
	            if(slots.get(i).getIsEmpty())
	            {
	                //if slot is empty
	                //print the slot no 
	                System.out.println("Slot Number: " + (i+1) );
	                //print the slot width and depth
	                slots.get(i).displayDimentions();
	            }
	        } 
	    }
}
