package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.ab;
import h.f.b.l;
import java.util.Set;

public final class g {
    @c(a = "enable")

    /* renamed from: a  reason: collision with root package name */
    public boolean f112414a;
    @c(a = "intercept_enable")

    /* renamed from: b  reason: collision with root package name */
    public boolean f112415b;
    @c(a = "ttnet_sampling")

    /* renamed from: c  reason: collision with root package name */
    public int f112416c;
    @c(a = "okhttp_sampling")

    /* renamed from: d  reason: collision with root package name */
    public int f112417d;
    @c(a = "urlconnection_sampling")

    /* renamed from: e  reason: collision with root package name */
    public int f112418e;
    @c(a = "applog_sampling")

    /* renamed from: f  reason: collision with root package name */
    public int f112419f;
    @c(a = "commonlog_sampling")

    /* renamed from: g  reason: collision with root package name */
    public int f112420g;
    @c(a = "front_back_count")

    /* renamed from: h  reason: collision with root package name */
    public int f112421h;
    @c(a = "flow_control")

    /* renamed from: i  reason: collision with root package name */
    public int f112422i;
    @c(a = "rule_regex")

    /* renamed from: j  reason: collision with root package name */
    public String f112423j;
    @c(a = "max_size")

    /* renamed from: k  reason: collision with root package name */
    public final long f112424k;
    @c(a = "intercept_api_list")

    /* renamed from: l  reason: collision with root package name */
    public final Set<String> f112425l;
    @c(a = "check_list")

    /* renamed from: m  reason: collision with root package name */
    public Set<String> f112426m;

    static {
        Covode.recordClassIndex(72251);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f112414a == gVar.f112414a && this.f112415b == gVar.f112415b && this.f112416c == gVar.f112416c && this.f112417d == gVar.f112417d && this.f112418e == gVar.f112418e && this.f112419f == gVar.f112419f && this.f112420g == gVar.f112420g && this.f112421h == gVar.f112421h && this.f112422i == gVar.f112422i && l.a(this.f112423j, gVar.f112423j) && this.f112424k == gVar.f112424k && l.a(this.f112425l, gVar.f112425l) && l.a(this.f112426m, gVar.f112426m);
    }

    public final String toString() {
        return "PayLoadControl(enable=" + this.f112414a + ", intercept=" + this.f112415b + ", ttNetSampling=" + this.f112416c + ", okHttpSampling=" + this.f112417d + ", urlConnectionSampling=" + this.f112418e + ", appLogSampling=" + this.f112419f + ", commonLogSampling=" + this.f112420g + ", count=" + this.f112421h + ", flowControl=" + this.f112422i + ", ruleRegex=" + this.f112423j + ", maxSize=" + this.f112424k + ", interceptApi=" + this.f112425l + ", checkList=" + this.f112426m + ")";
    }

    public /* synthetic */ g() {
        this("", ab.INSTANCE, ab.INSTANCE);
    }

    public final int hashCode() {
        int i2;
        int i3;
        boolean z = this.f112414a;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = i5 * 31;
        if (!this.f112415b) {
            i4 = 0;
        }
        int i9 = (((((((((((((((i8 + i4) * 31) + this.f112416c) * 31) + this.f112417d) * 31) + this.f112418e) * 31) + this.f112419f) * 31) + this.f112420g) * 31) + this.f112421h) * 31) + this.f112422i) * 31;
        String str = this.f112423j;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f112424k;
        int i11 = (((i9 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Set<String> set = this.f112425l;
        if (set != null) {
            i3 = set.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        Set<String> set2 = this.f112426m;
        if (set2 != null) {
            i10 = set2.hashCode();
        }
        return i12 + i10;
    }

    private g(String str, Set<String> set, Set<String> set2) {
        l.d(str, "");
        l.d(set, "");
        l.d(set2, "");
        this.f112414a = false;
        this.f112415b = false;
        this.f112416c = 0;
        this.f112417d = 0;
        this.f112418e = 0;
        this.f112419f = 0;
        this.f112420g = 0;
        this.f112421h = 6;
        this.f112422i = 2;
        this.f112423j = str;
        this.f112424k = 5242880;
        this.f112425l = set;
        this.f112426m = set2;
    }
}
