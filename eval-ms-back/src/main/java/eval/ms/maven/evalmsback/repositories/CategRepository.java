package eval.ms.maven.evalmsback.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eval.ms.maven.evalmsback.Models.CategModel;

@Repository
public interface CategRepository extends CrudRepository<CategModel, Long>{
	
	
}