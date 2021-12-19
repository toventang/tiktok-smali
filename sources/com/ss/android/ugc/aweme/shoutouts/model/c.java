package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f133206a;
    @com.google.gson.a.c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f133207b;
    @com.google.gson.a.c(a = "order_detail")

    /* renamed from: c  reason: collision with root package name */
    public final b f133208c;

    static {
        Covode.recordClassIndex(87115);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f133206a == cVar.f133206a && l.a(this.f133207b, cVar.f133207b) && l.a(this.f133208c, cVar.f133208c);
    }

    public final int hashCode() {
        int i2 = this.f133206a * 31;
        String str = this.f133207b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        b bVar = this.f133208c;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ShoutoutsOrderGetResp(statusCode=" + this.f133206a + ", statusMsg=" + this.f133207b + ", orderStruct=" + this.f133208c + ")";
    }
}
