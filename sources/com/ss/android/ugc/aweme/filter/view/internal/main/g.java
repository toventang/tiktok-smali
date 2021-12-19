package com.ss.android.ugc.aweme.filter.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.c.a;
import h.f.a.b;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f95882a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f95883b;

    /* renamed from: c  reason: collision with root package name */
    public b<? super a.C4052a, z> f95884c;

    static {
        Covode.recordClassIndex(60750);
    }

    public g() {
        this(0, false, null, 7);
    }

    private g(int i2, boolean z, b<? super a.C4052a, z> bVar) {
        this.f95882a = i2;
        this.f95883b = z;
        this.f95884c = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, boolean z, b bVar, int i3) {
        this((i3 & 1) != 0 ? 16 : i2, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? null : bVar);
    }
}
