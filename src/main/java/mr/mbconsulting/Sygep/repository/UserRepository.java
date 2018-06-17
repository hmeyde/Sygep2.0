package mr.mbconsulting.Sygep.repository;

import mr.mbconsulting.Sygep.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String userName);
}
