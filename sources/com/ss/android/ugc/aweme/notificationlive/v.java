package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f114473a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114474b;

    static {
        Covode.recordClassIndex(73671);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f114473a == vVar.f114473a && l.a(this.f114474b, vVar.f114474b);
    }

    public final int hashCode() {
        int i2 = this.f114473a * 31;
        String str = this.f114474b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationLiveRequestParam(pushStatus=" + this.f114473a + ", secToUserId=" + this.f114474b + ")";
    }

    public v(int i2, String str) {
        l.d(str, "");
        this.f114473a = i2;
        this.f114474b = str;
    }
}
