package project.battle.event;

import com.badlogic.gdx.math.Interpolation;

import project.battle.BATTLE_PARTY;
import project.pokemon.ui.DetailedStatusBox;
import project.pokemon.ui.HPBar;
import project.pokemon.ui.StatusBox;

public class HPAnimationEvent extends BattleEvent {

	private BATTLE_PARTY party;

	private int hpBefore;
	private int hpAfter;
	private int hpTotal;
	private float duration;

	private BattleEventPlayer eventPlayer;
	private float timer;
	private boolean finished;

	public HPAnimationEvent(BATTLE_PARTY party, int hpBefore, int hpAfter, int hpTotal, float duration) {
		this.party = party;
		this.hpBefore = hpBefore;
		this.hpAfter = hpAfter;
		this.hpTotal = hpTotal;
		this.duration = duration;
		this.timer = 0f;
		this.finished = false;
	}

	@Override
	public void update(float delta) {
		timer += delta;
		if (timer > duration) {
			finished = true;
		}

		float progress = timer / duration;
		float hpProgress = Interpolation.linear.apply(hpBefore, hpAfter, progress);
		float hpProgressRelative = hpProgress / hpTotal;

		HPBar hpbar = eventPlayer.getStatusBox(party).getHPBar();
		hpbar.displayHPLeft(hpProgressRelative);

		StatusBox statusBox = eventPlayer.getStatusBox(party);
		if (statusBox instanceof DetailedStatusBox) {
			((DetailedStatusBox) statusBox).setHPText((int) hpProgress, hpTotal);
		}
	}

	@Override
	public void begin(BattleEventPlayer player) {
		super.begin(player);
		this.eventPlayer = player;
	}

	@Override
	public boolean finished() {
		return finished;
	}

}
