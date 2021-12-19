package com.ss.android.ugc.aweme.profile.widgets.userId;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f118108a;

    static {
        Covode.recordClassIndex(76699);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f118108a == ((a) obj).f118108a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f118108a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "MyProfileUserIdState(cuBubbleShowing=" + this.f118108a + ")";
    }

    public /* synthetic */ a() {
        this(false);
    }

    public a(boolean z) {
        this.f118108a = z;
    }
}
