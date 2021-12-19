package com.ss.android.ugc.aweme.commercialize.profile.talent.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class b {
    @c(a = "previous_item_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f75264a;
    @c(a = "aweme_info")

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f75265b;

    static {
        Covode.recordClassIndex(46441);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f75264a, bVar.f75264a) && l.a(this.f75265b, bVar.f75265b);
    }

    public final int hashCode() {
        String str = this.f75264a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f75265b;
        if (aweme != null) {
            i2 = aweme.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileAdData(previousItemId=" + this.f75264a + ", aweme=" + this.f75265b + ")";
    }
}
