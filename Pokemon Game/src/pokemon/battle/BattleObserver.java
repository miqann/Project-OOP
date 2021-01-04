package pokemon.battle;

import pokemon.battle.event.BattleEvent;

/**
 * Objects can implement this interface and subscribe to a {@link Battle}.
 */
public interface BattleObserver {
	public void queueEvent(BattleEvent event);
}
