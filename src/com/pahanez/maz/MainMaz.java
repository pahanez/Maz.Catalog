package com.pahanez.maz;

import android.R.anim;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.Menu;
import android.support.v4.view.MenuItem;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class MainMaz extends FragmentActivity {
	TabHost th;
	TabSpec trucks, buses, trailers, heavy;

	ViewPager mViewPager;
	TabsAdapter mTabsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabspager);

		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		ActionBar.Tab tab1 = getSupportActionBar().newTab().setIcon(
				R.drawable.truck);
		ActionBar.Tab tab2 = getSupportActionBar().newTab().setIcon(
				R.drawable.buss);
		ActionBar.Tab tab3 = getSupportActionBar().newTab().setIcon(
				R.drawable.trailer);
		ActionBar.Tab tab4 = getSupportActionBar().newTab().setIcon(
				R.drawable.heavy);

		mViewPager = (ViewPager) findViewById(R.id.pager);

		mTabsAdapter = new TabsAdapter(this, getSupportActionBar(), mViewPager);

		mTabsAdapter.addTab(tab1, TruckFragment.class);
		mTabsAdapter.addTab(tab2, BusFragment.class);
		mTabsAdapter.addTab(tab3, TrailerFragment.class);
		mTabsAdapter.addTab(tab4, HeavyFragment.class);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menulist, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		 switch (item.getItemId()) {
	        case R.id.about:
	            Intent i = new Intent(this, About.class);
	            startActivity(i);
	            
	            break; 
	        case android.R.id.home:
	        	
	        	recreate();
	        	break;
	    }

		 return super.onOptionsItemSelected(item);
		
	}

}
