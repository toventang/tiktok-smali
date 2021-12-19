package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.covode.number.Covode;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f132744a;

    /* renamed from: b  reason: collision with root package name */
    public final float f132745b;

    /* renamed from: c  reason: collision with root package name */
    public final int f132746c;

    /* renamed from: d  reason: collision with root package name */
    public final int f132747d;

    static {
        Covode.recordClassIndex(86869);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f132744a == jVar.f132744a && Float.compare(this.f132745b, jVar.f132745b) == 0 && this.f132746c == jVar.f132746c && this.f132747d == jVar.f132747d;
    }

    public final int hashCode() {
        return (((((this.f132744a * 31) + Float.floatToIntBits(this.f132745b)) * 31) + this.f132746c) * 31) + this.f132747d;
    }

    public final String toString() {
        return "RecordControlSetting(recordQuality=" + this.f132744a + ", recordBitrate=" + this.f132745b + ", bitrateMode=" + this.f132746c + ", hardwareProfileLevel=" + this.f132747d + ")";
    }

    public /* synthetic */ j() {
        this(18, 2.25f, 1, 1);
    }

    public j(int i2, float f2, int i3, int i4) {
        this.f132744a = i2;
        this.f132745b = f2;
        this.f132746c = i3;
        this.f132747d = i4;
    }
}
