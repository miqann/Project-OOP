package project.battle;

import java.util.ArrayList;
import java.util.List;

import project.pokemon.model.Pokemon;

/**
 * @author hydrozoa
 */
public class Trainer {
	
	private List<Pokemon> team;
	
	public Trainer(Pokemon pokemon) {
		team = new ArrayList<Pokemon>();
		team.add(pokemon);
	}
	
	public boolean addPokemon(Pokemon pokemon) {
		if (team.size() >= 6) {
			return false;
		} else {
			team.add(pokemon);
			return true;
		}
	}
	
	public Pokemon getPokemon(int index) {
		return team.get(index);
	}
	
	public int getTeamSize() {
		return team.size();
	}
}
