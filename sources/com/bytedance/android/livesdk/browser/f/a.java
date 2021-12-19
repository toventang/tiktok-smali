package com.bytedance.android.livesdk.browser.f;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* access modifiers changed from: package-private */
public final class a implements b {
    static {
        Covode.recordClassIndex(7983);
    }

    a() {
    }

    @Override // com.bytedance.android.livesdk.browser.f.b
    public final WebResourceResponse a(Uri uri, WebView webView) {
        MethodCollector.i(9990);
        if (!TextUtils.equals(uri.getScheme(), "liveresource") || !TextUtils.equals(uri.getHost(), "file")) {
            MethodCollector.o(9990);
            return null;
        }
        String queryParameter = uri.getQueryParameter("path");
        if (TextUtils.isEmpty(queryParameter)) {
            MethodCollector.o(9990);
            return null;
        }
        File file = new File(queryParameter);
        if (!file.exists()) {
            MethodCollector.o(9990);
            return null;
        }
        try {
            WebResourceResponse webResourceResponse = new WebResourceResponse("", "", new FileInputStream(file));
            MethodCollector.o(9990);
            return webResourceResponse;
        } catch (FileNotFoundException unused) {
            MethodCollector.o(9990);
            return null;
        }
    }
}
