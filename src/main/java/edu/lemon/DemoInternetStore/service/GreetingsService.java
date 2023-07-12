package edu.lemon.DemoInternetStore.service;

import com.google.gson.Gson;
import edu.lemon.DemoInternetStore.annotations.LogExecutionTime;
import edu.lemon.DemoInternetStore.aspects.LogExecutionTimeAspect;
import edu.lemon.DemoInternetStore.data.Data;
import edu.lemon.DemoInternetStore.model.Greeting;
import edu.lemon.DemoInternetStore.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GreetingsService {
    private static final Logger LOG = LoggerFactory.getLogger(LogExecutionTimeAspect.class);

    @LogExecutionTime
    public String greet(User user){
        Gson gson = new Gson();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            LOG.error(e.getMessage());
        }
        return gson.toJson(new Greeting(user, Data.GREETINGS.get(0).getMessage()), Greeting.class);
    }
}
