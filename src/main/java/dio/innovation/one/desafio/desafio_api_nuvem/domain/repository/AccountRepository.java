package dio.innovation.one.desafio.desafio_api_nuvem.domain.repository;

import dio.innovation.one.desafio.desafio_api_nuvem.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
