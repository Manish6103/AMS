package com.firstproject.app.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.firstproject.app.modules.State;
import com.firstproject.app.services.CountryService;
import com.firstproject.app.services.StateService;

@Controller
public class StateController {
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	
	//Get All States
	@GetMapping("/state")
	public String findAll(Model model){		
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("countries", countryService.getCountries());
		return "state";
	}	
	
	@RequestMapping("states/findById") 
	@ResponseBody
	public Optional<State> findById(Integer id)
	{
		return stateService.findById(id);
	}
	
	//Add State
	@PostMapping(value="states/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/state";
	}	
	
//	@RequestMapping(value="states/update", method = {RequestMethod.PUT, RequestMethod.GET})
//	public String update(State state) {
//		stateService.save(state);
//		return "redirect:/state";
//	}
//	
//	@RequestMapping(value="states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
//	public String delete(Integer id) {
//		stateService.delete(id);
//		return "redirect:/state";
//	}
}
