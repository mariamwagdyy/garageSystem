package Main;

import java.time.LocalDateTime;

public class Deptime extends Time {
	private int depTime;
	public Deptime()
    {
		depTime=0;
    }
	public void setdepTime(int depTime) {
        this.depTime = depTime;
    }
	public int getdepTime() {
        return this.depTime;
    }
	public int calculateTime()
    {
    	LocalDateTime now=LocalDateTime.now();
		int dep_hour = now.getSecond();
		setdepTime(dep_hour);
    	return getdepTime() ;
    }
}
