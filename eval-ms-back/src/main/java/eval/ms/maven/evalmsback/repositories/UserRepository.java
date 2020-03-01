package eval.ms.maven.evalmsback.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eval.ms.maven.evalmsback.Models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
	
	public UserModel findByEmail(String email);
	
	public Optional<UserModel> findByEmailAndPassword(String email, String password);
	
}
