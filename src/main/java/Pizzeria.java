import api.IOrder;
import api.IPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Pizzeria {
    public static void main(String[] args) {

        //to jest konfig programu
        //IPizza pizza = new MyPizza();
        //IOrder order = new MyOrder(pizza);

        //Rozwiazanie w springu z konfig z xml
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        //MyOrder order = context.getBean("myOrder", MyOrder.class);



        //logika biznesowa
        order.printOrder();
    }
}
