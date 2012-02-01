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

//        image = (ImageView) findViewById(R.id.imageLogo);
//    
//        anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
//        final Intent i = new Intent(this, MainMaz.class);
//        anim.setAnimationListener(new AnimationListener() {
//			
//			@Override
//			public void onAnimationStart(Animation animation) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onAnimationRepeat(Animation animation) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onAnimationEnd(Animation animation) {
//				// TODO Auto-generated method stub
//				startActivity(i);
//			}
//		});
//        image.startAnimation(anim);
        
        
       

		Thread timer = new Thread(){
		public void run(){
			try{
				sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
				finish();
				startActivity(i);
			}
		}	
		};
		timer.start();

    }
}