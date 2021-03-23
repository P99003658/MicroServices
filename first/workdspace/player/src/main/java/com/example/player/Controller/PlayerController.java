package com.example.player.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.player.dao.PlayerDao;
import com.example.player.model.Player;
@RestController
public class PlayerController {
	
		@Autowired
		PlayerDao pd;
		@RequestMapping("/players")
		public List<Player> getPlayers()
		{
			return pd.getAllPlayers();
		}
}

