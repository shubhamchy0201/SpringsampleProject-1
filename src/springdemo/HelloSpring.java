package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       //Retrieve bean from spring container
        Coach thecoach=context.getBean("mycoach",Coach.class);
        //call the method
        System.out.println(thecoach.getDailyWorkout());

        //Call new method for fortune
        System.out.println(thecoach.getFortune());
        context.close();
    }
}
