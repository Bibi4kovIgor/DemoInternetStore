package edu.lemon.DemoInternetStore.scopes;

import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.dto.SuppliersDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ScopesConfig {

    @Bean
    @Scope("singleton")
    public Person personSingleton() {
        return new Person();
    }

    @Bean
    @Scope("prototype")
    public Person personPrototype() {
        return new Person();
    }

    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopeBean() {
        return new HelloMessageGenerator();
    }

    @Bean
    @SessionScope
    public HelloMessageGenerator sessionScopeBean() {
        return new HelloMessageGenerator();
    }

    @Bean
    @ApplicationScope
    public HelloMessageGenerator applicationScopeBean() {
        return new HelloMessageGenerator();
    }

    @Bean
    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public HelloMessageGenerator websocketScopeBean() {
        return new HelloMessageGenerator();
    }

}
