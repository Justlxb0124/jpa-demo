package geektime.spring.springbucks.jpademo.repository;

import geektime.spring.springbucks.jpademo.model.CoffeeOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2019/5/5.
 */
public interface CoffeeOrderRepository extends CrudRepository<CoffeeOrder,Long>{
}
