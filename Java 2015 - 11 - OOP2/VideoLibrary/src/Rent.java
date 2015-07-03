import java.util.Date;


public class Rent {

	//Constant for five days in milliseconds
	public static long FIVE_DAYS_MILLIS = 
			5 * 24 * 60 * 60 * 1000;
	//Fields
	private VCassette cassette;
	private User user;
	private Date timeTaken;
	private Date timeToReturn;
	
	//Constructor
	public Rent(VCassette cassette, User user) {
		this.cassette = cassette;
		this.user = user;
		this.timeTaken = new Date();
		this.timeToReturn = new Date(timeTaken.getTime() 
				+ FIVE_DAYS_MILLIS);
	}

	public VCassette getCassette() {
		return cassette;
	}

	public User getUser() {
		return user;
	}

	public Date getTimeTaken() {
		return timeTaken;
	}

	public Date getTimeToReturn() {
		return timeToReturn;
	}

	//Extends the return time
	public void addMoreTimeToReturn(int days) {
		this.timeToReturn = new Date
				(timeToReturn.getTime() 
						+ days * 24 * 60 * 60 * 1000);
	}
	
	//Checks if the cassette is overdue
	public boolean isOverdue() {
		Date now = new Date();
		if(now.after(timeToReturn)) {
			return true;
		}
		return false;
	}
	
	

}
