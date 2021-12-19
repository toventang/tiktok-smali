package com.bytedance.android.livesdk.mvp;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "event_name")

    /* renamed from: a  reason: collision with root package name */
    public final String f19791a = null;
    @c(a = "description")

    /* renamed from: b  reason: collision with root package name */
    public final String f19792b = null;
    @c(a = "detail_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f19793c = null;
    @c(a = "owner")

    /* renamed from: d  reason: collision with root package name */
    public final User f19794d = null;

    static {
        Covode.recordClassIndex(11734);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f19791a, aVar.f19791a) && l.a(this.f19792b, aVar.f19792b) && l.a(this.f19793c, aVar.f19793c) && l.a(this.f19794d, aVar.f19794d);
    }

    public final int hashCode() {
        String str = this.f19791a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19792b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19793c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.f19794d;
        if (user != null) {
            i2 = user.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "GatedRoomData(eventName=" + this.f19791a + ", description=" + this.f19792b + ", detailUrl=" + this.f19793c + ", owner=" + this.f19794d + ")";
    }

    private a() {
    }
}
