package com.game.strawberry;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nazar.humeniuk on 9/28/17.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        view.loadUrl(url);
        return true;
    }
}
