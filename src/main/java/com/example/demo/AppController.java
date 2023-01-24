package com.example.demo;

import com.example.demo.Components.Adres;
import com.example.demo.Components.Sekretariat;
import com.example.demo.Components.Uczniowie;
import com.example.demo.DAO.AdresDAO;
import com.example.demo.DAO.SekretariatDAO;
import com.example.demo.DAO.UczniowieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Configuration
public class AppController implements WebMvcConfigurer {


        @Autowired
        public AdresDAO daoAdres;
        @Autowired
        public SekretariatDAO daoSekretariat;
        @Autowired
        public UczniowieDAO daoUczen;

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/adres_list").setViewName("admin/adres_list");
        registry.addViewController("/sekretariat_list").setViewName("admin/sekretariat_list");
        registry.addViewController("/main_user").setViewName("user/main_user");
    }

    @Controller
    public class DashboardController {


        @RequestMapping("/main")
        public String defaultAfterLogin(HttpServletRequest request) {
            if (request.isUserInRole("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if (request.isUserInRole("USER")) {
                return "redirect:/main_user";
            }
            else {
                return "redirect:/index";
            }
        }
        @RequestMapping(value={"/main_admin"})
        public String showAdminPage(Model model) {
            return "admin/main_admin";
        }

        @RequestMapping(value={"/main_user"})
        public String showUserPage(Model model) {
            return "user/main_user";
        }

        @RequestMapping(value= {"/adres_list"})
        public String showAdres(Model model){

            List<Adres> Adres = daoAdres.list();
            model.addAttribute("Adres", Adres);

            return "admin/adres_list";
        }

        @RequestMapping(value= {"/sekretariat_list"})
        public String showSekretariat(Model model){

            List<Sekretariat> XD = daoSekretariat.list();
            model.addAttribute("Sekretariat", XD);

            return "admin/sekretariat_list";
        }
        @RequestMapping(value = {"/ucznowie_list"})
        public String showUczen(Model model){
            List<Uczniowie> Uczen = daoUczen.list();
            model.addAttribute("Uczen", Uczen);
            return "admin/ucznowie_list";
        }
        @RequestMapping(value = {"/uczniowie_add"})
        public String showUczenAdd(Model model){
            Uczniowie uczen = new Uczniowie();
            model.addAttribute("uczen", uczen);

            return "admin/uczniowie_add";
        }
        @RequestMapping(value = "/save",method = RequestMethod.POST)
        public String saveUczen(@ModelAttribute("uczen") Uczniowie uczen){
            daoUczen.save(uczen);
            return "redirect:/ucznowie_list";
        }
    }
}
