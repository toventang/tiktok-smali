package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "show_video_gift_entrance")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f78474a;

    static {
        Covode.recordClassIndex(48737);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f78474a == ((a) obj).f78474a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f78474a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "GiftSettings(allowVideoGift=" + this.f78474a + ")";
    }
}
