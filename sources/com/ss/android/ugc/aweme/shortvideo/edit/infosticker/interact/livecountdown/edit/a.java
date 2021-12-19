package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f127453a;

    /* renamed from: b  reason: collision with root package name */
    public float f127454b;

    /* renamed from: c  reason: collision with root package name */
    public float f127455c;

    /* renamed from: d  reason: collision with root package name */
    public float f127456d;

    /* renamed from: e  reason: collision with root package name */
    public float f127457e;

    /* renamed from: f  reason: collision with root package name */
    public int f127458f;

    static {
        Covode.recordClassIndex(83564);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f127453a, aVar.f127453a) == 0 && Float.compare(this.f127454b, aVar.f127454b) == 0 && Float.compare(this.f127455c, aVar.f127455c) == 0 && Float.compare(this.f127456d, aVar.f127456d) == 0 && Float.compare(this.f127457e, aVar.f127457e) == 0 && this.f127458f == aVar.f127458f;
    }

    public final String toString() {
        return "AnimatorInfo(scaleX=" + this.f127453a + ", scaleY=" + this.f127454b + ", rotation=" + this.f127455c + ", x=" + this.f127456d + ", y=" + this.f127457e + ", focusIndex=" + this.f127458f + ")";
    }

    private a() {
        this.f127453a = 1.0f;
        this.f127454b = 1.0f;
        this.f127455c = 0.0f;
        this.f127456d = 0.0f;
        this.f127457e = 0.0f;
        this.f127458f = 0;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.f127453a) * 31) + Float.floatToIntBits(this.f127454b)) * 31) + Float.floatToIntBits(this.f127455c)) * 31) + Float.floatToIntBits(this.f127456d)) * 31) + Float.floatToIntBits(this.f127457e)) * 31) + this.f127458f;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
