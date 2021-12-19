package com.ss.android.ugc.aweme.detail.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f79635a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f79636b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f79637c;

    static {
        Covode.recordClassIndex(49478);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f79635a, bVar.f79635a) && l.a(this.f79636b, bVar.f79636b) && l.a(this.f79637c, bVar.f79637c);
    }

    public final int hashCode() {
        String str = this.f79635a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f79636b;
        int hashCode2 = (hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        Throwable th = this.f79637c;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DetailAwemeRespEvent(aid=" + this.f79635a + ", aweme=" + this.f79636b + ", error=" + this.f79637c + ")";
    }

    public b(String str, Aweme aweme, Throwable th) {
        this.f79635a = str;
        this.f79636b = aweme;
        this.f79637c = th;
    }
}
