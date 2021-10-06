package springdemo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }

    //Add init method
    public void initialStuff()
    {
        System.out.println("TrackCoach class: Inside initialStuff method");
    }

    //adding destroy method

    public void cleanupStuff()
    {
        System.out.println("TrackCoach class: Inside cleanupStuff method");
    }
}
