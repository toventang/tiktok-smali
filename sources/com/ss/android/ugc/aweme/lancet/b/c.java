package com.ss.android.ugc.aweme.lancet.b;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.f.a;

public final /* synthetic */ class c implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ValueCallback f107187a;

    static {
        Covode.recordClassIndex(68566);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        ValueCallback valueCallback = this.f107187a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(obj);
        }
        String cookie = CookieManager.getInstance().getCookie(a.a());
        if (cookie != null && !TextUtils.equals(cookie, a.b())) {
            a.a(a.a(), cookie);
        }
    }
}
