package com.ss.android.ugc.aweme.setting.serverpush.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "is_show")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f122557a;
    @com.google.gson.a.c(a = "h5_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f122558b;

    static {
        Covode.recordClassIndex(80413);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f122557a == cVar.f122557a && l.a(this.f122558b, cVar.f122558b);
    }

    public final int hashCode() {
        boolean z = this.f122557a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f122558b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "JoinBetaEntrance(show=" + this.f122557a + ", url=" + this.f122558b + ")";
    }
}
