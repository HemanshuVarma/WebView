package com.hemanshu.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var urlButton: Button
    private lateinit var webView: WebView
    private val URL = "http://www.google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        urlButton = findViewById(R.id.urlButton)
        webView = findViewById(R.id.urlWebView)

        urlButton.setOnClickListener { loadWebView() }
    }

    private fun loadWebView() {
        //WebViewClient will let you load the URL within WebView created in XML.
        //If not then by default URL will be opened in Web Browser
        webView.webViewClient = WebViewClient()

        //String URL passed to load URL
        webView.loadUrl(URL)
    }
}
