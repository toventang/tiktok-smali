package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LikeHelper f18338a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18339b;

    static {
        Covode.recordClassIndex(10322);
    }

    g(LikeHelper likeHelper, String str) {
        this.f18338a = likeHelper;
        this.f18339b = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18338a.b(this.f18339b);
    }
}
