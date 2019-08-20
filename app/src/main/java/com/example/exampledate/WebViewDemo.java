package com.example.exampledate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.webkit.WebView;

public class WebViewDemo extends AppCompatActivity {
EditText edt_url;
Button btn_load;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        edt_url=findViewById(R.id.edt_url);
        btn_load=findViewById(R.id.btn_load);
        webView = findViewById(R.id.webView);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = edt_url.getText().toString();
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);

            }
        });



    }
}
