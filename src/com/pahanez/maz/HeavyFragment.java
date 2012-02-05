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

public class HeavyFragment extends Fragment implements OnClickListener {
	Button bHeavy45729amod, bHeavy55727mod;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.heavy_layout, container, false);
		bHeavy45729amod = (Button) v.findViewById(R.id.bHeavy45729);
		bHeavy55727mod = (Button) v.findViewById(R.id.bheavy55727);
		bHeavy45729amod.setOnClickListener(this);
		bHeavy55727mod.setOnClickListener(this);
		
		
		
		
		return v;
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bHeavy45729:
			final Intent i45729 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://maz.by/products/special_equipment/autocrane/1050/"));
			startActivity(i45729);
			break;
			
		case R.id.bheavy55727:
			final Intent i55727 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://maz.by/products/special_equipment/autocrane/1070/"));
			startActivity(i55727);
			break;

		default:
			break;
		}
		
	}

}
