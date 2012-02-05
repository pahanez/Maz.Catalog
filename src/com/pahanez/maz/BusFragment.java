package com.pahanez.maz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class BusFragment extends Fragment implements OnClickListener {
	Button bus241,bus231,bus205,bus103,bus256,bus251,bus226,bus203,bus206,bus171,bus152,bus107,bus105;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.bus_layout, container, false);
		bus241 = (Button) v.findViewById(R.id.bAdd241);
		bus241.setOnClickListener(this);
		bus231 = (Button) v.findViewById(R.id.bAdd231);
		bus231.setOnClickListener(this);
		bus205 = (Button) v.findViewById(R.id.bAdd205);
		bus205.setOnClickListener(this);
		bus103 = (Button) v.findViewById(R.id.bAdd103);
		bus103.setOnClickListener(this);
		bus256 = (Button) v.findViewById(R.id.bAdd256);
		bus256.setOnClickListener(this);
		bus251 = (Button) v.findViewById(R.id.bAdd251);
		bus251.setOnClickListener(this);
		bus226 = (Button) v.findViewById(R.id.bAdd226);
		bus226.setOnClickListener(this);
		bus203 = (Button) v.findViewById(R.id.bAdd203);
		bus203.setOnClickListener(this);
		bus206 = (Button) v.findViewById(R.id.bAdd206);
		bus206.setOnClickListener(this);
		bus171 = (Button) v.findViewById(R.id.bAdd171);
		bus171.setOnClickListener(this);
		bus152 = (Button) v.findViewById(R.id.bAdd152);
		bus152.setOnClickListener(this);
		bus107 = (Button) v.findViewById(R.id.bAdd107);
		bus107.setOnClickListener(this);
		bus105 = (Button) v.findViewById(R.id.bAdd105);
		bus105.setOnClickListener(this);
		
		return v;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bAdd105:
			final Intent iBus105 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/378/"));
			startActivity(iBus105);
			break;
		case R.id.bAdd107:
			final Intent iBus107 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/379/"));
			startActivity(iBus107);
			break;
		case R.id.bAdd152:
			final Intent iBus152 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/381/"));
			startActivity(iBus152);
			break;
		case R.id.bAdd171:
			final Intent iBus171 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/382/"));
			startActivity(iBus171);
			break;
		case R.id.bAdd206:
			final Intent iBus206 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/385/"));
			startActivity(iBus206);
			break;
		case R.id.bAdd203:
			final Intent iBus203 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/384/"));
			startActivity(iBus203);
			break;
		case R.id.bAdd226:
			final Intent iBus226 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/386/"));
			startActivity(iBus226);
			break;
		case R.id.bAdd251:
			final Intent iBus251 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/387/"));
			startActivity(iBus251);
			break;
		case R.id.bAdd256:
			final Intent iBus256 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/388/"));
			startActivity(iBus256);
			break;
		case R.id.bAdd103:
			final Intent iBus103 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/390/"));
			startActivity(iBus103);
			break;
		case R.id.bAdd205:
			final Intent iBus205 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/1330/"));
			startActivity(iBus205);
			break;
		case R.id.bAdd231:
			final Intent iBus231 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/1340/"));
			startActivity(iBus231);
			break;
			
		case R.id.bAdd241:
			final Intent iBus241 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maz.by/products/passenger_vehicle/1350/"));
			startActivity(iBus241);
			break;

		default:
			break;
		}
	}

}
