import java.util.ArrayList;


public class VideoLibrary {

	private String name;
	private ArrayList<User> users;
	private ArrayList<VCassette> cassettes;
	private ArrayList<Rent> rents;
	
	public VideoLibrary(String name) {
		this.name = name;
		this.users = new ArrayList<>();
		this.cassettes = new ArrayList<>();
		this.rents = new ArrayList<>();
	}
	
	public void createUser(String userName) {
		User user = new User(userName);
		users.add(user);
	}
	
	private void addVCassette(VCassette vhs) {
		cassettes.add(vhs);
	}
	
	public void addVCassette(String vsName, int vcDuration) {
		VCassette cassette = new VCassette(vsName, vcDuration);
		addVCassette(cassette);
	}
	
	public String getAllVHSinfo() {
		StringBuffer sb = new StringBuffer();
		for(VCassette currentItem : cassettes) {
			sb.append(currentItem.getName());
			sb.append(" - ");
			sb.append(currentItem.getDuration());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public ArrayList<VCassette> getAllVHS() {
		return cassettes;
	}
	
	private void takeVHS(VCassette cassette, User user) {
		Rent rent = new Rent(cassette, user);
		rents.add(rent);
	}
	
	//Returns TRUE if such user and cassette exist
	public boolean takeVHS(String cassette, String user) {
		User u = null;
		VCassette c = null;
		c = getVHSbyName(cassette);
		u = getUserByName(user);
		
		if(u != null && c != null) {
			Rent rent = new Rent(c, u);
			rents.add(rent);
			return true;
		}
		return false;
		
	}

	//Search list of users and return user with given name
	private User getUserByName(String userName) {
		for (User userOb : users) {
			if(userOb.getName().equals(userName)) {
				return userOb;
			}
		}
		return null;
	}

	private VCassette getVHSbyName(String cassetteName) {
		for (VCassette cas : cassettes) {
			if(cas.getName().equals(cassetteName)) {
				return cas;
			}
		}
		return null;
	}
	
	public void returnVHS(String cassetteName, String userName) {
		for(int i =0; i < rents.size(); i++) {
			Rent r = rents.get(i);
			if(r.getUser().getName().equals(userName) &&
					r.getCassette().getName().equals(cassetteName)) {
				rents.remove(r);
			}
		}
	}
	
	public String getAllOverdues() {
		StringBuffer sb = new StringBuffer();
		for(Rent r : rents) {
			if(r.isOverdue()) {
				sb.append(r.getUser().getName());
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	
	public void printRents() {
		for(Rent r  : rents) {
			System.out.println("VHS: " + r.getCassette().getName() + " - User: " + r.getUser().getName() + "\nTaken: " + r.getTimeTaken() + " Should return before: " + r.getTimeToReturn());
		}
	}
}
