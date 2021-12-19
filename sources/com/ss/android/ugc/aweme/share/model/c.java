package com.ss.android.ugc.aweme.share.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.share.silent.c f124106a;

    /* renamed from: b  reason: collision with root package name */
    public String f124107b;

    /* renamed from: c  reason: collision with root package name */
    public String f124108c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f124109d;

    static {
        Covode.recordClassIndex(81510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f124106a, cVar.f124106a) && l.a(this.f124107b, cVar.f124107b) && l.a(this.f124108c, cVar.f124108c) && l.a(this.f124109d, cVar.f124109d);
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.share.silent.c cVar = this.f124106a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f124107b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f124108c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Aweme aweme = this.f124109d;
        if (aweme != null) {
            i2 = aweme.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "SilentShareInfo(silentShareChannel=" + this.f124106a + ", silentShareLink=" + this.f124107b + ", silentShareForm=" + this.f124108c + ", silentShareAweme=" + this.f124109d + ")";
    }

    public final void a(String str) {
        l.d(str, "");
        this.f124107b = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f124108c = str;
    }

    public c(com.ss.android.ugc.aweme.share.silent.c cVar, String str, String str2, Aweme aweme) {
        l.d(cVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(aweme, "");
        this.f124106a = cVar;
        this.f124107b = str;
        this.f124108c = str2;
        this.f124109d = aweme;
    }
}
