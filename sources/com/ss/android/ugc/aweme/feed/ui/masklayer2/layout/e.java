package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f94958a;

    /* renamed from: b  reason: collision with root package name */
    public final int f94959b;

    static {
        Covode.recordClassIndex(60226);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f94958a == eVar.f94958a && this.f94959b == eVar.f94959b;
    }

    public final int hashCode() {
        return (this.f94958a * 31) + this.f94959b;
    }

    public final String toString() {
        return "OptionDescVO(imageResId=" + this.f94958a + ", textResId=" + this.f94959b + ")";
    }

    public e(int i2, int i3) {
        this.f94958a = i2;
        this.f94959b = i3;
    }
}
