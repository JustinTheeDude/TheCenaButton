package dogdays.com.johncenabutton;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class rootActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);



        final MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.drawable.cena);
        final ImageButton image = (ImageButton) findViewById(R.id.HLR);
        image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                     song.start();

                        }
                    break;
                    case MotionEvent.ACTION_UP:
                   {

                       try {
                           if(song.isPlaying()) {

                                song.stop();
                               song.prepare();
                           }
                       }catch (IOException e){
                           e.printStackTrace();
                       }
                        }


                    break;

            }
                return false;
                }





                });







    }


}

