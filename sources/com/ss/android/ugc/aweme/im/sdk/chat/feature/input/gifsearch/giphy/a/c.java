package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f100774a = null;
    @com.google.gson.a.c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f100775b = null;
    @com.google.gson.a.c(a = "resources")

    /* renamed from: c  reason: collision with root package name */
    public final g f100776c = null;

    static {
        Covode.recordClassIndex(64473);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f100774a, cVar.f100774a) && l.a(this.f100775b, cVar.f100775b) && l.a(this.f100776c, cVar.f100776c);
    }

    public final int hashCode() {
        Integer num = this.f100774a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f100775b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f100776c;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "GiphyGifsResponse(statusCode=" + this.f100774a + ", statusMsg=" + this.f100775b + ", giphyResources=" + this.f100776c + ")";
    }

    private c() {
    }
}
