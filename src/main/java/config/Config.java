/*
 *
 * @author: Emil Gajęcki
 * @github: http://github.com/emilgajecki
 * @linkedin: http://linkedin.com/in/emil-gajecki
 *
 */

package config;

import api.IOrder;
import api.IPizza;
import impl.MyOrder;
import impl.MyPizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    IPizza myPizza(){
        return new MyPizza();
    }

    @Bean
    IOrder myOrder(){
        return new MyOrder();
    }
}
