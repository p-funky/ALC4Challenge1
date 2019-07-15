package com.funky.p.alc4challenge1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        WebView myWebView = findViewById(R.id.webview);

        WebSettings webViewSettings = myWebView.getSettings();
        webViewSettings.setJavaScriptEnabled(true);
        webViewSettings.setUseWideViewPort(true);
        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
        });

        myWebView.loadUrl("https://andela.com/alc/");
    }
}
