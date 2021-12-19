package com.ss.android.ugc.aweme.crossplatform.c;

import com.bytedance.android.monitor.webview.c;
import com.bytedance.android.monitor.webview.h;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78683a = new a();

    private a() {
    }

    public static i a() {
        c cVar = i.f23764a;
        Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.bytedance.android.monitor.webview.TTLiveWebViewMonitorHelper");
        return (i) cVar;
    }

    static {
        Covode.recordClassIndex(48852);
        c.a d2 = i.f23764a.d();
        d2.f23693e = new String[]{SingleWebView.class.getName()};
        d2.a(new h());
        d2.p = true;
        d2.q = true;
        d2.f23699k = true;
        d2.n = true;
        d2.f23701m = true;
        d2.f23700l = true;
        d2.s = "loc_after_tti";
        d2.o = true;
    }
}
