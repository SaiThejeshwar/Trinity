package com.snist.theja.sai.trinity;

/**
 * Created by sai on 08-01-2016.
 */
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view1, String url1) {
        if(Uri.parse(url1).getHost().endsWith("http://www.trinity16.in")) {
            return false;
        }

        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
        view1.getContext().startActivity(intent1);
        return true;
    }
}