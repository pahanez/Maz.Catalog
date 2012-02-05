package com.pahanez.maz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.Window;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Truck447131 extends FragmentActivity implements OnClickListener {
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.truck447131);
		b = (Button) findViewById(R.id.bTruck447131zakaz);
		b.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://maz.by/products/cargo_vehicle/tagachi/1320/"));

		startActivity(browserIntent);

	}

}
