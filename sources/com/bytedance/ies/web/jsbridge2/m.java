package com.bytedance.ies.web.jsbridge2;

import android.os.Build;
import android.webkit.WebView;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final WebView f35685a;

    static {
        Covode.recordClassIndex(21301);
    }

    m(WebView webView) {
        this.f35685a = webView;
    }

    public final void run() {
        Toast makeText = Toast.makeText(this.f35685a.getContext(), "【Security】\nThe current JSB authentication has security risks!\nPlease implement the ISafeWebView interface of JsBridge2\n", 1);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
    }
}
