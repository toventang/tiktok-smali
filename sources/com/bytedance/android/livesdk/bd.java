package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    public String f14200a;

    /* renamed from: b  reason: collision with root package name */
    public long f14201b;

    /* renamed from: c  reason: collision with root package name */
    public String f14202c;

    /* renamed from: d  reason: collision with root package name */
    public String f14203d;

    static {
        Covode.recordClassIndex(7868);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return l.a(this.f14200a, bdVar.f14200a) && this.f14201b == bdVar.f14201b && l.a(this.f14202c, bdVar.f14202c) && l.a(this.f14203d, bdVar.f14203d);
    }

    public final String toString() {
        return "ShowRechargeDialogData(chargeReason=" + this.f14200a + ", needCoins=" + this.f14201b + ", previousPage=" + this.f14202c + ", giftEnterFrom=" + this.f14203d + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        String str = this.f14200a;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f14201b;
        int i5 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f14202c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str3 = this.f14203d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    public bd(String str, long j2, String str2, String str3) {
        l.d(str, "");
        this.f14200a = str;
        this.f14201b = j2;
        this.f14202c = str2;
        this.f14203d = str3;
    }
}
