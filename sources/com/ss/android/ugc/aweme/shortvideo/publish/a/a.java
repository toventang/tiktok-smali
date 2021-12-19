package com.ss.android.ugc.aweme.shortvideo.publish.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f129677a;

    static {
        Covode.recordClassIndex(85135);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f129677a, ((a) obj).f129677a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f129677a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CancelCause(cause=" + this.f129677a + ")";
    }

    private /* synthetic */ a() {
        this("");
    }

    public a(String str) {
        l.d(str, "");
        this.f129677a = str;
    }
}
