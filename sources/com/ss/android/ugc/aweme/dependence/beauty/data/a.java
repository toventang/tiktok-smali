package com.ss.android.ugc.aweme.dependence.beauty.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "beautify_on")

    /* renamed from: a  reason: collision with root package name */
    private final int f79587a;
    @c(a = "is_mbeautify")

    /* renamed from: b  reason: collision with root package name */
    private final int f79588b;

    static {
        Covode.recordClassIndex(49441);
    }

    private /* synthetic */ a() {
        this(0, 0);
    }

    public final int hashCode() {
        return (this.f79587a * 31) + this.f79588b;
    }

    public final String toString() {
        return "MBeautyStateInfoCopy(beautyStatus=" + this.f79587a + ", modeChosen=" + this.f79588b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f79587a == aVar.f79587a && this.f79588b == aVar.f79588b) {
            return true;
        }
        return false;
    }

    public a(int i2, int i3) {
        this.f79587a = i2;
        this.f79588b = i3;
    }
}
