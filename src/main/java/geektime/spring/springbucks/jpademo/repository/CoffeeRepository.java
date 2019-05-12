package geektime.spring.springbucks.jpademo.repository;

import geektime.spring.springbucks.jpademo.model.Coffee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2019/5/5.
 */
public interface CoffeeRepository extends CrudRepository<Coffee, Long>{

}
