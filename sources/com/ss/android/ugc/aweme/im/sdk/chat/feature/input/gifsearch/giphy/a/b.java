package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class b {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final String f100769a = null;
    @c(a = "id")

    /* renamed from: b  reason: collision with root package name */
    public final String f100770b = null;
    @c(a = "images")

    /* renamed from: c  reason: collision with root package name */
    public final d f100771c = null;
    @c(a = "title")

    /* renamed from: d  reason: collision with root package name */
    public final String f100772d = null;
    @c(a = "analytics")

    /* renamed from: e  reason: collision with root package name */
    public final a f100773e = null;

    static {
        Covode.recordClassIndex(64472);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f100769a, bVar.f100769a) && l.a(this.f100770b, bVar.f100770b) && l.a(this.f100771c, bVar.f100771c) && l.a(this.f100772d, bVar.f100772d) && l.a(this.f100773e, bVar.f100773e);
    }

    public final int hashCode() {
        String str = this.f100769a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100770b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        d dVar = this.f100771c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str3 = this.f100772d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        a aVar = this.f100773e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "GiphyDataBean(type=" + this.f100769a + ", id=" + this.f100770b + ", images=" + this.f100771c + ", title=" + this.f100772d + ", analytics=" + this.f100773e + ")";
    }

    private b() {
    }
}
