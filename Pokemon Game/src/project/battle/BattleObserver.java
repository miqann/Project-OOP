package project.battle;

import project.battle.event.BattleEvent;

public interface BattleObserver {
	
	public void queueEvent(BattleEvent event);
}
