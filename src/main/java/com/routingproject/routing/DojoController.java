package com.routingproject.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
    @RequestMapping("{p}")
    public String coding(@PathVariable("p") String pa){
    	if (pa.equals("dojo")) {
        	return "The dojo is awesome!";
    	}
    	else if (pa.equals("burbank-dojo")) {
    		return "Burbank Dojo is located in Southern California";
		}
    	else if (pa.equals("san-jose")) {
    		return "SJ dojo is the headquarters";
		}
    	else {
    		return "Nothing !";
    	}
    	

    }
}
