package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class n {
    @c(a = "title_msg")

    /* renamed from: a  reason: collision with root package name */
    public final String f113271a = null;
    @c(a = "marketing_setting")

    /* renamed from: b  reason: collision with root package name */
    public final m f113272b = null;

    static {
        Covode.recordClassIndex(72825);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f113271a, nVar.f113271a) && l.a(this.f113272b, nVar.f113272b);
    }

    public final int hashCode() {
        String str = this.f113271a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        m mVar = this.f113272b;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NotificationSubscribeData(titleMsg=" + this.f113271a + ", marketSetting=" + this.f113272b + ")";
    }

    private n() {
    }
}
