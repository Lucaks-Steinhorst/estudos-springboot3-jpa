package LucasSteinhorst.AulaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import LucasSteinhorst.AulaSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
