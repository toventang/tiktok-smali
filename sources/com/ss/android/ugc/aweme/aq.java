package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class aq {

    /* renamed from: a  reason: collision with root package name */
    public final String f66962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f66963b;

    static {
        Covode.recordClassIndex(41270);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return l.a(this.f66962a, aqVar.f66962a) && l.a(this.f66963b, aqVar.f66963b);
    }

    public final int hashCode() {
        String str = this.f66962a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f66963b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BindMobileFinishData(phone=" + this.f66962a + ", response=" + this.f66963b + ")";
    }

    public aq(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f66962a = str;
        this.f66963b = str2;
    }
}
