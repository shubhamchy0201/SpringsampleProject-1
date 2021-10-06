package springdemo;

public class BaseBallCoach implements Coach{
    //Declare private field for dependency
    private FortuneService fortuneService;

    //defining constructor for dependency injection

    public BaseBallCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return "spend 30 minutes on batting practice";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
