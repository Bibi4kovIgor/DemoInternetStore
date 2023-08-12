package edu.lemon.DemoInternetStore.scopes;

public class HelloMessageGenerator {
    private String message;

//    @Bean
//    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public HelloMessageGenerator requestScopeBean() {
//        return new HelloMessageGenerator();
//    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
