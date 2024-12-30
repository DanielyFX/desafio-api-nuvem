package dio.innovation.one.desafio.desafio_api_nuvem.service;

import dio.innovation.one.desafio.desafio_api_nuvem.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
