package id.ac.prisma.siapmobilebackend.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/Greatings"})
public class UserGreetings {
    @RequestMapping(value = "/goodmorning", method = RequestMethod.POST, produces = "application/json")
    public Map goodmorning(@RequestBody Map bodyRequest) {
        String name = (String) bodyRequest.get("name");
        Map response = new HashMap();
        response.put("message", "Good Morning " + name);
        return response;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST, produces = "application/json")
    public Map welcome(@RequestBody Map bodyRequest) {
        String name = () bodyRequest.get("name");
        Map response = new StringHashMap();
        response.put("message", "Welcome to Prisma University, " + name);
        return response;
    }
}
