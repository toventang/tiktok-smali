package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.a.c.a;
import com.lynx.tasm.l;
import com.lynx.tasm.n;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public l f43800a;

    /* renamed from: b  reason: collision with root package name */
    public String f43801b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43802c;

    /* renamed from: d  reason: collision with root package name */
    public n f43803d;

    /* renamed from: e  reason: collision with root package name */
    public a f43804e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.sdk.bdlynx.d.a f43805f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f43806g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f43807h;

    static {
        Covode.recordClassIndex(26790);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.f.b.l.a(this.f43803d, cVar.f43803d) && h.f.b.l.a(this.f43804e, cVar.f43804e) && h.f.b.l.a(this.f43805f, cVar.f43805f) && this.f43806g == cVar.f43806g && h.f.b.l.a(this.f43807h, cVar.f43807h);
    }

    public final int hashCode() {
        n nVar = this.f43803d;
        int i2 = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        a aVar = this.f43804e;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        com.bytedance.sdk.bdlynx.d.a aVar2 = this.f43805f;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        boolean z = this.f43806g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        JSONObject jSONObject = this.f43807h;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "BDLynxInitParams(lynxViewBuilder=" + this.f43803d + ", bdLynxInfo=" + this.f43804e + ", resLoader=" + this.f43805f + ", useDefaultClient=" + this.f43806g + ", globalProps=" + this.f43807h + ")";
    }

    public /* synthetic */ c() {
        this(new n(), new a(), new JSONObject());
    }

    private c(n nVar, a aVar, JSONObject jSONObject) {
        h.f.b.l.c(nVar, "");
        h.f.b.l.c(aVar, "");
        h.f.b.l.c(jSONObject, "");
        this.f43803d = nVar;
        this.f43804e = aVar;
        this.f43805f = null;
        this.f43806g = true;
        this.f43807h = jSONObject;
        Boolean c2 = com.bytedance.sdk.bdlynx.a.a.a.a().c();
        h.f.b.l.a((Object) c2, "");
        this.f43802c = c2.booleanValue();
    }
}
