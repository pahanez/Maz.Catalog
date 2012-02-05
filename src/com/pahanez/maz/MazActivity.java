package com.pahanez.maz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MazActivity extends FragmentActivity {
    /** Called when the activity is first created. */
	Animation anim;
	ImageView image;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      final Intent i = new Intent(this, MainMaz.class);
		Thread timer = new Thread(){
		public void run(){
			try{
				sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
				
				startActivity(i);
				finish();
			}
		}	
		};
		timer.start();

    }
}