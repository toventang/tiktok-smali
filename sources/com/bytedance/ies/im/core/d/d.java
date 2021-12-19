package com.bytedance.ies.im.core.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "msg_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f34040a;
    @c(a = "err_code")

    /* renamed from: b  reason: collision with root package name */
    public final int f34041b;
    @c(a = "err_desc")

    /* renamed from: c  reason: collision with root package name */
    public final String f34042c;
    @c(a = "log_id")

    /* renamed from: d  reason: collision with root package name */
    public final String f34043d;

    static {
        Covode.recordClassIndex(20274);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f34040a == dVar.f34040a && this.f34041b == dVar.f34041b && l.a(this.f34042c, dVar.f34042c) && l.a(this.f34043d, dVar.f34043d);
    }

    public final int hashCode() {
        int i2 = ((this.f34040a * 31) + this.f34041b) * 31;
        String str = this.f34042c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34043d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "FeedBackModel(msgType=" + this.f34040a + ", errorCode=" + this.f34041b + ", errorDesc=" + this.f34042c + ", logId=" + this.f34043d + ")";
    }

    private /* synthetic */ d() {
        this(-1, 0, "", "");
    }

    public d(int i2, int i3, String str, String str2) {
        this.f34040a = i2;
        this.f34041b = i3;
        this.f34042c = str;
        this.f34043d = str2;
    }
}
