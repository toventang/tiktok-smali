package com.ss.android.ugc.aweme.im.sdk.notification;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f102886a;

    /* renamed from: b  reason: collision with root package name */
    public final String f102887b;

    /* renamed from: c  reason: collision with root package name */
    public final c f102888c;

    static {
        Covode.recordClassIndex(65958);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f102886a, bVar.f102886a) && l.a(this.f102887b, bVar.f102887b) && l.a(this.f102888c, bVar.f102888c);
    }

    public final int hashCode() {
        String str = this.f102886a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102887b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        c cVar = this.f102888c;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NotificationTip(conversationId=" + this.f102886a + ", hint=" + this.f102887b + ", type=" + this.f102888c + ")";
    }

    public b(String str, String str2, c cVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(cVar, "");
        this.f102886a = str;
        this.f102887b = str2;
        this.f102888c = cVar;
    }
}
