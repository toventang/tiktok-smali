package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;

public final class fi {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f90044a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f90045b;

    /* renamed from: c  reason: collision with root package name */
    public final int f90046c;

    static {
        Covode.recordClassIndex(56510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return this.f90044a == fiVar.f90044a && this.f90045b == fiVar.f90045b && this.f90046c == fiVar.f90046c;
    }

    public final int hashCode() {
        boolean z = this.f90044a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f90045b) {
            i2 = 0;
        }
        return ((i6 + i2) * 31) + this.f90046c;
    }

    public final String toString() {
        return "PopupConfig(needContactPopup=" + this.f90044a + ", needFBPopup=" + this.f90045b + ", triggerScene=" + this.f90046c + ")";
    }

    public /* synthetic */ fi() {
        this(false, false, 0);
    }

    public fi(boolean z, boolean z2, int i2) {
        this.f90044a = z;
        this.f90045b = z2;
        this.f90046c = i2;
    }
}
