package com.pahanez.maz;

import java.util.List;

import android.location.Address;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

public class CountingFragment extends Fragment {
	int mNum;

	/**
	 * Create a new instance of CountingFragment, providing "num" as an
	 * argument.
	 */
	/*
	 * static CountingFragment newInstance(int num) { CountingFragment f = new
	 * CountingFragment();
	 * 
	 * // Supply num input as an argument. Bundle args = new Bundle();
	 * args.putInt("num", num); f.setArguments(args);
	 * 
	 * return f; }
	 */

	/**
	 * When creating, retrieve this instance's number from its arguments.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// mNum = getArguments() != null ? getArguments().getInt("num") : 1;

	}

	/**
	 * The Fragment's UI is just a simple text view showing its instance number.
	 */
	View v;
	ScrollView sv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		v = inflater.inflate(R.layout.spinner_layout, container, false);

		Spinner spinner = (Spinner) v.findViewById(R.id.spinner);
		sv = (ScrollView) v.findViewById(R.id.svSpinner);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, getResources()
						.getStringArray(R.array.types_array));
		spinner.setAdapter(adapter);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					Toast.makeText(arg0.getContext(), "Тягачи",
							Toast.LENGTH_LONG).show();
					break;
				case 1:
					Toast.makeText(arg0.getContext(), "Полноприводные",
							Toast.LENGTH_LONG).show();
					break;
				case 2:
					Toast.makeText(arg0.getContext(), "Бортовые",
							Toast.LENGTH_LONG).show();
					break;
				case 3:
					Toast.makeText(arg0.getContext(), "Самосвалы",
							Toast.LENGTH_LONG).show();
					break;
				case 4:
					Toast.makeText(arg0.getContext(), "Шасси",
							Toast.LENGTH_LONG).show();
				
					
					v = getActivity().getLayoutInflater().inflate(R.layout.bus_layout, null);
					
					sv.addView(v);
					break;

				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(arg0.getContext(), "Тягачи", Toast.LENGTH_LONG)
						.show();
			}
		});
		// tl.setOnClickListener(this);
		// tl.setOnTouchListener(this);

		// View tv = v.findViewById(R.id.lin);
		// ((TextView)tv).setText("Fragment #" + mNum);
		// tv.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.gallery_thumb));
		return v;
	}

	// @Override
	// public void onClick(View v) {
	// // TODO Auto-generated method stub
	//
	// Log.e("tag1", "Button pressed");
	//
	//
	// }
	//
	// @Override
	// public boolean onTouch(View v, MotionEvent event) {
	// // TODO Auto-generated method stub
	//
	// Log.e("tag1", "Button pressed");
	//
	// return false;
	// }
}