package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.n.a;
import com.ss.android.ugc.aweme.account.login.v2.a.s;
import h.f.b.l;
import org.json.JSONObject;

public final class u extends d<s.b> {

    /* renamed from: k  reason: collision with root package name */
    public final boolean f64270k = true;

    /* renamed from: l  reason: collision with root package name */
    public final int f64271l;

    /* renamed from: m  reason: collision with root package name */
    public final s.b f64272m;
    public final JSONObject n;
    public final String o;
    public final a p;

    static {
        Covode.recordClassIndex(39596);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f64270k == uVar.f64270k && this.f64271l == uVar.f64271l && l.a(this.f64272m, uVar.f64272m) && l.a(this.n, uVar.n) && l.a(this.o, uVar.o) && l.a(this.p, uVar.p);
    }

    public final int hashCode() {
        boolean z = this.f64270k;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = ((i2 * 31) + this.f64271l) * 31;
        s.b bVar = this.f64272m;
        int i6 = 0;
        int hashCode = (i5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.n;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str = this.o;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        a aVar = this.p;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return hashCode3 + i6;
    }

    public final String toString() {
        return "ForceResetPasswordResponse(success=" + this.f64270k + ", api=" + this.f64271l + ", queryObj=" + this.f64272m + ", rawData=" + this.n + ", mErrorCaptcha=" + this.o + ", userInfo=" + this.p + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(int i2, s.b bVar, JSONObject jSONObject, String str, a aVar) {
        super(true, i2, bVar);
        l.d(bVar, "");
        l.d(jSONObject, "");
        this.f64271l = i2;
        this.f64272m = bVar;
        this.n = jSONObject;
        this.o = str;
        this.p = aVar;
    }
}
