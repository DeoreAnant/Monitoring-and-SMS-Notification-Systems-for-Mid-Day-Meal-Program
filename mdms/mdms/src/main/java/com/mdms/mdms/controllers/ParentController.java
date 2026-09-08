package com.mdms.mdms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mdms.mdms.entites.Student;
import com.mdms.mdms.repositories.StudentRepository;
import com.mdms.mdms.service.ParentService;


@Controller
@RequestMapping("/parents")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @Autowired
    private StudentRepository studentRepository;


    @PostMapping("/verify-login")
    public String verifyParent(@RequestParam String email,
                                @RequestParam  String userName, org.springframework.ui.Model model,
                                RedirectAttributes redirectAttributes){

        System.out.println(email);
        // Parents parentByEmail = parentService.parentByEmail(email);
        

        Student student=studentRepository.findByStudentParentsEmail(email);
        if(student!=null){
            model.addAttribute("student", student);
            return "parents/dashboard";
        }
        redirectAttributes.addFlashAttribute("error", "Invalid Credentials or Parent Email not found!! try again");
        return "redirect:/parent-login";
    
    }

    @GetMapping("/dashboard")
    public String parentDashboard(){

        return "parents/dashboard";
    }
}
