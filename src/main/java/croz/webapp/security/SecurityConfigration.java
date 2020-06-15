package croz.webapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfigration extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure (AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
			.withUser("iivic")
			.password(passwordEncoder().encode("ivan"))
			.roles("USER")
			.and()
			.withUser("pperic")
			.password(passwordEncoder().encode("pero"))
			.roles("USER");
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/inputJoke").hasRole("USER")
			.antMatchers("/", "/home", "/listJokes").permitAll()
			.and().formLogin();
	}

}
