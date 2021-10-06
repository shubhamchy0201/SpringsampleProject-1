package springdemo;

public class CricketCoach implements Coach{
    private  FortuneService fortuneService;

    private String emailAddress;
    private String team;
    public CricketCoach()
    {
        System.out.println("In CricketCoach class constructor");
    }
    //setter method

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside FortuneService setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside emailAddress setter method");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside team  setter method");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 25 minutes.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
