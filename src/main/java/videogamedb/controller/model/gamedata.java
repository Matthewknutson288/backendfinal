package videogamedb.controller.model;

import java.util.HashSet;
import java.util.Set;

import javax.tools.DocumentationTool.Location;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogamedbentity.game;
import videogamedbentity.genres;

@Data
@NoArgsConstructor
public class gamedata {
	private Long gameid;
	private String Mario;
	private String Sonic;
	private String Zelda;
	private String FinalFantasy;
	private String Metroid;
	private Set<genresdata> genres = new HashSet<>();

	public gamedata (genres genres) {
		this.gameid = game.getgameid();
		this.Mario = game.getMario();
		this.Sonic = game.getSonic();
		this.Zelda = game.getZelda();
		this.FinalFantasy = game.getFinalFantasy();
		this.Metroid = game.getMetroid();
		
		for(game game : game.getgame()) {
			this.gameid.add(new genresdata (game));
		}

	public gamedata(Long gameid, String Mario, String Sonic, String Zelda, String FinalFantasy, String Metroid) 
	this.gameid = gameid;
	this.Mario = Mario;
	this.Sonic = Sonic;
	this.Zelda =Zelda;
	this.FinalFantasy = FinalFantasy;
	this.Metroid = Metroid;{
	}
	
	public class genresdata {

	}
}
