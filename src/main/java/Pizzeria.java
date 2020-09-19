import api.IOrder;
import api.IPizza;
import impl.MyOrder;
import impl.MyPizza;


public class Pizzeria {
    public static void main(String[] args) {

        //to jest konfig programu
        IPizza pizza = new MyPizza();
        IOrder order = new MyOrder(pizza);

        //logika biznesowa
    }
}
