package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "status")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f113267a = null;
    @c(a = "option_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f113268b = null;
    @c(a = "unsubscribe_desc")

    /* renamed from: c  reason: collision with root package name */
    public String f113269c = null;
    @c(a = "subscribe_desc")

    /* renamed from: d  reason: collision with root package name */
    public String f113270d = null;

    static {
        Covode.recordClassIndex(72824);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f113267a, mVar.f113267a) && l.a(this.f113268b, mVar.f113268b) && l.a(this.f113269c, mVar.f113269c) && l.a(this.f113270d, mVar.f113270d);
    }

    public final int hashCode() {
        Integer num = this.f113267a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f113268b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f113269c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f113270d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "NotificationMarketSettingsData(status=" + this.f113267a + ", optionMsg=" + this.f113268b + ", unsubscribeDesc=" + this.f113269c + ", subscribeDesc=" + this.f113270d + ")";
    }

    private m() {
    }
}
