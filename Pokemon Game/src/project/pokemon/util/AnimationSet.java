package project.pokemon.util;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import project.pokemon.model.DIRECTION;

/**
 * A set of TextureRegions and Animations that can be applied to an Actor.
 * 
 * @author hydrozoa
 */
public class AnimationSet {
	
	private Map<DIRECTION, Animation> walking;
	private Map<DIRECTION, Animation> running;
	private Map<DIRECTION, TextureRegion> standing;
	private Map<DIRECTION, Animation> biking;
	
	public AnimationSet(Animation walkNorth, 
			Animation walkSouth, 
			Animation walkEast, 
			Animation walkWest, 
			TextureRegion standNorth, 
			TextureRegion standSouth, 
			TextureRegion standEast, 
			TextureRegion standWest) {
		walking = new HashMap<DIRECTION, Animation>();
		walking.put(DIRECTION.NORTH, walkNorth);
		walking.put(DIRECTION.SOUTH, walkSouth);
		walking.put(DIRECTION.EAST, walkEast);
		walking.put(DIRECTION.WEST, walkWest);
		standing = new HashMap<DIRECTION, TextureRegion>();
		standing.put(DIRECTION.NORTH, standNorth);
		standing.put(DIRECTION.SOUTH, standSouth);
		standing.put(DIRECTION.EAST, standEast);
		standing.put(DIRECTION.WEST, standWest);
	}
	
	public void addBiking(Animation bikeNorth, Animation bikeSouth, Animation bikeEast, Animation bikeWest) {
		biking = new HashMap<DIRECTION, Animation>();
		biking.put(DIRECTION.NORTH, bikeNorth);
		biking.put(DIRECTION.SOUTH, bikeSouth);
		biking.put(DIRECTION.EAST, bikeEast);
		biking.put(DIRECTION.WEST, bikeWest);
	}
	
	public void addRunning(Animation runNorth, Animation runSouth, Animation runEast, Animation runWest) {
		running = new HashMap<DIRECTION, Animation>();
		running.put(DIRECTION.NORTH, runNorth);
		running.put(DIRECTION.SOUTH, runSouth);
		running.put(DIRECTION.EAST, runEast);
		running.put(DIRECTION.WEST, runWest);
	}
	
	public Animation getBiking(DIRECTION dir) {
		return biking.get(dir);
	}
	
	public Animation getRunning(DIRECTION dir) {
		return running.get(dir);
	}
	
	public Animation getWalking(DIRECTION dir) {
		return walking.get(dir);
	}
	
	public TextureRegion getStanding(DIRECTION dir) {
		return standing.get(dir);
	}

}
