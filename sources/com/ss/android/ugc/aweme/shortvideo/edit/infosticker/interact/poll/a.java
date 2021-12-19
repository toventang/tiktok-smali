package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f127505a;

    /* renamed from: b  reason: collision with root package name */
    public float f127506b;

    /* renamed from: c  reason: collision with root package name */
    public float f127507c;

    /* renamed from: d  reason: collision with root package name */
    public float f127508d;

    /* renamed from: e  reason: collision with root package name */
    public float f127509e;

    /* renamed from: f  reason: collision with root package name */
    public int f127510f;

    static {
        Covode.recordClassIndex(83597);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f127505a, aVar.f127505a) == 0 && Float.compare(this.f127506b, aVar.f127506b) == 0 && Float.compare(this.f127507c, aVar.f127507c) == 0 && Float.compare(this.f127508d, aVar.f127508d) == 0 && Float.compare(this.f127509e, aVar.f127509e) == 0 && this.f127510f == aVar.f127510f;
    }

    public final String toString() {
        return "AnimatorInfo(scaleX=" + this.f127505a + ", scaleY=" + this.f127506b + ", rotation=" + this.f127507c + ", x=" + this.f127508d + ", y=" + this.f127509e + ", focusIndex=" + this.f127510f + ")";
    }

    private a() {
        this.f127505a = 1.0f;
        this.f127506b = 1.0f;
        this.f127507c = 0.0f;
        this.f127508d = 0.0f;
        this.f127509e = 0.0f;
        this.f127510f = 0;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.f127505a) * 31) + Float.floatToIntBits(this.f127506b)) * 31) + Float.floatToIntBits(this.f127507c)) * 31) + Float.floatToIntBits(this.f127508d)) * 31) + Float.floatToIntBits(this.f127509e)) * 31) + this.f127510f;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
