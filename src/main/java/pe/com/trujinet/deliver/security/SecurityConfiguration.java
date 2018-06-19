package pe.com.trujinet.deliver.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            //.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class)
        	.authorizeRequests()
                .antMatchers("/*").permitAll()
                .antMatchers("/app/**").authenticated()
            .and()
            .formLogin().loginPage("/login")
            .and()
            .logout().logoutUrl("/logout");
    }
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
          auth.inMemoryAuthentication()
          .withUser("temporary").password("temporary").roles("ADMIN")
          .and()
          .withUser("user").password("userPass").roles("USER");
    }
}
