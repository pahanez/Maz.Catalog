package com.pahanez.maz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;

public class TruckFragment extends Fragment implements OnClickListener {
	Button bTruck4471, bTruckF6517, bTruck6430a8, bTruck6430a5, bTruck5440a5,
			bTruck5440a8919, bTruck5433, bTruckF6425, bTruckF6317a,
			bTruckF6317b, bTruckF6425a, bTruckF5309, bTruckDS5340a8,
			bTruckDS4370, bTruckDS4371, bTruckDS5340a3, bTruckDS6310,
			bTruckDS6312a5, bTruckD6516, bTruckD6501, bTruckD5551, bTruckD5516,
			bTruckD4570, bTruckD5516a8, bTruckSH6516, bTruckSH6312,
			bTruckSH6310, bTruckSH6303, bTruckSH5551, bTruckSH5516;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		String[] types = getResources().getStringArray(R.array.types_array);
		View v = getActivity().getLayoutInflater().inflate(R.layout.main_truck,
				null);
		Spinner spinner = (Spinner) v.findViewById(R.id.spinner);

		ArrayAdapter adapter = new ArrayAdapter(getActivity(),
				android.R.layout.simple_list_item_1, types);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner.setAdapter(adapter);
		final ScrollView sv = (ScrollView) v.findViewById(R.id.svTruck);

		final View truckAct = getActivity().getLayoutInflater().inflate(
				R.layout.truckact, null);
		final View allWheelAct = getActivity().getLayoutInflater().inflate(
				R.layout.allwheeltruck, null);
		final View dropSideTruck = getActivity().getLayoutInflater().inflate(
				R.layout.dropsidetruck, null);
		final View dumpTruck = getActivity().getLayoutInflater().inflate(
				R.layout.dumptruck, null);
		final View chassisTruck = getActivity().getLayoutInflater().inflate(
				R.layout.chassistruck, null);

		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					sv.removeAllViews();
					sv.addView(truckAct);
					break;
				case 1:
					sv.removeAllViews();
					sv.addView(allWheelAct);
					break;
				case 2:
					sv.removeAllViews();
					sv.addView(dropSideTruck);
					break;
				case 3:
					sv.removeAllViews();
					sv.addView(dumpTruck);
					break;
				case 4:
					sv.removeAllViews();
					sv.addView(chassisTruck);
					break;

				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				// sv.addView(view1);

			}
		});
		spinner.setEnabled(true);

		// sv.addView(view1);
		bTruck4471 = (Button) truckAct.findViewById(R.id.bTruck4471details);
		bTruck4471.setOnClickListener(this);
		bTruck6430a5 = (Button) truckAct.findViewById(R.id.bTruck6430a5details);
		bTruck6430a5.setOnClickListener(this);
		bTruck6430a8 = (Button) truckAct.findViewById(R.id.bTruck6430a8details);
		bTruck6430a8.setOnClickListener(this);
		bTruck5440a5 = (Button) truckAct.findViewById(R.id.bTruck5440a5details);
		bTruck5440a5.setOnClickListener(this);
		bTruck5440a8919 = (Button) truckAct
				.findViewById(R.id.bTruck5440a8919details);
		bTruck5440a8919.setOnClickListener(this);
		bTruck5433 = (Button) truckAct.findViewById(R.id.bTruck5433details);
		bTruck5433.setOnClickListener(this);

		bTruckF6517 = (Button) allWheelAct
				.findViewById(R.id.bTruckF6517details);
		bTruckF6517.setOnClickListener(this);
		bTruckF6425 = (Button) allWheelAct
				.findViewById(R.id.bTruckF6425details);
		bTruckF6425.setOnClickListener(this);
		bTruckF6317a = (Button) allWheelAct
				.findViewById(R.id.bTruckF6317adetails);
		bTruckF6317a.setOnClickListener(this);
		bTruckF6317b = (Button) allWheelAct
				.findViewById(R.id.bTruckF6317bdetails);
		bTruckF6317b.setOnClickListener(this);
		bTruckF6425a = (Button) allWheelAct
				.findViewById(R.id.bTruckF6425adetails);
		bTruckF6425a.setOnClickListener(this);
		bTruckF5309 = (Button) allWheelAct
				.findViewById(R.id.bTruckF5309details);
		bTruckF5309.setOnClickListener(this);

		bTruckDS5340a8 = (Button) dropSideTruck
				.findViewById(R.id.bTruckDS5340a8details);
		bTruckDS5340a8.setOnClickListener(this);

		bTruckDS4370 = (Button) dropSideTruck
				.findViewById(R.id.bTruckDS4370details);
		bTruckDS4370.setOnClickListener(this);

		bTruckDS4371 = (Button) dropSideTruck
				.findViewById(R.id.bTruckDS4371details);
		bTruckDS4371.setOnClickListener(this);

		bTruckDS5340a3 = (Button) dropSideTruck
				.findViewById(R.id.bTruckDS5340a3details);
		bTruckDS5340a3.setOnClickListener(this);

		bTruckDS6310 = (Button) dropSideTruck
				.findViewById(R.id.bTruckDS6310details);
		bTruckDS6310.setOnClickListener(this);

		bTruckDS6312a5 = (Button) dropSideTruck
				.findViewById(R.id.bTruckDS6312a5details);
		bTruckDS6312a5.setOnClickListener(this);

		bTruckD6516 = (Button) dumpTruck.findViewById(R.id.bTruck6516details);
		bTruckD6516.setOnClickListener(this);

		bTruckD6501 = (Button) dumpTruck.findViewById(R.id.bTruck6501details);
		bTruckD6501.setOnClickListener(this);

		bTruckD5551 = (Button) dumpTruck.findViewById(R.id.bTruck5551details);
		bTruckD5551.setOnClickListener(this);

		bTruckD5516 = (Button) dumpTruck.findViewById(R.id.bTruck5516details);
		bTruckD5516.setOnClickListener(this);

		bTruckD4570 = (Button) dumpTruck.findViewById(R.id.bTruck4570details);
		bTruckD4570.setOnClickListener(this);

		bTruckD5516a8 = (Button) dumpTruck
				.findViewById(R.id.bTruck5516a8details);
		bTruckD5516a8.setOnClickListener(this);

		bTruckSH6516 = (Button) chassisTruck
				.findViewById(R.id.bTruckSH6516details);
		bTruckSH6516.setOnClickListener(this);

		bTruckSH6312 = (Button) chassisTruck
				.findViewById(R.id.bTruckSH6312details);
		bTruckSH6312.setOnClickListener(this);

		bTruckSH6310 = (Button) chassisTruck
				.findViewById(R.id.bTruckSH6310details);
		bTruckSH6310.setOnClickListener(this);

		bTruckSH6303 = (Button) chassisTruck
				.findViewById(R.id.bTruckSH6303details);
		bTruckSH6303.setOnClickListener(this);

		bTruckSH5551 = (Button) chassisTruck
				.findViewById(R.id.bTruckSH5551details);
		bTruckSH5551.setOnClickListener(this);

		bTruckSH5516 = (Button) chassisTruck
				.findViewById(R.id.bTruckSH5516details);
		bTruckSH5516.setOnClickListener(this);

		return v;
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.bTruckSH5516details:
			final Intent ish5516 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/chassis/960/"));
			startActivity(ish5516);
			break;
		case R.id.bTruckSH5551details:
			final Intent ish5551 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/chassis/970/"));
			startActivity(ish5551);
			break;
		case R.id.bTruckSH6303details:
			final Intent ish6303 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/chassis/980/"));
			startActivity(ish6303);
			break;
		case R.id.bTruckSH6310details:
			final Intent ish6310 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/chassis/990/"));
			startActivity(ish6310);
			break;
		case R.id.bTruckSH6312details:
			final Intent ish6312 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/chassis/1010/"));
			startActivity(ish6312);
			break;
		case R.id.bTruckSH6516details:
			final Intent ish6516 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/chassis/1020/"));
			startActivity(ish6516);
			break;
		case R.id.bTruck5516a8details:
			final Intent i5516a8 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/dump_vehicles/780/"));
			startActivity(i5516a8);
			break;
		case R.id.bTruck4570details:
			final Intent i4570 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/dump_vehicles/760/"));
			startActivity(i4570);
			break;
		case R.id.bTruck5516details:
			final Intent i5516 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/dump_vehicles/770/"));
			startActivity(i5516);
			break;
		case R.id.bTruck5551details:
			final Intent i5551 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/dump_vehicles/810/"));
			startActivity(i5551);
			break;
		case R.id.bTruck6501details:
			final Intent i6501 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/dump_vehicles/850/"));
			startActivity(i6501);
			break;
		case R.id.bTruck6516details:
			final Intent i6516 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/dump_vehicles/860/"));
			startActivity(i6516);
			break;
		case R.id.bTruckDS6312a5details:
			final Intent i6312a5 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/bortovie/750/"));
			startActivity(i6312a5);
			break;
		case R.id.bTruckDS6310details:
			final Intent i6310 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/bortovie/730/"));
			startActivity(i6310);
			break;
		case R.id.bTruckDS5340a3details:
			final Intent i5340a3 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/bortovie/690/"));
			startActivity(i5340a3);
			break;
		case R.id.bTruckDS4371details:
			final Intent i4371 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/bortovie/670/"));
			startActivity(i4371);
			break;
		case R.id.bTruckDS4370details:
			final Intent i4370 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/bortovie/650/"));
			startActivity(i4370);
			break;
		case R.id.bTruckDS5340a8details:
			final Intent i5340a8 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/bortovie/720/"));
			startActivity(i5340a8);
			break;
		case R.id.bTruck4471details:
			final Intent i447131 = new Intent(getActivity(), Truck447131.class);
			startActivity(i447131);
			break;
		case R.id.bTruck6430a5details:
			final Intent i6430a5 = new Intent(getActivity(), Truck6430a5.class);
			startActivity(i6430a5);
			break;

		case R.id.bTruckF6517details:
			final Intent i6517 = new Intent(getActivity(), Truck6517.class);
			startActivity(i6517);

			break;
		case R.id.bTruck6430a8details:
			final Intent i6430a8 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/tagachi/540/"));
			startActivity(i6430a8);
			break;
		case R.id.bTruck5440a5details:
			final Intent i5440a5 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/tagachi/510/"));
			startActivity(i5440a5);
			break;
		case R.id.bTruck5440a8919details:
			final Intent i5440a8919 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/tagachi/500/"));
			startActivity(i5440a8919);
			break;
		case R.id.bTruck5433details:
			final Intent i5433 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/tagachi/470/"));
			startActivity(i5433);
			break;
		case R.id.bTruckF6425details:
			final Intent i6425 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/polnoprivodnie/630/"));
			startActivity(i6425);
			break;
		case R.id.bTruckF6317adetails:
			final Intent i6317a = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/polnoprivodnie/600/"));
			startActivity(i6317a);
			break;
		case R.id.bTruckF6317bdetails:
			final Intent i6317b = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/polnoprivodnie/610/"));
			startActivity(i6317b);
			break;
		case R.id.bTruckF6425adetails:
			final Intent i6425a = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/polnoprivodnie/620/"));
			startActivity(i6425a);
			break;
		case R.id.bTruckF5309details:
			final Intent i5309 = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://maz.by/products/cargo_vehicle/polnoprivodnie/570/"));
			startActivity(i5309);
			break;
		}

	}

}
