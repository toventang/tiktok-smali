package com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final int f92647a;

    static {
        Covode.recordClassIndex(58752);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && this.f92647a == ((e) obj).f92647a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f92647a;
    }

    public final String toString() {
        return "VPAOptedOutMaskState(contentVisible=" + this.f92647a + ")";
    }

    public /* synthetic */ e() {
        this(8);
    }

    public e(int i2) {
        this.f92647a = i2;
    }
}
