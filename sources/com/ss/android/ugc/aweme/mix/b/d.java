package com.ss.android.ugc.aweme.mix.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f109811a = true;

    /* renamed from: b  reason: collision with root package name */
    public final String f109812b;

    /* renamed from: c  reason: collision with root package name */
    public final String f109813c;

    /* renamed from: d  reason: collision with root package name */
    public final Aweme f109814d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f109815e;

    /* renamed from: f  reason: collision with root package name */
    public final String f109816f;

    static {
        Covode.recordClassIndex(70323);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f109811a == dVar.f109811a && l.a(this.f109812b, dVar.f109812b) && l.a(this.f109813c, dVar.f109813c) && l.a(this.f109814d, dVar.f109814d) && this.f109815e == dVar.f109815e && l.a(this.f109816f, dVar.f109816f);
    }

    public final int hashCode() {
        boolean z = this.f109811a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        String str = this.f109812b;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f109813c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Aweme aweme = this.f109814d;
        int hashCode3 = (hashCode2 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        if (!this.f109815e) {
            i2 = 0;
        }
        int i8 = (hashCode3 + i2) * 31;
        String str3 = this.f109816f;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "CreateMixListInFeedEvent(success=" + this.f109811a + ", name=" + this.f109812b + ", id=" + this.f109813c + ", aweme=" + this.f109814d + ", needOpenDialog=" + this.f109815e + ", enterMethod=" + this.f109816f + ")";
    }

    public d(String str, String str2, Aweme aweme, boolean z, String str3) {
        l.d(str, "");
        l.d(str2, "");
        this.f109812b = str;
        this.f109813c = str2;
        this.f109814d = aweme;
        this.f109815e = z;
        this.f109816f = str3;
    }
}
