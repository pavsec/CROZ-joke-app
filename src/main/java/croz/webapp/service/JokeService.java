package croz.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import croz.webapp.dao.JokeRepo;
import croz.webapp.model.Joke;

@Service
public class JokeService {
	
	@Autowired
    private JokeRepo jokeRepo;
	
	 public void insertJoke(Joke joke) {
		 jokeRepo.save(joke);
	 }
 
	 public List<Joke> listAll(){
		 return jokeRepo.findAll();
	 }
	 
	 public Optional<Joke> findById(Integer id){
		 return jokeRepo.findById(id);
	 }
}
