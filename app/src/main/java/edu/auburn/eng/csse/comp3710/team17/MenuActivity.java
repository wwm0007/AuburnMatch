package edu.auburn.eng.csse.comp3710.team17;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);

    }

    public void runClassicGame(View view) {
        Intent intent = new Intent(this, MemoryGame.class);
        intent.putExtra("mode", 1);
        startActivity(intent);
    }

    public void runTimedGame(View view) {
        Intent intent = new Intent(this, MemoryGame.class);
        intent.putExtra("mode", 2);
        startActivity(intent);
    }
}
