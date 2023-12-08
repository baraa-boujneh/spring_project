package org.horizonefele.webMVC;
import org.horizonefele.webMVC.dao.TeamRepository;
import org.horizonefele.webMVC.entities.Team;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringMvcApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringMvcApplication.class, args);
		TeamRepository teamDao = ((BeanFactory) ctx).getBean(TeamRepository.class);
				teamDao.save(new Team("Avenir Sportif de Lala", new Float(45000)));
				teamDao.save(new Team("Club Olympique de Transport", new Float(60000)));
				teamDao.save(new Team("Stir Sportif Jarzouna", new Float(40000)));
				// Adding other teams
				teamDao.findAll().forEach(t->System.out.println(t.getName())); 
		
	}

}
