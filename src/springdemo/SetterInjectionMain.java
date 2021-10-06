package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean from Spring container
        CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
        //call method on the bean
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getDailyWorkout());

        //calling our literals methods
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close the context
    }
}
