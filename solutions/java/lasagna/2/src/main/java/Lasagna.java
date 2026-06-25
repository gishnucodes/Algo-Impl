public class Lasagna {

    final int EXPECTED_TIME_IN_OVEN = 40;
    final int TIME_PER_LAYER = 2;
    // TODO: define the 'expectedMinutesInOven()' method

    
    public int expectedMinutesInOven(){
        return EXPECTED_TIME_IN_OVEN;
    }

    
    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int actualMinInOven){
        return expectedMinutesInOven()-actualMinInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        return TIME_PER_LAYER*numberOfLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers,int actualMinInOven){
        return preparationTimeInMinutes(numberOfLayers)+actualMinInOven;
    }
}
