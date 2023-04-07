package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example")
// => Doesn't work when using @Bean to manually add data
public class AppConfig
{
    @Bean
    public Student stu()
    {
        Student stu = new Student();
        stu.setId(123);
        stu.setName("Waleed Qureshi");
        return stu;
    }

    @Bean
    public Address add()
    {
        Address add = new Address();
        add.setCity("New York");
        add.setState("New York");
        add.setCountry("United States");
        add.setZipcode("12345");
        return add;
    }

    @Bean
    public Phone ph1()
    {
        Phone ph = new Phone();
        ph.setMob("090078601");
        return ph;
    }
    @Bean
    public Phone ph2()
    {
        Phone ph = new Phone();
        ph.setMob("106870090");
        return ph;
    }
}
