package kz.mn.front.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/requests")
    public String getRequests(){
        return "requests";
    }

    @GetMapping("/requests/{id}")
    public String getRequest(@PathVariable long id){
        return "request";
    }
}
