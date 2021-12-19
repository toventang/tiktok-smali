package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.b.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.c;
import com.ss.android.ugc.aweme.im.service.g.a;
import h.a.ag;
import h.v;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f102304a;

    /* renamed from: b  reason: collision with root package name */
    public final int f102305b;

    /* renamed from: c  reason: collision with root package name */
    public final int f102306c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f102307d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f102308e;

    static {
        Covode.recordClassIndex(65468);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f102304a == fVar.f102304a && this.f102305b == fVar.f102305b && this.f102306c == fVar.f102306c && this.f102307d == fVar.f102307d && this.f102308e == fVar.f102308e;
    }

    public final int hashCode() {
        boolean z = this.f102304a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = ((((i3 * 31) + this.f102305b) * 31) + this.f102306c) * 31;
        boolean z2 = this.f102307d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f102308e) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "ImageShowEventBody(animated=" + this.f102304a + ", width=" + this.f102305b + ", height=" + this.f102306c + ", isPreload=" + this.f102307d + ", isPreloadFromScroll=" + this.f102308e + ")";
    }

    public /* synthetic */ f(boolean z, int i2, int i3) {
        this(z, i2, i3, c.a(), b.a());
    }

    private f(boolean z, int i2, int i3, boolean z2, boolean z3) {
        super(ag.a(v.a("is_preload", Boolean.valueOf(z2)), v.a("preload_from_scroll", Boolean.valueOf(z3)), v.a("animate", Boolean.valueOf(z))), null, ag.a(v.a("width", Integer.valueOf(i2)), v.a("height", Integer.valueOf(i3))), 2);
        this.f102304a = z;
        this.f102305b = i2;
        this.f102306c = i3;
        this.f102307d = z2;
        this.f102308e = z3;
    }
}
