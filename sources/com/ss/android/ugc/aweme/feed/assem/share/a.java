package com.ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f92440a;

    /* renamed from: b  reason: collision with root package name */
    public String f92441b;

    static {
        Covode.recordClassIndex(58520);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f92440a, aVar.f92440a) && l.a(this.f92441b, aVar.f92441b);
    }

    public final int hashCode() {
        Aweme aweme = this.f92440a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f92441b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AnimateItem(aweme=" + this.f92440a + ", eventType=" + this.f92441b + ")";
    }

    public a(Aweme aweme, String str) {
        this.f92440a = aweme;
        this.f92441b = str;
    }
}
