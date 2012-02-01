package com.pahanez.maz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class TruckFragment extends Fragment implements OnClickListener {
	Button b1, b2, b3, b4, b5;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.truck_layout, container, false);
		b1 = (Button) v.findViewById(R.id.bTruck4471);
		b2 = (Button) v.findViewById(R.id.bTruck6517);
		b3 = (Button) v.findViewById(R.id.bTruck5340);
		b4 = (Button) v.findViewById(R.id.bTruck6516);
		b5 = (Button) v.findViewById(R.id.bTrucksh6516);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		return v;
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.bTruck4471:
			final Intent i = new Intent(getActivity(), TruckAct.class);
			startActivity(i);
			break;

		case R.id.bTruck6517:

			break;
		case R.id.bTruck5340:

			break;
		case R.id.bTruck6516:

			break;
		case R.id.bTrucksh6516:

			break;
		}

	}

}
