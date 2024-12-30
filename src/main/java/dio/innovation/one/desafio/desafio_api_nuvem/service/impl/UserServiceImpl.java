package dio.innovation.one.desafio.desafio_api_nuvem.service.impl;

import dio.innovation.one.desafio.desafio_api_nuvem.domain.model.User;
import dio.innovation.one.desafio.desafio_api_nuvem.domain.repository.UserRepository;
import dio.innovation.one.desafio.desafio_api_nuvem.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number already exists");

        }
        return userRepository.save(userToCreate);
    }
}
