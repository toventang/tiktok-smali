package com.ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public final String f71336a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f71337b;

    /* renamed from: c  reason: collision with root package name */
    public final String f71338c;

    static {
        Covode.recordClassIndex(43922);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return l.a(this.f71336a, ahVar.f71336a) && l.a(this.f71337b, ahVar.f71337b) && l.a(this.f71338c, ahVar.f71338c);
    }

    public final int hashCode() {
        String str = this.f71336a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f71337b;
        int hashCode2 = (hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        String str2 = this.f71338c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LikeParams(aid=" + this.f71336a + ", aweme=" + this.f71337b + ", enterFrom=" + this.f71338c + ")";
    }

    public /* synthetic */ ah() {
        this("", null, "");
    }

    public ah(String str, Aweme aweme, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f71336a = str;
        this.f71337b = aweme;
        this.f71338c = str2;
    }
}
