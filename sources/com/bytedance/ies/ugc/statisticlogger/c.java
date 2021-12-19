package com.bytedance.ies.ugc.statisticlogger;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f35329a;

    /* renamed from: b  reason: collision with root package name */
    public final long f35330b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35331c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f35332d;

    static {
        Covode.recordClassIndex(21152);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f35329a, cVar.f35329a) && this.f35330b == cVar.f35330b && l.a(this.f35331c, cVar.f35331c) && l.a(this.f35332d, cVar.f35332d);
    }

    public final String toString() {
        return "SessionChangeEvent(type=" + this.f35329a + ", sessionId=" + this.f35330b + ", session=" + this.f35331c + ", app_log=" + this.f35332d + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        d dVar = this.f35329a;
        int i4 = 0;
        if (dVar != null) {
            i2 = dVar.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f35330b;
        int i5 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f35331c;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        JSONObject jSONObject = this.f35332d;
        if (jSONObject != null) {
            i4 = jSONObject.hashCode();
        }
        return i6 + i4;
    }

    public /* synthetic */ c(d dVar, long j2) {
        this(dVar, j2, "", null);
    }

    public c(d dVar, long j2, String str, JSONObject jSONObject) {
        l.d(dVar, "");
        this.f35329a = dVar;
        this.f35330b = j2;
        this.f35331c = str;
        this.f35332d = jSONObject;
    }
}
