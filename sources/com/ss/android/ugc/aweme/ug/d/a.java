package com.ss.android.ugc.aweme.ug.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public final String f141769a;
    @c(a = "cdnUrl")

    /* renamed from: b  reason: collision with root package name */
    public final String f141770b;
    @c(a = "hash")

    /* renamed from: c  reason: collision with root package name */
    public final String f141771c;
    @c(a = "size")

    /* renamed from: d  reason: collision with root package name */
    public final int f141772d;

    static {
        Covode.recordClassIndex(92662);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f141769a, aVar.f141769a) && l.a(this.f141770b, aVar.f141770b) && l.a(this.f141771c, aVar.f141771c) && this.f141772d == aVar.f141772d;
    }

    public final int hashCode() {
        String str = this.f141769a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f141770b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141771c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.f141772d;
    }

    public final String toString() {
        return "DynamicResource(key=" + this.f141769a + ", cdnUrl=" + this.f141770b + ", hash=" + this.f141771c + ", size=" + this.f141772d + ")";
    }

    private /* synthetic */ a() {
        this("", "", "");
    }

    private a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f141769a = str;
        this.f141770b = str2;
        this.f141771c = str3;
        this.f141772d = 0;
    }
}
