package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class f {
    @c(a = "has_more")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f100779a = false;
    @c(a = "next_offset")

    /* renamed from: b  reason: collision with root package name */
    public final int f100780b = 0;

    static {
        Covode.recordClassIndex(64476);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f100779a == fVar.f100779a && this.f100780b == fVar.f100780b;
    }

    public final int hashCode() {
        boolean z = this.f100779a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f100780b;
    }

    public final String toString() {
        return "GiphyPaginationBean(hasMore=" + this.f100779a + ", nextOffset=" + this.f100780b + ")";
    }

    private f() {
    }
}
