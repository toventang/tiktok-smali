package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f103718a;

    /* renamed from: b  reason: collision with root package name */
    public final int f103719b;

    static {
        Covode.recordClassIndex(66445);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f103718a == bVar.f103718a && this.f103719b == bVar.f103719b;
    }

    public final int hashCode() {
        return (this.f103718a * 31) + this.f103719b;
    }

    public final String toString() {
        return "SendButtonText(resId=" + this.f103718a + ", selectedSize=" + this.f103719b + ")";
    }

    public /* synthetic */ b(int i2) {
        this(i2, 0);
    }

    public b(int i2, int i3) {
        this.f103718a = i2;
        this.f103719b = i3;
    }
}
