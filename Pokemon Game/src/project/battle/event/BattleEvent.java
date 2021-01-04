package project.battle.event;

public abstract class BattleEvent {

	private BattleEventPlayer player;

	public void begin(BattleEventPlayer player) {
		this.player = player;
	}

	public abstract void update(float delta);

	public abstract boolean finished();

	protected BattleEventPlayer getPlayer() {
		return player;
	}
}
