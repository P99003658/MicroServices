package com.example.team.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.team.dao.TeamDao;
import com.example.team.model.Team;



	@RestController
	public class TeamController {
		@Autowired
		TeamDao td;
		@RequestMapping("/teams")
		public List<Team> getTeams()
		{
			return td.getAllTeams();
		}
}
