package com.ss.android.ugc.aweme.compliance.business.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f76834a;

    /* renamed from: b  reason: collision with root package name */
    public String f76835b;

    /* renamed from: c  reason: collision with root package name */
    public String f76836c;

    /* renamed from: d  reason: collision with root package name */
    public String f76837d;

    /* renamed from: e  reason: collision with root package name */
    public Set<String> f76838e;

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f76839f;

    /* renamed from: g  reason: collision with root package name */
    public Set<String> f76840g;

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f76841h;

    /* renamed from: i  reason: collision with root package name */
    public Set<String> f76842i;

    /* renamed from: j  reason: collision with root package name */
    public Set<String> f76843j;

    static {
        Covode.recordClassIndex(47499);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f76834a == bVar.f76834a && l.a(this.f76835b, bVar.f76835b) && l.a(this.f76836c, bVar.f76836c) && l.a(this.f76837d, bVar.f76837d) && l.a(this.f76838e, bVar.f76838e) && l.a(this.f76839f, bVar.f76839f) && l.a(this.f76840g, bVar.f76840g) && l.a(this.f76841h, bVar.f76841h) && l.a(this.f76842i, bVar.f76842i) && l.a(this.f76843j, bVar.f76843j);
    }

    public final int hashCode() {
        boolean z = this.f76834a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f76835b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76836c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76837d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<String> set = this.f76838e;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f76839f;
        int hashCode5 = (hashCode4 + (set2 != null ? set2.hashCode() : 0)) * 31;
        Set<String> set3 = this.f76840g;
        int hashCode6 = (hashCode5 + (set3 != null ? set3.hashCode() : 0)) * 31;
        Set<String> set4 = this.f76841h;
        int hashCode7 = (hashCode6 + (set4 != null ? set4.hashCode() : 0)) * 31;
        Set<String> set5 = this.f76842i;
        int hashCode8 = (hashCode7 + (set5 != null ? set5.hashCode() : 0)) * 31;
        Set<String> set6 = this.f76843j;
        if (set6 != null) {
            i6 = set6.hashCode();
        }
        return hashCode8 + i6;
    }

    public final String toString() {
        return "HeaderParamInterceptResult(flag=" + this.f76834a + ", netType=" + this.f76835b + ", url=" + this.f76836c + ", interceptedUrl=" + this.f76837d + ", headerKeys=" + this.f76838e + ", interceptedHeaderKeys=" + this.f76839f + ", cookieKeys=" + this.f76840g + ", interceptedCookieKeys=" + this.f76841h + ", urlQueryKeys=" + this.f76842i + ", interceptedUrlQueryKeys=" + this.f76843j + ")";
    }

    public /* synthetic */ b(String str, String str2) {
        this(false, str, str2, new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet());
    }

    public b(boolean z, String str, String str2, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, Set<String> set6) {
        l.d(set, "");
        l.d(set2, "");
        l.d(set3, "");
        l.d(set4, "");
        l.d(set5, "");
        l.d(set6, "");
        this.f76834a = z;
        this.f76835b = str;
        this.f76836c = str2;
        this.f76837d = null;
        this.f76838e = set;
        this.f76839f = set2;
        this.f76840g = set3;
        this.f76841h = set4;
        this.f76842i = set5;
        this.f76843j = set6;
    }
}
