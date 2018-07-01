package planet.it.limited.imageanimationandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation animation;
    ImageView imgTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTest = (ImageView)findViewById(R.id.img_test);
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.clock_wise);
//        animation.setInterpolator(new LinearInterpolator());
//        animation.setRepeatCount(Animation.INFINITE);
//        animation.setDuration(1000);

        imgTest.startAnimation(animation);

    }
}
