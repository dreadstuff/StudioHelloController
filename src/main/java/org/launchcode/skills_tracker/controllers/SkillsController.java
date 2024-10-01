package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping

public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String homeText() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> Python </li>" +
                "<li> Ruby </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "/favorites", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @PostMapping("/form")
    public String submitForm(@RequestParam String name,
                             @RequestParam String favorite,
                             @RequestParam String secondFavorite,
                             @RequestParam String thirdFavorite){
        return "<html>" +
                "<style>table, th, td {border:1px solid black;}</style>" +
                "<body>" +
                "<table>" +
                "<tr>" +
                "<th><h1>" + name + "</h1></th>" +
                "</tr>" +
                "<ol>" +
                "<tr><td><li>" + favorite + "</li></td></tr>" +
                "<tr><td><li>" + secondFavorite + "</li></td></tr>" +
                "<tr><td><li>" + thirdFavorite + "</li></td></tr>" +
                "</ol>" +
                "</table>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("/form")
    @ResponseBody
    public String homeForm() {
        return "<html>" +
                "<body>" +
                "<b>Name:</b>" +
                "<form action='/favorites' method='get'>" +
                "<input type='text' name='name' /><br>" +
                "<label for='languages'><b> My favorite language:</b></label><br>" +
                "<select id='languages' name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br>" +
                "<label for='languages'><b> My second favorite language:</b></label><br>" +
                "<select id='languages' name='secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br>" +
                "<label for='languages'><b> My third favorite language:</b></label><br>" +
                "<select id='languages' name='thirdFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br>" +
                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
