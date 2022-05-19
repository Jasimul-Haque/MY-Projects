package state;

import java.io.Serializable;

public class Satepair implements Serializable {
	public Satepair(String stateName, String stateabbreviation) {
		
		this.stateName = stateName;
		this.stateabbreviation = stateabbreviation;
	}

	private final String stateName, stateabbreviation;

	public String getStateName() {
		return stateName;
	}
 
	public String getStateabbreviation() {
		return stateabbreviation;
	}

}
