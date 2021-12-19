package com.bytedance.ies.xbridge.e;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f35939a;

    /* renamed from: b  reason: collision with root package name */
    public final long f35940b;

    /* renamed from: c  reason: collision with root package name */
    public final b.d f35941c;

    /* renamed from: d  reason: collision with root package name */
    public final WebView f35942d;

    static {
        Covode.recordClassIndex(21488);
    }

    public final int hashCode() {
        return this.f35939a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (l.a((Object) this.f35939a, (Object) eVar.f35939a) && this.f35939a.length() > 0) {
            return true;
        }
        if (!l.a((Object) this.f35939a, (Object) eVar.f35939a) || !l.a(this.f35942d, eVar.f35942d) || this.f35942d == null) {
            return false;
        }
        return true;
    }

    public e(String str, long j2, b.d dVar, WebView webView) {
        l.c(str, "");
        this.f35939a = str;
        this.f35940b = j2;
        this.f35941c = dVar;
        this.f35942d = webView;
    }
}
