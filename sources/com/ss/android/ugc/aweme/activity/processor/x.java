package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.a;
import com.zhiliaoapp.musically.R;

public final class x implements a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f65555a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f65556b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f65557c;

    /* renamed from: d  reason: collision with root package name */
    public int f65558d;

    /* renamed from: e  reason: collision with root package name */
    public int f65559e;

    /* renamed from: f  reason: collision with root package name */
    public int f65560f;

    /* renamed from: g  reason: collision with root package name */
    public int f65561g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f65562h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f65563i;

    static {
        Covode.recordClassIndex(40342);
    }

    public x() {
        this(R.color.nd, true, false, 4);
    }

    public x(byte b2) {
        this(0, false, false, 7);
    }

    public x(int i2) {
        this(i2, false, false, 6);
    }

    public final int hashCode() {
        int i2 = this.f65561g * 31;
        boolean z = this.f65562h;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f65563i) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "ImmersiveConfig(statusBarColor=" + this.f65561g + ", autoDarkEnable=" + this.f65562h + ", disable=" + this.f65563i + ")";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            obj = null;
        }
        x xVar = (x) obj;
        if (xVar != null && this.f65561g == xVar.f65561g && this.f65555a == xVar.f65555a && this.f65556b == xVar.f65556b && this.f65557c == xVar.f65557c && this.f65558d == xVar.f65558d && this.f65562h == xVar.f65562h && this.f65563i == xVar.f65563i) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ x a(x xVar, int i2) {
        return new x(i2, xVar.f65562h, xVar.f65563i);
    }

    private x(int i2, boolean z, boolean z2) {
        this.f65561g = i2;
        this.f65562h = z;
        this.f65563i = z2;
        this.f65558d = -1;
        this.f65559e = -1;
        this.f65560f = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, boolean z, boolean z2, int i3) {
        this((i3 & 1) != 0 ? R.color.a2 : i2, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? false : z2);
    }
}
