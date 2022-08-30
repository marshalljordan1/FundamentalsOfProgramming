
public class User {
	private String name; 
	String membership;
	
	public String toString() {
		return get_name() + " " + get_membership();
	}
	
	public User(String name, String membership) {
		set_name(name);
		set_membership(membership);
	}

	void set_name(String name) {
		this.name = name;
	}
	
	String get_name() {
		return  name;
	}
	
	void set_membership(String membership) {
	this.membership = membership;
	}
	
	void set_membership(Membership membership) {
		this.membership = membership.name();
	}
	
	public enum Membership {
		Bronze, Silver, Gold;
	}

	
	String get_membership() {
		return membership;
	}
}