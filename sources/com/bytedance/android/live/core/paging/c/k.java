package com.bytedance.android.live.core.paging.c;

import android.util.Pair;
import androidx.h.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f9195a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9196b;

    /* renamed from: c  reason: collision with root package name */
    private final g.c f9197c;

    static {
        Covode.recordClassIndex(4709);
    }

    k(c cVar, long j2, g.c cVar2) {
        this.f9195a = cVar;
        this.f9196b = j2;
        this.f9197c = cVar2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f9195a.a(this.f9196b, this.f9197c, (Pair) obj);
    }
}
