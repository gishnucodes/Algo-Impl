public class CarsAssemble {

    final int RATE = 221;
    public double productionRatePerHour(int speed) {
        try{
        
        if(speed >= 1 && speed <=4){
           return (double)(RATE*speed);
        }
        else if(speed >=5 && speed <=8){
            return (double)(RATE*speed*0.90);
        }
        else if(speed == 9){
            return (double)(RATE*speed*0.80);
        }
        else if(speed == 10){
            return (double)(RATE*speed*0.77);
        } 
        else{
            return 0;
        }        }
    
        catch(Exception e){
            throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        }
    }

    public int workingItemsPerMinute(int speed) {

    try{
        return (int)(productionRatePerHour(speed)/60);
    }
      
    catch(Exception e){
        throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
    }
}
