package edu.lemon.DemoInternetStore.scopes;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScopesController {
    @Resource(name = "requestScopeBean")
    HelloMessageGenerator requestScopedBean;

    @Resource(name = "sessionScopeBean")
    HelloMessageGenerator sessionScopedBean;

    @Resource(name = "applicationScopeBean")
    HelloMessageGenerator applicationScopedBean;

    @Resource(name = "websocketScopeBean")
    HelloMessageGenerator websocketScopedBean;

    @GetMapping("/scopes/request")
    public String getRequestScopesMessage(Model model) {
        model.addAttribute("previousMessage", requestScopedBean.getMessage());
        requestScopedBean.setMessage("Request Scope Message!");
        model.addAttribute("currentMessage", requestScopedBean.getMessage());
        return "/pages/index";
    }

    @GetMapping("/scopes/session")
    public String getSessionScopesMessage(Model model) {
        model.addAttribute("previousMessage", sessionScopedBean.getMessage());
        sessionScopedBean.setMessage("Session Scope Message!");
        model.addAttribute("currentMessage", sessionScopedBean.getMessage());
        return "/pages/index";
    }

    @GetMapping("/scopes/application")
    public String getApplicationScopesMessage(Model model) {
        model.addAttribute("previousMessage", applicationScopedBean.getMessage());
        applicationScopedBean.setMessage("Application Scope Message!");
        model.addAttribute("currentMessage", applicationScopedBean.getMessage());
        return "/pages/index";
    }

    @GetMapping("/scopes/websocket")
    public String getWebsocketScopedBeanScopesMessage(Model model) {
        model.addAttribute("previousMessage", websocketScopedBean.getMessage());
        websocketScopedBean.setMessage("Good afternoon!");
        model.addAttribute("currentMessage", websocketScopedBean.getMessage());
        return "/pages/index";
    }


}
