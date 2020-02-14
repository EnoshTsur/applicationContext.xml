package spring1.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring1.sp.entities.Person;

@SpringBootApplication
public class SpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class, args);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Person jojo = context.getBean("jojo", Person.class);
        Person halastra = context.getBean("halastra", Person.class);
        System.out.println(jojo);
        System.out.println(halastra);
    }

}
