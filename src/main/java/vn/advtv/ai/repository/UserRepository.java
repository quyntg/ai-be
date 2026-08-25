package vn.advtv.ai.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import vn.advtv.ai.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
    List<Users> findAll();
    @Override
    default <S extends Users> S save(S entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    void deleteById(Integer id);
}
