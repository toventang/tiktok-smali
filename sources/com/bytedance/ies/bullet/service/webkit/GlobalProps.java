package com.bytedance.ies.bullet.service.webkit;

import android.webkit.JavascriptInterface;
import com.bytedance.covode.number.Covode;

public final class GlobalProps {

    /* renamed from: a  reason: collision with root package name */
    public String f33013a;

    static {
        Covode.recordClassIndex(19703);
    }

    @JavascriptInterface
    public final String getGlobalProps() {
        String str = this.f33013a;
        if (str == null) {
            return "";
        }
        return str;
    }
}
