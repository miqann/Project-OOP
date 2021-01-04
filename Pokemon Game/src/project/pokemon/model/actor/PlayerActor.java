package project.pokemon.model.actor;

import project.pokemon.model.world.World;
import project.pokemon.model.world.cutscene.CutscenePlayer;
import project.pokemon.util.AnimationSet;

public class PlayerActor extends Actor {

	private CutscenePlayer cutscenePlayer;

	public PlayerActor(World world, int x, int y, AnimationSet animations, CutscenePlayer cutscenePlayer) {
		super(world, x, y, animations);
		this.cutscenePlayer = cutscenePlayer;
	}

	public CutscenePlayer getCutscenePlayer() {
		return cutscenePlayer;
	}
}
