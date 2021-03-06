package ch.open.arquillian.lab05.service;

import java.util.Set;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import ch.open.arquillian.lab05.domain.Beer;
import ch.open.arquillian.lab05.repository.BeerRepository;

@RequestScoped
public class BeerService {

    @Inject
    private BeerRepository beerRepository;

    public Beer getById(Long id) {
        return beerRepository.getById(id);
    }

    public Set<Beer> fetchAll() {
        return beerRepository.fetchAll();
    }

}
