package com.SRstudio.logicgator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class Nor_gate extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nor_gate);
		
		TextView textView =(TextView)findViewById(R.id.copyright_nor);
		textView.setClickable(true);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
		String text = "<a href='http://simplemindblog.wordpress.com/'> Copyright Simple Reaction Studio </a>";
		textView.setText(Html.fromHtml(text));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nor_gate, menu);
		return true;
	}

}