package project.battle.event;

import com.badlogic.gdx.graphics.Texture;

import aurelienribon.tweenengine.TweenManager;
import project.battle.BATTLE_PARTY;
import project.battle.animation.BattleAnimation;
import project.pokemon.ui.DialogueBox;
import project.pokemon.ui.StatusBox;

public interface BattleEventPlayer {

	public void playBattleAnimation(BattleAnimation animation, BATTLE_PARTY party);

	public void setPokemonSprite(Texture region, BATTLE_PARTY party);

	public DialogueBox getDialogueBox();

	public StatusBox getStatusBox(BATTLE_PARTY party);

	public BattleAnimation getBattleAnimation();

	public TweenManager getTweenManager();

	public void queueEvent(BattleEvent event);
}
