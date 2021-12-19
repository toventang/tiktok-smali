package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public User f15058a;

    /* renamed from: b  reason: collision with root package name */
    public String f15059b;

    static {
        Covode.recordClassIndex(8366);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f15058a, aVar.f15058a) && l.a(this.f15059b, aVar.f15059b);
    }

    public final int hashCode() {
        User user = this.f15058a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        String str = this.f15059b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AnchorKickOutGuestEvent(user=" + this.f15058a + ", kickOutSource=" + this.f15059b + ")";
    }

    public a(User user, String str) {
        l.d(user, "");
        l.d(str, "");
        this.f15058a = user;
        this.f15059b = str;
    }
}
