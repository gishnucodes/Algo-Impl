
class BirdWatcher {
    private final int[] birdsPerDay;
    private static int[] birdsLastWeek = new int[]{0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        int len = birdsPerDay.length;
        return birdsPerDay[len-1];
    }

    public void incrementTodaysCount() {
        int len = birdsPerDay.length;
        int incrementedVal = getToday()+1;
        birdsPerDay[len-1]=incrementedVal;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdcount : birdsPerDay){
            if(birdcount==0){
                return true;
            }
        }
    return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays>=birdsPerDay.length){
            for(int i=0;i<birdsPerDay.length;i++){
            sum = birdsPerDay[i]+sum;
        }
            return sum;
        }else {
            for(int i=0;i<numberOfDays;i++){
            sum = birdsPerDay[i]+sum;
        }
        return sum;
        }
           
    }

    public int getBusyDays() {
        int busyDaysSum = 0;
        for (int birds : birdsPerDay){
            if(birds>=5){
                busyDaysSum=busyDaysSum+1;
            }
        }
        return busyDaysSum;
    }
}
