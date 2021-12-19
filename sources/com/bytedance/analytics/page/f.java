package com.bytedance.analytics.page;

import android.text.TextUtils;
import com.bytedance.analytics.a.a;
import com.bytedance.analytics.b;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.a.h;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f6570a;

    /* renamed from: b  reason: collision with root package name */
    public String f6571b;

    /* renamed from: c  reason: collision with root package name */
    public f f6572c;

    /* renamed from: d  reason: collision with root package name */
    public final a f6573d;

    /* renamed from: e  reason: collision with root package name */
    public final h<String> f6574e = new h<>(a.f6513c);

    /* renamed from: f  reason: collision with root package name */
    public boolean f6575f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6576g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6577h;

    /* renamed from: i  reason: collision with root package name */
    public String f6578i;

    /* renamed from: j  reason: collision with root package name */
    public String f6579j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6580k;

    /* renamed from: l  reason: collision with root package name */
    public String f6581l;

    /* renamed from: m  reason: collision with root package name */
    public long f6582m;
    public long n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public String s;
    public long t;
    public f u;

    static {
        Covode.recordClassIndex(3166);
    }

    public final int hashCode() {
        return this.f6570a.hashCode();
    }

    public final String toString() {
        return "PageObject{id='" + this.f6570a + "', name='" + this.f6571b + "'}";
    }

    public final Map<String, String> a() {
        String str;
        p[] pVarArr = new p[6];
        boolean z = false;
        pVarArr[0] = v.a("duration", String.valueOf(this.n));
        pVarArr[1] = v.a("is_back", String.valueOf(this.o));
        String str2 = this.q;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[2] = v.a("btm_pre", str2);
        String str3 = this.r;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[3] = v.a("btm_ppre", str3);
        String str4 = this.s;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[4] = v.a("btm_last_stay", str4);
        pVarArr[5] = v.a("btm_chain", new JSONArray((Collection) this.f6574e).toString());
        Map<String, String> b2 = ag.b(pVarArr);
        String str5 = b.f6551b;
        if (str5 == null || str5.length() == 0) {
            z = true;
        }
        if (z) {
            b2.put("btm", "");
        } else {
            b2.put("btm", this.p);
        }
        if (TextUtils.isEmpty(b2.get("btm"))) {
            f fVar = this.f6572c;
            if (fVar == null) {
                str = null;
            } else {
                str = fVar.f6571b;
            }
            com.bytedance.analytics.b.a.a("btmNull", l.a("preName:", (Object) str));
        }
        return b2;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f6574e.add(str);
        while (this.f6574e.size() > a.f6513c) {
            this.f6574e.b();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        return l.a((Object) ((f) obj).f6570a, (Object) this.f6570a);
    }

    public final void a(List<String> list) {
        l.d(list, "");
        this.f6574e.addAll(list);
        while (this.f6574e.size() > a.f6513c) {
            this.f6574e.b();
        }
    }

    public f(String str, String str2, f fVar, a aVar) {
        String sb;
        l.d(str, "");
        l.d(str2, "");
        this.f6570a = str;
        this.f6571b = str2;
        this.f6572c = fVar;
        this.f6573d = aVar;
        f fVar2 = this.f6572c;
        if (fVar2 != null) {
            this.q = (aVar == null || (sb = new StringBuilder().append(b.f6551b).append('.').append(aVar.f6565a.f6571b).append('.').append(aVar.f6566b).append('.').append(aVar.f6567c).toString()) == null) ? fVar2.p : sb;
            this.r = fVar2.q;
            this.t = fVar2.n;
            fVar2.u = this;
        }
        this.p = ((Object) b.f6551b) + '.' + this.f6571b + ".0.0";
    }
}
