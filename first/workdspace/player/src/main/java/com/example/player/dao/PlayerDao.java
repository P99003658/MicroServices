package com.example.player.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.player.model.Player;


@Repository
public class PlayerDao {
		public List<Player> getAllPlayers()
		{
			List<Player> li=new ArrayList<Player>();
			li.add(new Player(1,"Dhoni","AP"));
			li.add(new Player(2,"Virat","K"));
			return li;
			
		}

}
