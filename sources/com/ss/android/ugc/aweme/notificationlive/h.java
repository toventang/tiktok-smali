package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "status_msg")

    /* renamed from: a  reason: collision with root package name */
    public final String f114322a;
    @c(a = "status_code")

    /* renamed from: b  reason: collision with root package name */
    public final int f114323b;

    static {
        Covode.recordClassIndex(73511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f114322a, hVar.f114322a) && this.f114323b == hVar.f114323b;
    }

    public final int hashCode() {
        String str = this.f114322a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f114323b;
    }

    public final String toString() {
        return "NotificationGameStatus(statusMsg=" + this.f114322a + ", statusCode=" + this.f114323b + ")";
    }
}
