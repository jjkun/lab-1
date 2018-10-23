package mx.com.cloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public List<Team> getTeams(){
		return (List<Team>)teamRepository.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getTeam(@PathVariable String id){
		return teamRepository.findById(Long.parseLong(id)).get();
	}


}
