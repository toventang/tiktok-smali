package com.ss.android.ugc.aweme.feed.assem.caution;

import android.text.SpannableString;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f92091a;

    /* renamed from: b  reason: collision with root package name */
    public final SpannableString f92092b;

    static {
        Covode.recordClassIndex(58071);
    }

    public static g a(boolean z, SpannableString spannableString) {
        return new g(z, spannableString);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f92091a == gVar.f92091a && l.a(this.f92092b, gVar.f92092b);
    }

    public final int hashCode() {
        boolean z = this.f92091a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        SpannableString spannableString = this.f92092b;
        return i5 + (spannableString != null ? spannableString.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTopCautionState(visible=" + this.f92091a + ", text=" + ((Object) this.f92092b) + ")";
    }

    public /* synthetic */ g() {
        this(false, null);
    }

    private g(boolean z, SpannableString spannableString) {
        this.f92091a = z;
        this.f92092b = spannableString;
    }
}
