package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f103716a = R.string.cj1;

    /* renamed from: b  reason: collision with root package name */
    public final int f103717b = 15;

    static {
        Covode.recordClassIndex(66444);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f103716a == aVar.f103716a && this.f103717b == aVar.f103717b;
    }

    public final int hashCode() {
        return (this.f103716a * 31) + this.f103717b;
    }

    public final String toString() {
        return "NeutralToastText(resId=" + this.f103716a + ", multiSelectLimit=" + this.f103717b + ")";
    }
}
