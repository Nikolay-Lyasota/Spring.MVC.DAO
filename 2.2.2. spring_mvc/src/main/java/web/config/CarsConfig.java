package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CarsConfig {

    @Bean
    @Order(1)
    public Car car1() {
        return new Car("car1",100,9.2);
    }
    @Bean
    @Order(2)
    public Car car2() {
        return new Car("car2",99,8.9);
    }
    @Bean
    @Order(3)
    public Car car3() {
        return new Car("car3",200,20.2);
    }
    @Bean
    @Order(4)
    public Car car4() {
        return new Car("car4",50,3.1);
    }
    @Bean
    @Order(5)
    public Car car5() {
        return new Car("car5",500,40.1);
    }
}
