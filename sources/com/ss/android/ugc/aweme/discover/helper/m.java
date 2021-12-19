package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "query")

    /* renamed from: a  reason: collision with root package name */
    public final String f81150a;
    @c(a = "search_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f81151b;
    @c(a = "channel")

    /* renamed from: c  reason: collision with root package name */
    public final String f81152c;
    @c(a = "source")

    /* renamed from: d  reason: collision with root package name */
    public final String f81153d;
    @c(a = "time")

    /* renamed from: e  reason: collision with root package name */
    public final Long f81154e;

    static {
        Covode.recordClassIndex(50443);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f81150a, mVar.f81150a) && l.a(this.f81151b, mVar.f81151b) && l.a(this.f81152c, mVar.f81152c) && l.a(this.f81153d, mVar.f81153d) && l.a(this.f81154e, mVar.f81154e);
    }

    public final int hashCode() {
        String str = this.f81150a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81151b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81152c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f81153d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l2 = this.f81154e;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "LastSearch(query=" + this.f81150a + ", search_id=" + this.f81151b + ", channel=" + this.f81152c + ", source=" + this.f81153d + ", time=" + this.f81154e + ")";
    }

    private /* synthetic */ m() {
        this("", "", "", "", 0L);
    }

    public m(String str, String str2, String str3, String str4, Long l2) {
        this.f81150a = str;
        this.f81151b = str2;
        this.f81152c = str3;
        this.f81153d = str4;
        this.f81154e = l2;
    }
}
