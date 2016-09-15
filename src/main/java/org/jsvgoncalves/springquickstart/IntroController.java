package org.jsvgoncalves.springquickstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
