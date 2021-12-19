package com.ss.android.ugc.aweme.framework.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public interface IWebViewTweaker {
    static {
        Covode.recordClassIndex(61364);
    }

    void clearWebviewOnDestroy(WebView webView);

    void tweakPauseIfFinishing(Context context, WebView webView);
}
