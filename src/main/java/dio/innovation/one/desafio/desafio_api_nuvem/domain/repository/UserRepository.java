package dio.innovation.one.desafio.desafio_api_nuvem.domain.repository;

import dio.innovation.one.desafio.desafio_api_nuvem.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
