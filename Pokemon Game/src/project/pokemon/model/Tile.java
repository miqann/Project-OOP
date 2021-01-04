package project.pokemon.model;

import project.pokemon.model.actor.Actor;
import project.pokemon.model.world.WorldObject;
import project.pokemon.worldloader.LTerrain;

public class Tile {

	private LTerrain terrain;
	private WorldObject object;
	private Actor actor;

	private boolean walkable = true;

	public Tile(LTerrain terrain) {
		this.terrain = terrain;
	}

	public void setTerrain(LTerrain terrain) {
		this.terrain = terrain;
	}

	public void setWalkable(boolean walkable) {
		this.walkable = walkable;
	}

	public LTerrain getTerrain() {
		return terrain;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public WorldObject getObject() {
		return object;
	}

	public void setObject(WorldObject object) {
		this.object = object;
	}

	public boolean walkable() {
		return walkable;
	}

	/**
	 * Fires when an Actor steps on the Tile. Called when the Actor is just about
	 * finished with his/her step.
	 */
	public void actorStep(Actor a) {

	}

	public boolean actorBeforeStep(Actor a) {
		return true;
	}
}
