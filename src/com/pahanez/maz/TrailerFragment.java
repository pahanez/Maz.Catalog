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

public class TrailerFragment extends Fragment implements OnClickListener {
	Button bTrailer975800_3010_3012s,bTrailer975800_3014_3016s;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.trailer_layout, container, false);
		bTrailer975800_3010_3012s = (Button) v.findViewById(R.id.bTrailer9758003010);
		bTrailer975800_3014_3016s = (Button) v.findViewById(R.id.bTrailer9758003014);
		bTrailer975800_3010_3012s.setOnClickListener(this);
		bTrailer975800_3014_3016s.setOnClickListener(this);
		
		
		
		return v;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bTrailer9758003010:
			final Intent i9758003010 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://maz.by/products/trailers/1290/"));
			startActivity(i9758003010);
			break;
			
		case R.id.bTrailer9758003014:
			final Intent i9758003014 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://maz.by/products/trailers/1300/"));
			startActivity(i9758003014);
			break;

		default:
			break;
		}
		
	}

}
