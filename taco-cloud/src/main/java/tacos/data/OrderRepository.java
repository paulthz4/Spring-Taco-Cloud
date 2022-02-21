//package tacos.data;
//
//import tacos.Order;
//
//public interface OrderRepository {
//	Order save(Order order);
//}

package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
//	List<Order> findByDeliveryZip(String deliveryZip);
	
}