package Main;

import java.time.LocalDateTime;

public class arrivaltime extends Time{
	private int arrivalTime;
    public arrivaltime()
    {
    	arrivalTime=0;
    }
    public void setarrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public int getarrivalTime() {
        return this.arrivalTime;
    }
    public int calculateTime()
    {
    	LocalDateTime now=LocalDateTime.now();
		int arr_hour = now.getSecond();
		setarrivalTime(arr_hour);
    	return getarrivalTime();
    }
}
