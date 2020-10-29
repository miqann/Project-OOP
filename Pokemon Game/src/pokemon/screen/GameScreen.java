package pokemon.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pokemon.Pokemon;
import pokemon.Setting;
import pokemon.controller.PlayerController;
import pokemon.model.Player;

public class GameScreen extends AbstractScreen {

	private PlayerController controller;
	private Texture RedStand;
	private SpriteBatch batch;
	private Player player;
	
	public GameScreen(Pokemon app) {
		super(app);
		RedStand = new Texture("Red.png");
		batch = new SpriteBatch();
		player = new Player(5, 5);
		controller = new PlayerController(player);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		batch.begin();
		batch.draw(RedStand, 
				player.getX()*Setting.SCALE_TITLE_SIZE
				,player.getY()*Setting.SCALE_TITLE_SIZE
				, Setting.SCALE_TITLE_SIZE
				, Setting.SCALE_TITLE_SIZE);
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(controller);
	}

		
}
