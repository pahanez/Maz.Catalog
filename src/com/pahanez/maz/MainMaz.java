package com.pahanez.maz;

import android.os.Bundle;
import android.support.v4.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.Menu;
import android.support.v4.view.MenuItem;
import android.support.v4.view.ViewPager;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

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
		

		ActionBar ab = getSupportActionBar();
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
		/*
		 * menu.add("Text") .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS |
		 * MenuItem.SHOW_AS_ACTION_WITH_TEXT);
		 */
		menu.add("")
				.setIcon(R.drawable.about)
				.setShowAsAction(
						MenuItem.SHOW_AS_ACTION_ALWAYS
								| MenuItem.SHOW_AS_ACTION_WITH_TEXT);

		return super.onCreateOptionsMenu(menu);
	}





}
