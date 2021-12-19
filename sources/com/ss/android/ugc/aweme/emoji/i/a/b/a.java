package com.ss.android.ugc.aweme.emoji.i.a.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.v;

public final class a extends com.ss.android.ugc.aweme.im.service.g.a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f89343a;

    static {
        Covode.recordClassIndex(56139);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f89343a == ((a) obj).f89343a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f89343a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "GeckoSmallEmojiLoadEventBody(isSuccess=" + this.f89343a + ")";
    }

    public a(boolean z) {
        super(ag.a(v.a("is_success", Boolean.valueOf(z))), null, null, 6);
        this.f89343a = z;
    }
}
