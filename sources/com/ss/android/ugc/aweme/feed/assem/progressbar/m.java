package com.ss.android.ugc.aweme.feed.assem.progressbar;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    public final int f92394a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f92395b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f92396c;

    /* renamed from: d  reason: collision with root package name */
    public final int f92397d;

    /* renamed from: e  reason: collision with root package name */
    public final int f92398e;

    static {
        Covode.recordClassIndex(58461);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f92394a == mVar.f92394a && this.f92395b == mVar.f92395b && this.f92396c == mVar.f92396c && this.f92397d == mVar.f92397d && this.f92398e == mVar.f92398e;
    }

    public final int hashCode() {
        int i2 = this.f92394a * 31;
        boolean z = this.f92395b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f92396c) {
            i3 = 0;
        }
        return ((((i7 + i3) * 31) + this.f92397d) * 31) + this.f92398e;
    }

    public final String toString() {
        return "VideoProgressBarState(volume=" + this.f92394a + ", isCurrentShowing=" + this.f92395b + ", awesomeSplashing=" + this.f92396c + ", progress=" + this.f92397d + ", maxProgress=" + this.f92398e + ")";
    }

    public /* synthetic */ m() {
        this(-1, false, false, 0, 0);
    }

    private m(int i2, boolean z, boolean z2, int i3, int i4) {
        this.f92394a = i2;
        this.f92395b = z;
        this.f92396c = z2;
        this.f92397d = i3;
        this.f92398e = i4;
    }

    public static /* synthetic */ m a(m mVar, int i2, boolean z, boolean z2, int i3, int i4, int i5) {
        int i6 = i4;
        int i7 = i2;
        boolean z3 = z;
        boolean z4 = z2;
        int i8 = i3;
        if ((i5 & 1) != 0) {
            i7 = mVar.f92394a;
        }
        if ((i5 & 2) != 0) {
            z3 = mVar.f92395b;
        }
        if ((i5 & 4) != 0) {
            z4 = mVar.f92396c;
        }
        if ((i5 & 8) != 0) {
            i8 = mVar.f92397d;
        }
        if ((i5 & 16) != 0) {
            i6 = mVar.f92398e;
        }
        return new m(i7, z3, z4, i8, i6);
    }
}
