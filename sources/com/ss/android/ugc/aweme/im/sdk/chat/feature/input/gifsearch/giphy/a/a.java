package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "onclick")

    /* renamed from: a  reason: collision with root package name */
    public final e f100768a = null;

    static {
        Covode.recordClassIndex(64471);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f100768a, ((a) obj).f100768a);
        }
        return true;
    }

    public final int hashCode() {
        e eVar = this.f100768a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GiphyAnalyticsBean(onclick=" + this.f100768a + ")";
    }

    private a() {
    }
}
