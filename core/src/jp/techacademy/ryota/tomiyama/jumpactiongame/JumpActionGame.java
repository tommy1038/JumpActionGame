package jp.techacademy.ryota.tomiyama.jumpactiongame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {

	// publicにして外からアクセスできるようにする
	public SpriteBatch batch;
	public ActivityRequestHandler mRequestHandler;

//	Texture img;

	public JumpActionGame(ActivityRequestHandler requestHandler) {
		super();
		mRequestHandler = requestHandler;
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");

		// GameScreenを表示する
		setScreen(new GameScreen(this));
	}

//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
	
	@Override
	public void dispose () {
		batch.dispose();
//		img.dispose();
	}
}
