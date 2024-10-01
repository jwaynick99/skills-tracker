package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String landing(){
        return "<h1>Skills Controller</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</h2>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                    "<body>" +
                        "<form action='individual' method='post'>" +
                            "<label>Name</name>" + //submits requests to /hello
                            "<input type='text' name='name'>" +
                            "<div>" +
                "<label>First favorite Language</label><br>" +
                            "<select name='firstLanguage' id='language-select'>" +
                                "<option value=''>*Select*</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='C++'>C++</option>" +
                                "<option value='C#'>C#</option>" +
                                "<option value='Rust'>Rust</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                "</div>" + "<div>" +
                            "<label>Second favorite Language</label><br>" +
                            "<select name='secondLanguage' id='language-select'>" +
                                "<option value=''>*Select*</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='C++'>C++</option>" +
                                "<option value='C#'>C#</option>" +
                                "<option value='Rust'>Rust</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" + "</div>" + "<div>" +
                            "<label>Second favorite Language</label><br>" +
                            "<select name='thirdLanguage' id='language-select'>" +
                                "<option value=''>*Select*</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='C++'>C++</option>" +
                                "<option value='C#'>C#</option>" +
                                "<option value='Rust'>Rust</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" + "</div>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("/individual")
    @ResponseBody
    public String fillForm(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<h1>" + name + "</h1>" +
                "<h2>" +
                "<table>" +
                    "<tr>" +
                        "<th>Favorite Language</th>" +
                        "<th>Second Favorite</th>" +
                        "<th>Third Favorite</th>" +
                    "</tr>" +
                    "<tr>" +
                        "<th>" + firstLanguage + "</th>" +
                        "<th>" + secondLanguage + "</th>" +
                        "<th>" + thirdLanguage + "</th>" +
                    "</tr>" +
                "</h2>";
    }
}
