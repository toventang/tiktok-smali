package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "action_type")

    /* renamed from: a  reason: collision with root package name */
    public final String f74636a;
    @c(a = "link_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f74637b;

    static {
        Covode.recordClassIndex(46021);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f74636a, fVar.f74636a) && l.a(this.f74637b, fVar.f74637b);
    }

    public final int hashCode() {
        String str = this.f74636a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f74637b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BusinessLinksLiveLinkCard(actionType=" + this.f74636a + ", linkId=" + this.f74637b + ")";
    }
}
