package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class e {
    @c(a = "top_banner")

    /* renamed from: a  reason: collision with root package name */
    public final g f72375a;
    @c(a = "gift_and_senders")

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f72376b;

    static {
        Covode.recordClassIndex(44623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f72375a, eVar.f72375a) && l.a(this.f72376b, eVar.f72376b);
    }

    public final int hashCode() {
        g gVar = this.f72375a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        List<a> list = this.f72376b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "GiftSupporterPanelInfo(topBanner=" + this.f72375a + ", otherGifts=" + this.f72376b + ")";
    }
}
