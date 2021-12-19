package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LikeHelper f18349a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18350b;

    static {
        Covode.recordClassIndex(10331);
    }

    p(LikeHelper likeHelper, String str) {
        this.f18349a = likeHelper;
        this.f18350b = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18349a.d(this.f18350b);
    }
}
