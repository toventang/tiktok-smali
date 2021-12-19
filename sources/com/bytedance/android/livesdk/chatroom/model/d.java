package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "msg_id")

    /* renamed from: a  reason: collision with root package name */
    public final long f15748a;
    @c(a = "user")

    /* renamed from: b  reason: collision with root package name */
    public final User f15749b;

    static {
        Covode.recordClassIndex(8697);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15748a == dVar.f15748a && l.a(this.f15749b, dVar.f15749b);
    }

    public final String toString() {
        return "EmoteChatResult(msgId=" + this.f15748a + ", user=" + this.f15749b + ")";
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f15748a;
        int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        User user = this.f15749b;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }
}
