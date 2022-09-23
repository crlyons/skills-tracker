package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
        public String languages(){
        return  "<h1>Skills Tracker</h1>" +
                "<h2>List of Skills:</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>C#</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<form method='POST'>" +
                "Name:<br>" +
                "<input type= 'text' name='name'>" +
                "<br>My Favorite Language:<br>" +
                "<select name= 'firstChoice'>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='C#'>C#</option>" +
                "</select>\n" +
                "<br>My Second Favorite Language:<br>" +
                "<select name= 'secondChoice'>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='C#'>C#</option>" +
                "</select>\n" +
                "<br>My Least Favorite Language:<br>" +
                "<select name= 'lastChoice'>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='C#'>C#</option>" +
                "</select>\n" +
                "<br>" +
                "<input type='submit' value='submit'/>" +
                "</form>";
    }
    @PostMapping("form")
        public String namePage(String name, String firstChoice, String secondChoice, String lastChoice){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + lastChoice + "</li>" +
                "</ol>";
    }

}
