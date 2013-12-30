package paginasweb.pe.ejercicio_intent_implicito;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button btn_paginas, btn_llamar, btn_camara, btn_paginaswebPeru;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_paginas = (Button) findViewById(R.id.btn_web);
		btn_llamar = (Button) findViewById(R.id.btn_llamar);
		btn_camara = (Button) findViewById(R.id.btn_camara);
		btn_paginaswebPeru = (Button) findViewById(R.id.btnPaginasweb);
		
		btn_paginas.setOnClickListener(this);
		btn_llamar.setOnClickListener(this);
		btn_camara.setOnClickListener(this);
		btn_paginaswebPeru.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btn_web:
			Intent intencion = new Intent(Intent.ACTION_VIEW);
			intencion.setData(Uri.parse("http://www.android.com"));
			startActivity(intencion);
			break;
		
		case R.id.btn_llamar:
			Intent i = new Intent(Intent.ACTION_CALL);
			i.setData(Uri.parse("tel:555"));
			startActivity(i);
			break;
			
		case R.id.btn_camara:
			Intent ii=new Intent("android.media.action.IMAGE_CAPTURE");
			startActivityForResult(ii, 0);
			break;
			
		case R.id.btnPaginasweb:
			Intent intencion2 = new Intent(Intent.ACTION_VIEW);
			intencion2.setData(Uri.parse("http://www.paginasweb.pe"));
			startActivity(intencion2);
			break;
		}
	}


}
