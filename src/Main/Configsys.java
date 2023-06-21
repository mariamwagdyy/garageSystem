package Main;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Configsys {
	private int choice;

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int choose()
	{
		 Scanner obj=new Scanner(System.in);
	        //choosing the configuration of parking
	        System.out.println("Please enter the method number to park");
	        System.out.println("1- First come");
	        System.out.println("2- Best fit approach");
	        int num=obj.nextInt();
	        if((num!=1)&&(num!=2))
	        {
	            System.out.println("There isn't such method");
	        }
	        
	        setChoice(num);
	        return(getChoice());
	}
}
