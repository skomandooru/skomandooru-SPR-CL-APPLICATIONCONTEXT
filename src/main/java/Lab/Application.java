package Lab;

import Lab.Beans.ElectricEngine;
import Lab.Beans.GasEngine;
import Lab.Beans.NuclearEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is the Configuration class for this spring project - there are three beans, electricPoweredBean,
 * nuclearPoweredBean, and gasPoweredBean which are defined in this class, and they are based off of their respective
 * classes in the
 */
@Configuration
public class Application {
    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(Application.class);
    }
    @Bean
    public ElectricEngine electricPoweredBean(){
        return new ElectricEngine();
    }
    @Bean
    public NuclearEngine nuclearPoweredBean(){
        return new NuclearEngine();
    }
    @Bean
    public GasEngine gasPoweredBean(){
        return new GasEngine();
    }
}
