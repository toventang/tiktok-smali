package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.google.c.a.l;
import java.util.List;

final /* synthetic */ class i implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f90618a;

    /* renamed from: b  reason: collision with root package name */
    private final List f90619b;

    static {
        Covode.recordClassIndex(56922);
    }

    i(boolean z, List list) {
        this.f90618a = z;
        this.f90619b = list;
    }

    @Override // com.google.c.a.l
    public final boolean a(Object obj) {
        return this.f90618a || !this.f90619b.contains(obj);
    }
}
