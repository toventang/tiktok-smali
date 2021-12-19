package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class v implements f {

    /* renamed from: a  reason: collision with root package name */
    private final OptimizedLikeHelper f18358a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18359b;

    static {
        Covode.recordClassIndex(10337);
    }

    v(OptimizedLikeHelper optimizedLikeHelper, String str) {
        this.f18358a = optimizedLikeHelper;
        this.f18359b = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18358a.e(this.f18359b);
    }
}
