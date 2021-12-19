package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class g implements a {
    @c(a = "beautify_on")

    /* renamed from: b  reason: collision with root package name */
    private final int f68632b = 0;
    @c(a = "is_mbeautify")

    /* renamed from: c  reason: collision with root package name */
    private final int f68633c = 0;

    static {
        Covode.recordClassIndex(42234);
    }

    @Override // com.ss.android.ugc.aweme.beauty.a
    public final int getBeautyStatus() {
        return this.f68632b;
    }

    private g() {
    }

    public final int hashCode() {
        return (getBeautyStatus() * 31) + this.f68633c;
    }

    public final String toString() {
        return "MBeautyStateInfo(beautyStatus=" + getBeautyStatus() + ", modeChosen=" + this.f68633c + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (getBeautyStatus() == gVar.getBeautyStatus() && this.f68633c == gVar.f68633c) {
            return true;
        }
        return false;
    }
}
