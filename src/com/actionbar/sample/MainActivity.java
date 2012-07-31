package com.actionbar.sample;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@SuppressLint({"NewApi" })
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initilaize Action Bar
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);

		// Add Tab 1
		Tab tab = actionBar
				.newTab()
				.setText("AFragment")
				.setTabListener(
						new TabListener<AFragment>(this, "AFragment",
								AFragment.class));
		actionBar.addTab(tab);

		// Add Tab 2
		tab = actionBar
				.newTab()
				.setText("BFragment")
				.setTabListener(
						new TabListener<AFragment>(this, "AFragment",
								AFragment.class));
		actionBar.addTab(tab);
	}
}
