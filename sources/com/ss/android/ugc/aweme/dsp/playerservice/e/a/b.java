package com.ss.android.ugc.aweme.dsp.playerservice.e.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f83534a;

    static {
        Covode.recordClassIndex(52137);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f83534a, ((b) obj).f83534a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f83534a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PageInfo(cursor=" + this.f83534a + ")";
    }

    public /* synthetic */ b() {
        this("");
    }

    private b(String str) {
        l.d(str, "");
        this.f83534a = str;
    }
}
