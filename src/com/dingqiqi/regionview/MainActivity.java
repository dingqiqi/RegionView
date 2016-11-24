package com.dingqiqi.regionview;

import com.dingqiqi.regionview.RegionView.RegionViewClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	private RegionView mRegionView;
	private RegionView mRegionView1;

	private Toast mToast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		mRegionView = (RegionView) findViewById(R.id.regionView);
		mRegionView1 = (RegionView) findViewById(R.id.regionView1);

		mRegionView.setListener(new RegionViewClickListener() {

			@Override
			public void clickTop() {
				showToast("view clickTop");
			}

			@Override
			public void clickRight() {
				showToast("view clickRight");
			}

			@Override
			public void clickLeft() {
				showToast("view clickLeft");
			}

			@Override
			public void clickCenter() {
				showToast("view clickCenter");
			}

			@Override
			public void clickBottom() {
				showToast("view clickBottom");
			}
		});

		mRegionView1.setListener(new RegionViewClickListener() {

			@Override
			public void clickTop() {
				showToast("view1 clickTop");
			}

			@Override
			public void clickRight() {
				showToast("view1 clickRight");
			}

			@Override
			public void clickLeft() {
				showToast("view1 clickLeft");
			}

			@Override
			public void clickCenter() {
				showToast("view1 clickCenter");
			}

			@Override
			public void clickBottom() {
				showToast("view1 clickBottom");
			}
		});

	}

	private void showToast(String message) {
		if (mToast == null) {
			mToast = Toast.makeText(MainActivity.this, message,
					Toast.LENGTH_SHORT);
		} else {
			mToast.setText(message);
		}
		mToast.show();
	}

}
