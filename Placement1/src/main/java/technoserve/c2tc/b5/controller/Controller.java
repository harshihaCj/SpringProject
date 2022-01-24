package technoserve.c2tc.b5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import technoserve.c2tc.b5.Service.PlacementService;
import technoserve.c2tc.b5.entities.Placement;

@RestController
public class Controller {
	@Autowired
	PlacementService pr;
	@PostMapping("/addPlacement")
    public void addPlacement (@RequestBody Placement p) {
    	
    	pr.addPlacement(p);
    }
    
	@PutMapping("/updatePlacement")
    public void updatePlacement (@RequestBody Placement p) {
    	
    	pr.updatePlacement(p);
    }
    
	@DeleteMapping("/deletePlacement/{id}")
    public void cancelPlacement(@PathVariable int id) {
    pr.cancelPlacement(id);
    }
	
	@GetMapping("/getPlacement/{id}")
    public Placement getPlacement(@PathVariable int id) {
		
      return pr.getPlacement(id);
    }
    

}