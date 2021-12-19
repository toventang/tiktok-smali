package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "click")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f112830a = false;

    static {
        Covode.recordClassIndex(72545);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f112830a == ((a) obj).f112830a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f112830a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ActionToReportStruct(click=" + this.f112830a + ")";
    }

    private a() {
    }
}
