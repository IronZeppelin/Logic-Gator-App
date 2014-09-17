package com.SRstudio.logicgator;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import com.SRstudio.logicgator.R;

public class MainActivity extends Activity implements OnClickListener{

	ImageButton buff_bt_activity,not_bt_activity,and_bt_activity,nand_bt_activity,or_bt_activity,nor_bt_activity,xor_bt_activity,xnor_bt_activity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView textView =(TextView)findViewById(R.id.copyright_main);
		textView.setClickable(true);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
		String text = "<a href='http://simplemindblog.wordpress.com/'> Copyright Simple Reaction Studio </a>";
		textView.setText(Html.fromHtml(text));
		
		
		buff_bt_activity = (ImageButton) findViewById(R.id.buff_bt);
		buff_bt_activity.setOnClickListener(this);
		
		not_bt_activity = (ImageButton) findViewById(R.id.not_bt);
		not_bt_activity.setOnClickListener(this);
		
		and_bt_activity = (ImageButton) findViewById(R.id.and_bt);
		and_bt_activity.setOnClickListener(this);
		
		nand_bt_activity = (ImageButton) findViewById(R.id.nand_bt);
		nand_bt_activity.setOnClickListener(this);
		
		or_bt_activity = (ImageButton) findViewById(R.id.or_bt);
		or_bt_activity.setOnClickListener(this);
		
		nor_bt_activity = (ImageButton) findViewById(R.id.nor_bt);
		nor_bt_activity.setOnClickListener(this);
		
		xor_bt_activity = (ImageButton) findViewById(R.id.xor_bt);
		xor_bt_activity.setOnClickListener(this);

		xnor_bt_activity = (ImageButton) findViewById(R.id.xnor_bt);
		xnor_bt_activity.setOnClickListener(this);
	}
	 public void onClick(View v) {
	    	switch (v.getId()) {
	        	case R.id.buff_bt:
	        		Intent buffer_window = new Intent(MainActivity.this,Buffer_gate.class);
	                 startActivity(buffer_window);
	                 break;
	        	case R.id.not_bt:
	        		Intent not_window = new Intent(MainActivity.this,Not_gate.class);
	                 startActivity(not_window);
	                 break;
	        	case R.id.and_bt:
	        		Intent and_window = new Intent(MainActivity.this,And_gate.class);
	                 startActivity(and_window);
	                 break;
	        	case R.id.nand_bt:
	        		Intent nand_window = new Intent(MainActivity.this,Nand_gate.class);
	                 startActivity(nand_window);
	                 break;
	        	case R.id.or_bt:
	        		Intent or_window = new Intent(MainActivity.this,Or_gate.class);
	                 startActivity(or_window);
	                 break;
	        	case R.id.nor_bt:
	        		Intent nor_window = new Intent(MainActivity.this,Nor_gate.class);
	                 startActivity(nor_window);
	                 break;
	        	case R.id.xor_bt:
	        		Intent xor_window = new Intent(MainActivity.this,Xor_gate.class);
	                 startActivity(xor_window);
	                 break;
	        	case R.id.xnor_bt:
	        		Intent xnor_window = new Intent(MainActivity.this,Xnor_gate.class);
	                 startActivity(xnor_window);
	                 break;
	    	}
	 }
	

}
