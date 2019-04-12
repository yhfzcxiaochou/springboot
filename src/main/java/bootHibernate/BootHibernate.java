package bootHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "bootHibernate.dao")
@EntityScan(basePackages = "bootHibernate")
public class BootHibernate {
	 public static void main(String[] args) {
	        SpringApplication.run(BootHibernate.class, args);
	 }
}
