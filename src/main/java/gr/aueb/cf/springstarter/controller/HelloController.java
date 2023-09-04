package gr.aueb.cf.springstarter.controller;

import gr.aueb.cf.springstarter.dto.StudentInsertDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/hello-app")
public class HelloController {
//    @RequestMapping(path = "/coding-factory", method = RequestMethod.GET)
    @GetMapping("/hello-world")
    public String getHello(){
        return "index";
    }

    @GetMapping("/get-date")
    public  String getDate(Model model){
      model.addAttribute("dateTxt", new Date());
      return "date";
    }

    @GetMapping("/messages")
    public String getMessage(@RequestParam("title") String title, Model model){
        if(title.equals("CF")){
            model.addAttribute("message", "Hello CF");
            return "message";
        }else {
            model.addAttribute("msg", "There is an error in request param");
            return "error";
        }
    }

    @RequestMapping(path = "/student/insert", method = RequestMethod.GET)
    public String getStudentForm(Model model){
        model.addAttribute("studentInsertDto", new StudentInsertDTO());
        return "student/insert";
    }

    @RequestMapping(path = "/student/insert", method = RequestMethod.POST)
    public String insertStudent(@ModelAttribute("studentInsertDto") StudentInsertDTO dto, Model model){
        model.addAttribute("dto", dto);
        return "student/success";
    }

}
