package config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.controllers.DatabaseRepoImpl;
import com.example.controllers.FacebookImpl;
import com.example.controllers.TwitterImpl;
import com.example.vo.IPRange;

@SpringBootApplication
public class DemoSpringBeansConfig {

	@Bean
	public FacebookImpl getFB(IPRange ipRange, DatabaseRepoImpl dbr) {
		return new FacebookImpl(ipRange, dbr);
	}
	
	@Bean
	public TwitterImpl getTWTR() {
		String accountId = "1234";
		return new TwitterImpl(accountId);
	}
	
	@Bean
	public DatabaseRepoImpl getDB() {
		return new DatabaseRepoImpl();
	}
	
	@Bean
	public IPRange getIPR() {
		IPRange ipr = new IPRange();
		ipr.setLowerIPRange("0.0.0.0");
		ipr.setUpperIPRange("255.255.255.255");
		return ipr;
	}
}
