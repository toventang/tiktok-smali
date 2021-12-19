package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f114319a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114320b;

    /* renamed from: c  reason: collision with root package name */
    public final String f114321c;

    static {
        Covode.recordClassIndex(73510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f114319a == gVar.f114319a && l.a(this.f114320b, gVar.f114320b) && l.a(this.f114321c, gVar.f114321c);
    }

    public final int hashCode() {
        boolean z = this.f114319a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f114320b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f114321c;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "NotificationGameRequestParam(enableNotice=" + this.f114319a + ", creativeId=" + this.f114320b + ", logId=" + this.f114321c + ")";
    }

    public g(boolean z, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f114319a = z;
        this.f114320b = str;
        this.f114321c = str2;
    }
}
