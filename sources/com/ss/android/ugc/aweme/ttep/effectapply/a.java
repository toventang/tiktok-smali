package com.ss.android.ugc.aweme.ttep.effectapply;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final String f141334a;
    @c(a = "message")

    /* renamed from: b  reason: collision with root package name */
    public final String f141335b;
    @c(a = "status")

    /* renamed from: c  reason: collision with root package name */
    public final int f141336c;
    @c(a = "loki_busi_msg")

    /* renamed from: d  reason: collision with root package name */
    public final String f141337d;

    static {
        Covode.recordClassIndex(92303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f141334a, aVar.f141334a) && l.a(this.f141335b, aVar.f141335b) && this.f141336c == aVar.f141336c && l.a(this.f141337d, aVar.f141337d);
    }

    public final int hashCode() {
        String str = this.f141334a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f141335b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f141336c) * 31;
        String str3 = this.f141337d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EffectFetchApiResBean(data=" + this.f141334a + ", message=" + this.f141335b + ", status=" + this.f141336c + ", lokiBusiMsg=" + this.f141337d + ")";
    }

    private /* synthetic */ a() {
        this("", "", "");
    }

    private a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f141334a = str;
        this.f141335b = str2;
        this.f141336c = 0;
        this.f141337d = str3;
    }
}
