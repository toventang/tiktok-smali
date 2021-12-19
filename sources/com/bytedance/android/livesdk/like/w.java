package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final OptimizedLikeHelper f18360a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18361b;

    static {
        Covode.recordClassIndex(10338);
    }

    w(OptimizedLikeHelper optimizedLikeHelper, String str) {
        this.f18360a = optimizedLikeHelper;
        this.f18361b = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18360a.a(this.f18361b, (Throwable) obj);
    }
}
