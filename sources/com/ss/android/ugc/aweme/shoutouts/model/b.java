package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class b {
    @c(a = "order_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f133204a;
    @c(a = "video_info")

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f133205b;

    static {
        Covode.recordClassIndex(87114);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f133204a, bVar.f133204a) && l.a(this.f133205b, bVar.f133205b);
    }

    public final int hashCode() {
        String str = this.f133204a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f133205b;
        if (aweme != null) {
            i2 = aweme.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShoutoutsOrder(orderId=" + this.f133204a + ", aweme=" + this.f133205b + ")";
    }
}
