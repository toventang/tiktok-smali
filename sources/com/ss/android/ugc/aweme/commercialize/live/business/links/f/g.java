package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "action_type")

    /* renamed from: a  reason: collision with root package name */
    public final String f74638a;
    @c(a = "live_status")

    /* renamed from: b  reason: collision with root package name */
    public final String f74639b;
    @c(a = "count")

    /* renamed from: c  reason: collision with root package name */
    public final int f74640c;
    @c(a = "card_data")

    /* renamed from: d  reason: collision with root package name */
    public final h f74641d;

    static {
        Covode.recordClassIndex(46022);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f74638a, gVar.f74638a) && l.a(this.f74639b, gVar.f74639b) && this.f74640c == gVar.f74640c && l.a(this.f74641d, gVar.f74641d);
    }

    public final int hashCode() {
        String str = this.f74638a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f74639b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f74640c) * 31;
        h hVar = this.f74641d;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BusinessLinksLiveLinkPin(actionType=" + this.f74638a + ", liveStatus=" + this.f74639b + ", count=" + this.f74640c + ", cardData=" + this.f74641d + ")";
    }
}
