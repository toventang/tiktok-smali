package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "gift")

    /* renamed from: a  reason: collision with root package name */
    public final c f72354a;
    @c(a = "senders")

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f72355b;

    /* renamed from: c  reason: collision with root package name */
    public String f72356c;

    static {
        Covode.recordClassIndex(44619);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f72354a, aVar.f72354a) && l.a(this.f72355b, aVar.f72355b) && l.a(this.f72356c, aVar.f72356c);
    }

    public final int hashCode() {
        c cVar = this.f72354a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        List<d> list = this.f72355b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f72356c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "GiftAndSenders(gift=" + this.f72354a + ", giftSenders=" + this.f72355b + ", selectedType=" + this.f72356c + ")";
    }

    public final void a(String str) {
        l.d(str, "");
        this.f72356c = str;
    }
}
