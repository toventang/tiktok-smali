package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class g {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f100781a = null;
    @c(a = "pagination")

    /* renamed from: b  reason: collision with root package name */
    public final f f100782b = null;

    static {
        Covode.recordClassIndex(64477);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f100781a, gVar.f100781a) && l.a(this.f100782b, gVar.f100782b);
    }

    public final int hashCode() {
        List<b> list = this.f100781a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        f fVar = this.f100782b;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "GiphyResourcesBean(data=" + this.f100781a + ", pagination=" + this.f100782b + ")";
    }

    private g() {
    }
}
