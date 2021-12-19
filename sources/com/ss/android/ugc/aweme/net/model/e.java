package com.ss.android.ugc.aweme.net.model;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class e<Q, R> {

    /* renamed from: a  reason: collision with root package name */
    public Q f112458a;

    /* renamed from: b  reason: collision with root package name */
    public R f112459b;

    /* renamed from: c  reason: collision with root package name */
    public WebView f112460c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f112461d;

    /* renamed from: e  reason: collision with root package name */
    public RuntimeException f112462e;

    /* renamed from: f  reason: collision with root package name */
    public d f112463f;

    static {
        Covode.recordClassIndex(72271);
    }

    public e() {
        this(null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f112458a, eVar.f112458a) && l.a(this.f112459b, eVar.f112459b) && l.a(this.f112460c, eVar.f112460c) && l.a(this.f112461d, eVar.f112461d) && l.a(this.f112462e, eVar.f112462e) && l.a(this.f112463f, eVar.f112463f);
    }

    public final int hashCode() {
        Q q = this.f112458a;
        int i2 = 0;
        int hashCode = (q != null ? q.hashCode() : 0) * 31;
        R r = this.f112459b;
        int hashCode2 = (hashCode + (r != null ? r.hashCode() : 0)) * 31;
        WebView webView = this.f112460c;
        int hashCode3 = (hashCode2 + (webView != null ? webView.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f112461d;
        int hashCode4 = (hashCode3 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        RuntimeException runtimeException = this.f112462e;
        int hashCode5 = (hashCode4 + (runtimeException != null ? runtimeException.hashCode() : 0)) * 31;
        d dVar = this.f112463f;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "InterceptContext(request=" + ((Object) this.f112458a) + ", response=" + ((Object) this.f112459b) + ", webView=" + this.f112460c + ", extra=" + this.f112461d + ", exception=" + this.f112462e + ", action=" + this.f112463f + ")";
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f112463f = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, d dVar, int i2) {
        this((i2 & 1) != 0 ? null : obj, null, null, (i2 & 32) != 0 ? d.CONTINUE : dVar);
    }

    public e(Q q, WebView webView, JSONObject jSONObject, d dVar) {
        l.d(dVar, "");
        this.f112458a = q;
        this.f112459b = null;
        this.f112460c = webView;
        this.f112461d = jSONObject;
        this.f112462e = null;
        this.f112463f = dVar;
    }
}
