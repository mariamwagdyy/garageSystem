package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Park implements ParkingGarage {
	public int Arivtime;
	public int Deptime;
	public int totaltime;
	public int fees;
	public int totalIncome;
	public int numvehicles;
	List<Slot> slots = new ArrayList<Slot>();
		private int noOfSlots;
		public int Numvehicles;
	  public Park(List<Slot> slots) {
	        this.slots = slots;
	        this.noOfSlots = slots.size();
	       
	    }
	  public Park(){}
	public void parkin(Vehicle vehicle)
	    { 
		  
	    	
	        Configsys config =new Configsys();
	        int num = config.choose();
	        arrivaltime ariv =new arrivaltime();
	        switch (num) {
	            case 1:
	            	FirstComeconf first=new FirstComeconf();
	            	first.firstcome(vehicle,slots);
	            	Arivtime=ariv.calculateTime();
	            	numvehicles++;
	            	break;
	            case 2:
	            	BestFitconf best=new BestFitconf();
	                best.bestfit(vehicle,slots);
	                Arivtime=ariv.calculateTime();
	                numvehicles++;
	
	                break;
	        }
	    }
	  public void parkout()
	  {
		  Deptime Dep=new Deptime();
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter your number of slot");
		  int slotno= scan.nextInt();
		  slots.get(slotno-1).setIsEmpty(true);
		  Deptime=Dep.calculateTime();	
		  numvehicles--;
		  totaltime=Deptime-Arivtime;
		  System.out.println("The total time taken is "+totaltime);
		  fees=totaltime*5;
		  System.out.println("The total fees is "+fees+" L.E");	
		  totalIncome=totalIncome+fees;
	  }
	  public void calcincome()
	  {
		  //totalIncome=totalIncome+fees;
		  System.out.println("The total income is "+totalIncome);
	  }
	 
}
