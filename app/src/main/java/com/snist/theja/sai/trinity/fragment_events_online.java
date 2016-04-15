package com.snist.theja.sai.trinity;

/**
 * Created by sai on 10-01-2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class fragment_events_online extends Fragment {
    private WebView mWebView1;
    public fragment_events_online(){}

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView1 = inflater.inflate(R.layout.layout_events_online, container, false);

        mWebView1 = (WebView) rootView1.findViewById(R.id.activity_main_we);
        WebSettings webSettings = mWebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView1.loadUrl("http://www.trinity16.in/events.html");
        mWebView1.setWebViewClient(new MyAppWebViewClient() {
            @Override
            public void onPageFinished(WebView view1, String url1) {
                //hide loading image
                rootView1.findViewById(R.id.imageLoading2).setVisibility(View.GONE);
                rootView1.findViewById(R.id.textView11).setVisibility(View.GONE);
                rootView1.findViewById(R.id.progressBar).setVisibility(View.GONE);
                //show webview
                rootView1.findViewById(R.id.activity_main_we).setVisibility(View.VISIBLE);
            }
        });
        return rootView1;
    }

}
