package com.bytedance.android.live.liveinteract.cohost.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "status")

    /* renamed from: a  reason: collision with root package name */
    public final int f10211a;

    static {
        Covode.recordClassIndex(5371);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f10211a == ((a) obj).f10211a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10211a;
    }

    public final String toString() {
        return "CoHostReplyRtcMessage(status=" + this.f10211a + ")";
    }

    public a(int i2) {
        this.f10211a = i2;
    }
}
