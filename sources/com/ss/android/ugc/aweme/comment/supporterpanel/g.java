package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "gift_and_senders")

    /* renamed from: a  reason: collision with root package name */
    public final a f72380a;

    static {
        Covode.recordClassIndex(44625);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f72380a, ((g) obj).f72380a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f72380a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GiftSupporterPanelTopBanner(topGiftAndSenders=" + this.f72380a + ")";
    }
}
