package com.MangaView.MangaViewApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private ScrollView vscroll1;
	private LinearLayout linear8;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private TextView textview1;
	private LinearLayout shqqaalin;
	private ImageView shqqaaimg;
	private TextView textview2;
	private LinearLayout mangahere_lin;
	private LinearLayout mangakakalot_lin;
	private ImageView mangahere_img;
	private ImageView mangakakalot_img;
	
	private Intent show_screen = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview1 = (TextView) findViewById(R.id.textview1);
		shqqaalin = (LinearLayout) findViewById(R.id.shqqaalin);
		shqqaaimg = (ImageView) findViewById(R.id.shqqaaimg);
		textview2 = (TextView) findViewById(R.id.textview2);
		mangahere_lin = (LinearLayout) findViewById(R.id.mangahere_lin);
		mangakakalot_lin = (LinearLayout) findViewById(R.id.mangakakalot_lin);
		mangahere_img = (ImageView) findViewById(R.id.mangahere_img);
		mangakakalot_img = (ImageView) findViewById(R.id.mangakakalot_img);
		
		shqqaalin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_manga("شقاع", "https://shqqaa.com", "https://shqqaa.com/manga/", "");
			}
		});
		
		shqqaaimg.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_manga("شقاع", "https://shqqaa.com", "https://shqqaa.com/manga/", "");
			}
		});
		
		mangahere_lin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_manga("Manga here", "http://www.mangahere.com/", "https://www.mangahere.com/directory/", "http://www.mangahere.com/search?name=");
			}
		});
		
		mangakakalot_lin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_manga("MangaKakalot", "https://mangakakalot.com/", "https://mangakakalot.com/manga_list", "https://mangakakalot.com/search/story/");
			}
		});
		
		mangahere_img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_manga("Manga here", "http://www.mangahere.com/", "https://www.mangahere.com/directory/", "https://www.mangahere.com/search?name=");
			}
		});
		
		mangakakalot_img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_manga("MangaKakalot", "https://mangakakalot.com/", "https://mangakakalot.com/manga_list", "https://mangakakalot.com/search/story/");
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _manga (final String _name, final String _Link, final String _mangalist, final String _SearchLink) {
		show_screen.putExtra("Name", _name);
		show_screen.putExtra("Link", _Link);
		show_screen.putExtra("MangaList", _mangalist);
		show_screen.putExtra("SearchLink", _SearchLink);
		show_screen.setAction(Intent.ACTION_VIEW);
		show_screen.setClass(getApplicationContext(), MangaActivity.class);
		startActivity(show_screen);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
