package com.student.ExploreYourCity.controller;

import com.student.ExploreYourCity.dao.StateRepository;
import com.student.ExploreYourCity.dao.InstitutesRepository;
import com.student.ExploreYourCity.entities.State;
import com.student.ExploreYourCity.entities.Institutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    InstitutesRepository institutesRepository;

    @Autowired
    StateRepository stateRepository;

    @ResponseBody
    @RequestMapping( "/search/{query}")
    public List<Institutes> search(@PathVariable("query") String query, Model model){
        System.out.println(query);
        List<Institutes> institutesList = this.institutesRepository.findByNameContaining(query);
        model.addAttribute("searchResult", institutesList);
        return institutesList;
    }

    @ResponseBody
    @RequestMapping("/search/state/{query}")
    public List<State> searchstate(@PathVariable("query") String query, Model model){
        System.out.println(query);
        List<State> state = this.stateRepository.findByStateNameContaining(query);
        model.addAttribute("searchResult", state);
        return state;
    }

//    @ResponseBody
//    @RequestMapping( "/search/name/{id}")
//    public Optional<University> search(@PathVariable("id") Integer id, Model model){
//        System.out.println(id);
//        Optional<University> universityList = this.institutesRepository.findById(id);
//        model.addAttribute("searchResult", universityList);
//        return universityList;
//    }

}
