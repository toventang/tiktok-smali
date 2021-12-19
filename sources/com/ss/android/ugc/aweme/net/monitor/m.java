package com.ss.android.ugc.aweme.net.monitor;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.model.e;

public interface m extends j {
    static {
        Covode.recordClassIndex(72285);
    }

    e<String, WebResourceResponse> n(e<String, WebResourceResponse> eVar);

    e<WebResourceRequest, WebResourceResponse> o(e<WebResourceRequest, WebResourceResponse> eVar);
}
