package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f30697a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30698b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30699c;

    /* renamed from: d  reason: collision with root package name */
    public final p f30700d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, e> f30701e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Integer, e> f30702f;

    static {
        Covode.recordClassIndex(17824);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f30697a, qVar.f30697a) && l.a(this.f30698b, qVar.f30698b) && this.f30699c == qVar.f30699c && l.a(this.f30700d, qVar.f30700d) && l.a(this.f30701e, qVar.f30701e) && l.a(this.f30702f, qVar.f30702f);
    }

    public final int hashCode() {
        String str = this.f30697a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30698b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.f30699c;
        int i3 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        p pVar = this.f30700d;
        int hashCode3 = (i3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Map<String, e> map = this.f30701e;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Map<Integer, e> map2 = this.f30702f;
        if (map2 != null) {
            i2 = map2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "SampleRateResultEvent(date=" + this.f30697a + ", deviceId=" + this.f30698b + ", hashCode=" + this.f30699c + ", sampleRateModel=" + this.f30700d + ", resourceSampleRateResults=" + this.f30701e + ", apiSampleRateResults=" + this.f30702f + ")";
    }

    public q(String str, String str2, long j2, p pVar, Map<String, e> map, Map<Integer, e> map2) {
        l.c(str, "");
        l.c(str2, "");
        l.c(pVar, "");
        l.c(map, "");
        l.c(map2, "");
        this.f30697a = str;
        this.f30698b = str2;
        this.f30699c = j2;
        this.f30700d = pVar;
        this.f30701e = map;
        this.f30702f = map2;
    }
}
