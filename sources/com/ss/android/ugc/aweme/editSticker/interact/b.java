package com.ss.android.ugc.aweme.editSticker.interact;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public float f88160a;

    /* renamed from: b  reason: collision with root package name */
    public float f88161b;

    /* renamed from: c  reason: collision with root package name */
    public float f88162c;

    /* renamed from: d  reason: collision with root package name */
    public float f88163d;

    static {
        Covode.recordClassIndex(55424);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f88160a, bVar.f88160a) == 0 && Float.compare(this.f88161b, bVar.f88161b) == 0 && Float.compare(this.f88162c, bVar.f88162c) == 0 && Float.compare(this.f88163d, bVar.f88163d) == 0;
    }

    public final String toString() {
        return "EditStickerLocationData(rotate=" + this.f88160a + ", scale=" + this.f88161b + ", xLocation=" + this.f88162c + ", yLocation=" + this.f88163d + ")";
    }

    private /* synthetic */ b() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.f88160a) * 31) + Float.floatToIntBits(this.f88161b)) * 31) + Float.floatToIntBits(this.f88162c)) * 31) + Float.floatToIntBits(this.f88163d);
    }

    public b(float f2, float f3, float f4, float f5) {
        this.f88160a = f2;
        this.f88161b = f3;
        this.f88162c = f4;
        this.f88163d = f5;
    }
}
