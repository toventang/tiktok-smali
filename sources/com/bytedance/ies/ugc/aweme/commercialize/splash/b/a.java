package com.bytedance.ies.ugc.aweme.commercialize.splash.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f34738a;

    static {
        Covode.recordClassIndex(20828);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f34738a, ((a) obj).f34738a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f34738a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DeleteTopviewAwemeEvent(aweme=" + this.f34738a + ")";
    }

    public a(Aweme aweme) {
        l.d(aweme, "");
        this.f34738a = aweme;
    }
}
