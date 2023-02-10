package com.example.chromecustomtabexample

import android.net.Uri
import android.os.Bundle
import android.provider.Browser
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.browser.customtabs.CustomTabsSession


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val url = "https://.com/"

            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
//            val headers = Bundle()
//            headers.putString("accept-language", "de-li")
//            customTabsIntent.intent.putExtra(Browser.EXTRA_HEADERS, headers)
            customTabsIntent.launchUrl(this, Uri.parse(url))



//            val intent = CustomTabsIntent.Builder().build()

//            val headers = Bundle()
//            headers.putString("accept-language", "en-US")
//            intent.intent.putExtra(Browser.EXTRA_HEADERS, headers)
//
//            intent.launchUrl(this, Uri.parse("http://www.google.com"))
        }
    }
}