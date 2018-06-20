package pe.com.trujinet.deliver.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            //.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class)
        	.authorizeRequests()
                .antMatchers("/*").permitAll()
                .antMatchers("/app/**").authenticated()
            .and().formLogin()
            	.loginPage("/login.html").permitAll()
            .and().formLogin().usernameParameter("username")
            .and().formLogin().passwordParameter("password")
            .and().logout().logoutUrl("/logout.html").permitAll()
            	.logoutSuccessUrl("/index.html");
    }
	
	@Bean
    public UserDetailsService mongoUserDetails() {
        return new MongoUserDetailsService();
    }
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserDetailsService userDetailsService = mongoUserDetails();
        auth.userDetailsService(userDetailsService);
    }
}
