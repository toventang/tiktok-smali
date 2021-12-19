package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f100791a;

    /* renamed from: b  reason: collision with root package name */
    public final b.c f100792b;

    static {
        Covode.recordClassIndex(64487);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f100791a, aVar.f100791a) && l.a(this.f100792b, aVar.f100792b);
    }

    public final int hashCode() {
        Aweme aweme = this.f100791a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        b.c cVar = this.f100792b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SendVideoEvent(video=" + this.f100791a + ", sendMethod=" + this.f100792b + ")";
    }

    public a(Aweme aweme, b.c cVar) {
        l.d(aweme, "");
        l.d(cVar, "");
        this.f100791a = aweme;
        this.f100792b = cVar;
    }
}
