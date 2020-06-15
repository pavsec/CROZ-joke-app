package croz.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import croz.webapp.model.Joke;

public interface JokeRepo extends JpaRepository<Joke, Integer> {

}
