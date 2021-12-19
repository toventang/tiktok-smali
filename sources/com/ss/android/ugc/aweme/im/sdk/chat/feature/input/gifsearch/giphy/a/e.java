package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "url")

    /* renamed from: a  reason: collision with root package name */
    public final String f100778a = null;

    static {
        Covode.recordClassIndex(64475);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f100778a, ((e) obj).f100778a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f100778a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GiphyOnclickBean(url=" + this.f100778a + ")";
    }

    private e() {
    }
}
