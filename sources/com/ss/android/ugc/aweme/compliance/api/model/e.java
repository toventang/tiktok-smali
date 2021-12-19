package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f76649a;

    /* renamed from: b  reason: collision with root package name */
    public String f76650b;

    /* renamed from: c  reason: collision with root package name */
    public Strategy f76651c;

    /* renamed from: d  reason: collision with root package name */
    public String f76652d;

    /* renamed from: e  reason: collision with root package name */
    public Set<String> f76653e;

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f76654f;

    /* renamed from: g  reason: collision with root package name */
    public Set<String> f76655g;

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f76656h;

    /* renamed from: i  reason: collision with root package name */
    public Set<String> f76657i;

    static {
        Covode.recordClassIndex(47349);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f76649a == eVar.f76649a && l.a(this.f76650b, eVar.f76650b) && l.a(this.f76651c, eVar.f76651c) && l.a(this.f76652d, eVar.f76652d) && l.a(this.f76653e, eVar.f76653e) && l.a(this.f76654f, eVar.f76654f) && l.a(this.f76655g, eVar.f76655g) && l.a(this.f76656h, eVar.f76656h) && l.a(this.f76657i, eVar.f76657i);
    }

    public final int hashCode() {
        boolean z = this.f76649a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f76650b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        Strategy strategy = this.f76651c;
        int hashCode2 = (hashCode + (strategy != null ? strategy.hashCode() : 0)) * 31;
        String str2 = this.f76652d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<String> set = this.f76653e;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f76654f;
        int hashCode5 = (hashCode4 + (set2 != null ? set2.hashCode() : 0)) * 31;
        Set<String> set3 = this.f76655g;
        int hashCode6 = (hashCode5 + (set3 != null ? set3.hashCode() : 0)) * 31;
        Set<String> set4 = this.f76656h;
        int hashCode7 = (hashCode6 + (set4 != null ? set4.hashCode() : 0)) * 31;
        Set<String> set5 = this.f76657i;
        if (set5 != null) {
            i6 = set5.hashCode();
        }
        return hashCode7 + i6;
    }

    public final String toString() {
        return "InterceptResult(flag=" + this.f76649a + ", domain=" + this.f76650b + ", strategy=" + this.f76651c + ", interceptedUrl=" + this.f76652d + ", headerParams=" + this.f76653e + ", urlParams=" + this.f76654f + ", bodyParams=" + this.f76655g + ", replaceParams=" + this.f76656h + ", ruleNames=" + this.f76657i + ")";
    }

    private e(boolean z, String str, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5) {
        l.d(set, "");
        l.d(set2, "");
        l.d(set3, "");
        l.d(set4, "");
        l.d(set5, "");
        this.f76649a = z;
        this.f76650b = null;
        this.f76651c = null;
        this.f76652d = str;
        this.f76653e = set;
        this.f76654f = set2;
        this.f76655g = set3;
        this.f76656h = set4;
        this.f76657i = set5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, String str, Set set, Set set2, Set set3, Set set4, Set set5, int i2) {
        this(z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? new LinkedHashSet() : set, (i2 & 32) != 0 ? new LinkedHashSet() : set2, (i2 & 64) != 0 ? new LinkedHashSet() : set3, (i2 & 128) != 0 ? new LinkedHashSet() : set4, (i2 & 256) != 0 ? new LinkedHashSet() : set5);
    }
}
