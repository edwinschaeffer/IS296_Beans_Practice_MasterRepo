package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.example.controllers.DatabaseRepoImpl;
import com.example.controllers.FacebookImpl;
import com.example.controllers.TwitterImpl;
import com.example.vo.IPRange;

@SpringBootApplication
@ComponentScan("com.example")
@ImportResource("classpath:beans.xml")
public class DemoSpringBeansConfig {

	/*
	@Bean
	public FacebookImpl getFB(@Qualifier("getIPRLocal") IPRange ipRange, DatabaseRepoImpl dbr) {
		System.out.println(ipRange.getLowerIPRange());
		return new FacebookImpl(ipRange, dbr);
	}
	*/
	@Bean
	@Scope("protoype")
	public TwitterImpl getTWTR() {
		String accountId = "1234";
		return new TwitterImpl(accountId);
	}
	
	@Bean
	@Qualifier("myIPR")
	public IPRange getIPR() {
		IPRange ipr = new IPRange();
		ipr.setLowerIPRange("0.0.0.0");
		ipr.setUpperIPRange("255.255.255.255");
		return ipr;
	}
	@Bean
	public IPRange getIPRLocal() {
		IPRange ipr = new IPRange();
		ipr.setLowerIPRange("127.0.0.1");
		ipr.setUpperIPRange("127.0.0.255");
		return ipr;
	}

	/*
	@Bean
	public DatabaseRepoImpl getDBRepo() {
		DatabaseRepoImpl dbr = new DatabaseRepoImpl();
		dbr.setIPRange(getIPR());
		return dbr;
	} */
}
