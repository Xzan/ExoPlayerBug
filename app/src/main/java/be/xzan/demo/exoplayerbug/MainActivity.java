package be.xzan.demo.exoplayerbug;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.vgWithTransition).setOnClickListener(this);
        findViewById(R.id.vgWithoutTransition).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.vgWithTransition:
                launchActivityWithTransition();
                break;
            case R.id.vgWithoutTransition:
                launchActivityWithoutTransition();
                break;
        }
    }

    private void launchActivityWithTransition() {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, findViewById(R.id.ivThumbnail), "thumbnail");
        startActivity(new Intent(this, PlayerActivity.class), options.toBundle());
    }

    private void launchActivityWithoutTransition() {
        startActivity(new Intent(this, PlayerActivity.class));
    }
}
