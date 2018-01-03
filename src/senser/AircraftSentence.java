package senser;

public class AircraftSentence
{
	//TODO: Create attributes

    private String aircraft;
	//TODO: Create constructor

    public AircraftSentence(String aircraft){
        this.aircraft=aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
    //TODO: Create relevant getter methods

    public String getAircraft() {
        return aircraft;
    }


    //TODO: Overwrite toString() method to print sentence

    @Override
    public String toString() {
        return getAircraft();
    }
}
