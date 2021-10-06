package springdemo;

public class MyApp {
    public static void main(String[] args) {
        //create object
       //Coach coach=new BaseBallCoach();
        Coach coach=new TrackCoach();

        //call method
        System.out.println(coach.getDailyWorkout());
    }
}
