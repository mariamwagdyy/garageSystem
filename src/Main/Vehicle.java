package Main;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle
{
    protected String modelName;
    protected int ID;
    protected int modelYear;
    protected int vehicleWidth;
    protected int vehicleDepth;
    public Vehicle[] Info;
   //default constructor 
    public Vehicle()
    {
        modelName="0";
        ID=0;
        modelYear=0;
        vehicleWidth=0;
        vehicleDepth=0;
        Info = new Vehicle[10];
    }
    //parametrized constructor take all vehicle details as a parameters
    public Vehicle(String modelName, int ID,int modelYear,int vehicleWidth,int vehicleDepth)
    {
        this.modelName=modelName;
        this.ID=ID;
        this.modelYear=modelYear;
        this.vehicleWidth=vehicleWidth;
        this.vehicleDepth=vehicleDepth;
    }
    //setter for model name
    public void setModelName(String modelName)
    {
        this.modelName=modelName;
    }
    //setter for model year
    public void setModelYear(int modelYear)
    {
        this.modelYear=modelYear;
    }
    //setter for the vehicle id
    public void setID(int ID)
    {
        this.ID=ID;
    } 
    //setter for the vehicle width
    public void setVehicleWidth(int vehicleWidth)
    {
        this.vehicleWidth= vehicleWidth;
    }
    //setter for the vehicle depth
    public void setVehicleDepth(int vehicleDepth)
    {
        this.vehicleDepth= vehicleDepth;
    }
    //getter for the model name
    public String getModelName()
    {
        return  this.modelName;
    } 
    //getter for the model year
    public int getModelYear()
    {
        return  this.modelYear;
    }
    // getter for the id
    public int getID()
    {
        return  this.ID;
    }
    //getter for the vehicle width
    public int getVehicleWidth()
    {
        return  this.vehicleWidth;
    }
    //getter for the vehicle depth
    public int getVehicleDepth()
    {
        return  this.vehicleDepth;
    }
    //function takes all the details of the vehicle
    public Vehicle info() 
    {
        int i = 0;
        //if counter less than the slot number
        if (i < 10) 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the model name:");
            modelName = scan.nextLine();
            System.out.println("Please enter the ID:");
            ID = scan.nextInt();   
            System.out.println("Please enter the model year:");
            modelYear = scan.nextInt();
            // to check the model year 
            if (modelYear < 1672 || modelYear > 2022) 
            { 
                System.out.println("Invalid model year!!");
                System.out.println("Please enter the model year:");
                modelYear = scan.nextInt();
            }
            System.out.println("Please enter the vehicle width:");
            vehicleWidth = scan.nextInt();
            //to check the vehicle width
            if (vehicleWidth < 0 || vehicleWidth == 0) { 
                System.out.println("Invalid vehicle width");
                System.out.println("Please enter a correct vehicle width:");
                vehicleWidth = scan.nextInt();
            }
            System.out.println("Please enter the vehicle depth:");
            vehicleDepth = scan.nextInt();
            //to check the vehicle depth
            if (vehicleDepth < 0 || vehicleDepth == 0) { 
                System.out.println("Invalid vehicle depth");
                System.out.println("Please enter a correct vehicle depth:");
                vehicleDepth = scan.nextInt();
            }
            i++;
            //store the vehicle details
            Info[i] = new Vehicle(modelName, ID ,modelYear,vehicleWidth,vehicleDepth);
            
            
        }
        //if the garage is full
         else 
        {
            System.out.println("There is no empty parking slot.Garage is full. ");
        }
        //retur the vehicle details
        return Info[i];
    }
}