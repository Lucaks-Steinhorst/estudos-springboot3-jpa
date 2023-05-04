package LucasSteinhorst.AulaSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LucasSteinhorst.AulaSpringBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Mario", "mario@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u); 
	}
}