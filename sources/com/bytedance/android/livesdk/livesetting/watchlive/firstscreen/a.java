package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "score_high")

    /* renamed from: a  reason: collision with root package name */
    public final float f18751a;
    @c(a = "score_low")

    /* renamed from: b  reason: collision with root package name */
    public final float f18752b;

    static {
        Covode.recordClassIndex(11090);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f18751a, aVar.f18751a) == 0 && Float.compare(this.f18752b, aVar.f18752b) == 0;
    }

    public final String toString() {
        return "MultiPlayerScoreLimit(scoreHigh=" + this.f18751a + ", scoreLow=" + this.f18752b + ")";
    }

    private a() {
        this.f18751a = -1.0f;
        this.f18752b = -1.0f;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f18751a) * 31) + Float.floatToIntBits(this.f18752b);
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
