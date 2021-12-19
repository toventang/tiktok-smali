package com.bytedance.lynx.hybrid.webkit;

import android.webkit.JavascriptInterface;
import com.bytedance.covode.number.Covode;

public final class GlobalProps {

    /* renamed from: a  reason: collision with root package name */
    public String f41256a;

    static {
        Covode.recordClassIndex(25280);
    }

    @JavascriptInterface
    public final String getGlobalProps() {
        String str = this.f41256a;
        if (str == null) {
            return "";
        }
        return str;
    }
}
