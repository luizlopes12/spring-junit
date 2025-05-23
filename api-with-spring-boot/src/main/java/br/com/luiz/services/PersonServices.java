package br.com.luiz.services;

import br.com.luiz.models.Person;
import br.com.luiz.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServices {
    @Autowired
    PersonRepository repository;

    public List<Person> findAll(){
        return repository.findAll();
    }
}
