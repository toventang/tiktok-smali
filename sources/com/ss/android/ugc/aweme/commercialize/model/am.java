package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class am {
    @c(a = "seconds")

    /* renamed from: a  reason: collision with root package name */
    public final int f74866a = 0;
    @c(a = "url_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f74867b = null;

    static {
        Covode.recordClassIndex(46160);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f74866a == amVar.f74866a && l.a(this.f74867b, amVar.f74867b);
    }

    public final int hashCode() {
        int i2 = this.f74866a * 31;
        List<String> list = this.f74867b;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PlaybackSecondsTrack(seconds=" + this.f74866a + ", urlList=" + this.f74867b + ")";
    }

    private am() {
    }
}
