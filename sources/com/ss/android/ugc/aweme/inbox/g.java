package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class g {
    @c(a = "trigger_times")

    /* renamed from: a  reason: collision with root package name */
    public final int f104244a;
    @c(a = "limit_days")

    /* renamed from: b  reason: collision with root package name */
    public final int f104245b;
    @c(a = "max_limit_times")

    /* renamed from: c  reason: collision with root package name */
    public final int f104246c;

    static {
        Covode.recordClassIndex(66749);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f104244a == gVar.f104244a && this.f104245b == gVar.f104245b && this.f104246c == gVar.f104246c;
    }

    public final int hashCode() {
        return (((this.f104244a * 31) + this.f104245b) * 31) + this.f104246c;
    }

    public final String toString() {
        return "InboxCollapseMeta(triggerTimes=" + this.f104244a + ", limitDays=" + this.f104245b + ", limitTimes=" + this.f104246c + ")";
    }

    private g() {
        this.f104244a = 3;
        this.f104245b = 14;
        this.f104246c = 3;
    }

    public /* synthetic */ g(byte b2) {
        this();
    }
}
