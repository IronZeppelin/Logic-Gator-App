package com.SRstudio.logicgator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class Nand_gate extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nand_gate);
		
		TextView textView =(TextView)findViewById(R.id.copyright_nand);
		textView.setClickable(true);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
		String text = "<a href='http://simplemindblog.wordpress.com/'> Copyright Simple Reaction Studio </a>";
		textView.setText(Html.fromHtml(text));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nand_gate, menu);
		return true;
	}

}
