package bgm.models;

import java.util.ArrayList;
import java.util.List;

public class Support extends Champions {
	
	public String type;
	private static List<Support> sups = new ArrayList<>();

	public Support(String name,String type) {
		super(name);
		this.type = type;
		sups.add(this);
		// TODO Auto-generated constructor stub
	}
	
	public static List<Support> getSups() {
		return sups;
	}
	
	
	
	
	 
	}


