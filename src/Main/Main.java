package Main;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException  
    {
    	
        //take the input from input file
        File file = new File("D:\\UNI\\Year 2\\2nd term\\Software\\ass\\project\\garageSystem\\src\\Main\\Input" );
        Scanner sc = new Scanner(file);
        //change it from string to integer
        List<Integer> numbers = new ArrayList<Integer>();
        //to continue taking inputs from file until the lines finish 
        while (sc.hasNextLine())
        {
            String noOfSLots=sc.nextLine();
            int n=Integer.valueOf(noOfSLots);
            //add the numbers to the list after being integer
            numbers.add(n);
        }
        //the number of slots is the first element
        Integer numOfSlots = numbers.get(0);
        List<Slot> slots = new ArrayList<Slot>();
        int j=1;
        //loop to access slots
        for(int i = 0; i < numOfSlots; i++)
        { 
            //odd values of j is the width
            int width = numbers.get(j);
            //even values of j is the depth
            int depth = numbers.get(j+1);
            //add the width and depth of each slot to its slot
            Slot newSlot = new Slot(width, depth);
            slots.add(newSlot);
            //icrement the j by 2 to access the next width
            j+=2;
        }
        Scanner scan=new Scanner(System.in);
        int method=0;
        Screen view= new Display(slots);
        Park vec =new Park(slots);
        Vehicle vehicle = new Vehicle();
        //choosing which function he wants to use
        while (method!=6) {
            System.out.println("please enter the number of the method you want to do");
            System.out.println("1-display available slots");
            System.out.println("2-park in");
            System.out.println("3-park out");
            System.out.println("4-Total Number of vehicles");
            System.out.println("5-Total income");
            System.out.println("6-Exit");
            method = scan.nextInt();
            if((method!=1)&&(method!=2)&&(method!=3)&&(method!=4)&&(method!=5)&&(method!=6))
            {
                System.out.println("You entered a wrong number please re-enter it");
                method = scan.nextInt();
            }
            switch (method)
            {
			// case 1 to display all available slots
			case 1:
				view.display();
				break;
			// case 2 to park a vehicle inside the garage
			case 2:
				vec.parkin(vehicle);
				break;
			case 3:
				vec.parkout();
				break;
			case 4:
				System.out.println("Number of vehicles is: "+ vec.numvehicles);
				break;
			case 5:
				vec.calcincome();
				break;
			case 6:
				System.out.println("You exit successfully");
				break;
			}
            
        }
    }
}