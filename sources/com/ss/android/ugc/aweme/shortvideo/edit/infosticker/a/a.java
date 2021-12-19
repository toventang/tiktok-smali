package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.e;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public int f127093a;

    /* renamed from: b  reason: collision with root package name */
    public int f127094b;

    /* renamed from: c  reason: collision with root package name */
    public float f127095c;

    /* renamed from: d  reason: collision with root package name */
    public float f127096d;

    /* renamed from: e  reason: collision with root package name */
    public float f127097e;

    /* renamed from: f  reason: collision with root package name */
    public float f127098f;

    static {
        Covode.recordClassIndex(83383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f127093a == aVar.f127093a && this.f127094b == aVar.f127094b && Float.compare(this.f127095c, aVar.f127095c) == 0 && Float.compare(this.f127096d, aVar.f127096d) == 0 && Float.compare(this.f127097e, aVar.f127097e) == 0 && Float.compare(this.f127098f, aVar.f127098f) == 0;
    }

    public final String toString() {
        return "InfoStickerTimeEditData(startTime=" + this.f127093a + ", endTime=" + this.f127094b + ", rotate=" + this.f127095c + ", scale=" + this.f127096d + ", xPercent=" + this.f127097e + ", yPercent=" + this.f127098f + ")";
    }

    private /* synthetic */ a() {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((((this.f127093a * 31) + this.f127094b) * 31) + Float.floatToIntBits(this.f127095c)) * 31) + Float.floatToIntBits(this.f127096d)) * 31) + Float.floatToIntBits(this.f127097e)) * 31) + Float.floatToIntBits(this.f127098f);
    }

    public a(int i2, int i3, float f2, float f3, float f4, float f5) {
        this.f127093a = i2;
        this.f127094b = i3;
        this.f127095c = f2;
        this.f127096d = f3;
        this.f127097e = f4;
        this.f127098f = f5;
    }
}
