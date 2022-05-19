package state;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class StateAbbreviationMapper  implements StateAbbraviationservice{
	private HashMap<String, String> statemap;
private String [][] stateArray=
{{"Alabama","AL"},{"Alaska","AK"},{"Arizona","AZ"},{"Arkansas","AR"},
{"California","CA"},{"Colorado","CO"},{"Connecticut","CT"},{"Delaware","DE"},
{"Florida","FL"},{"Georgia","GA"},{"Hawaii","HI"},{"Idaho","ID"},
{"Illinois","IL"},{"Indiana","IN"},{"Iowa","IA"},{"Kansas","KS"},
{"Kentucky","KY"},{"Louisiana","LA"},{"Maine","ME"},{"Maryland","MD"},
};
 public StateAbbreviationMapper() {
statemap= new HashMap<String,String>();
for(String[]state:stateArray){
	statemap.put(state[0].toUpperCase(), state[1]);
}
}
	@Override
	public String findAbbreation(String statename) {
		// TODO Auto-generated method stub
		return(statemap.get(statename.toUpperCase()));
	}

}
