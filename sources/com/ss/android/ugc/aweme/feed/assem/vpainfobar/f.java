package com.ss.android.ugc.aweme.feed.assem.vpainfobar;

import android.text.SpannableString;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final SpannableString f92637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f92638b;

    /* renamed from: c  reason: collision with root package name */
    public final int f92639c;

    static {
        Covode.recordClassIndex(58733);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f92637a, fVar.f92637a) && this.f92638b == fVar.f92638b && this.f92639c == fVar.f92639c;
    }

    public final int hashCode() {
        SpannableString spannableString = this.f92637a;
        return ((((spannableString != null ? spannableString.hashCode() : 0) * 31) + this.f92638b) * 31) + this.f92639c;
    }

    public final String toString() {
        return "VPAInfoBarState(infoText=" + ((Object) this.f92637a) + ", contentVisible=" + this.f92638b + ", optOutBtnVisible=" + this.f92639c + ")";
    }

    public /* synthetic */ f() {
        this(null, 8, 8);
    }

    public f(SpannableString spannableString, int i2, int i3) {
        this.f92637a = spannableString;
        this.f92638b = i2;
        this.f92639c = i3;
    }
}
