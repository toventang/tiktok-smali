package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class p {
    @c(a = "canvas_default_duration_without_music")

    /* renamed from: a  reason: collision with root package name */
    public final int f118589a = 10000;
    @c(a = "canvas_min_duration_with_music")

    /* renamed from: b  reason: collision with root package name */
    public final int f118590b;
    @c(a = "canvas_max_duration_with_music")

    /* renamed from: c  reason: collision with root package name */
    public final int f118591c;

    static {
        Covode.recordClassIndex(77014);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f118589a == pVar.f118589a && this.f118590b == pVar.f118590b && this.f118591c == pVar.f118591c;
    }

    public final int hashCode() {
        return (((this.f118589a * 31) + this.f118590b) * 31) + this.f118591c;
    }

    public final String toString() {
        return "CanvasDurationConfig(defaultDuration=" + this.f118589a + ", minDuration=" + this.f118590b + ", maxDuration=" + this.f118591c + ")";
    }

    public p(int i2, int i3) {
        this.f118590b = i2;
        this.f118591c = i3;
    }
}
