package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import f.a.d.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LikeHelper f18351a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18352b;

    static {
        Covode.recordClassIndex(10332);
    }

    q(LikeHelper likeHelper, String str) {
        this.f18351a = likeHelper;
        this.f18352b = str;
    }

    @Override // f.a.d.a
    public final void a() {
        this.f18351a.c(this.f18352b);
    }
}
