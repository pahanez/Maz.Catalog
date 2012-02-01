package com.pahanez.maz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.Window;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class TruckAct extends FragmentActivity implements OnClickListener {
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.truckact);
		b1 = (Button)findViewById(R.id.bTruck4471det);
		b1.setOnClickListener(this);

	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bTruck4471det:
			Intent i1 = new Intent(this, Truck447131.class );
			startActivity(i1);
			break;

		default:
			break;
		}
		
	}

}
