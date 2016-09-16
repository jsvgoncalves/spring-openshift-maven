package org.jsvgoncalves.springquickstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jgoncalv on 9/13/16.
 */
@Controller
public class IntroController {

    @RequestMapping(value = "/")
    public String index() {
        return "intro/index";
    }

    @RequestMapping(value = "/intro/{name}")
    public String intro(Model model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        return "intro/hello";
    }

    @RequestMapping(value = "/api/greeting", produces = "application/json")
    @ResponseBody
    public String greeting() {
        return "[{\"author\": \"John\", \"text\": 1, \"timestamp\": 2}]";
    }

    @RequestMapping(value = "/api/greeting", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public String greetingPOST() {
        return "[{\"author\": \"John\", \"text\": 1, \"timestamp\": 2},{\"author\": \"ASd\", \"text\": 1, \"timestamp\": 223}]";
    }

}
