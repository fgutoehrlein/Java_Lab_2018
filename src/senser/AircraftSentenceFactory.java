package senser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AircraftSentenceFactory
{
	public ArrayList<AircraftSentence> fromAircraftJson(String jsonAircraftString)
	{
	    ArrayList<AircraftSentence> jsonAircraftList = new ArrayList<AircraftSentence>();

	    Pattern regexPattern = Pattern.compile("\\{(.*?)\\}");
	    Matcher regexMatcher = regexPattern.matcher(jsonAircraftString);

	    while(regexMatcher.find()){
	        AircraftSentence am = new AircraftSentence(regexMatcher.group());
            jsonAircraftList.add(am);
        }

		//TODO: Get distinct aircrafts from the jsonAircraftString
		// and store them in an ArrayList
        return jsonAircraftList;
	}
}
