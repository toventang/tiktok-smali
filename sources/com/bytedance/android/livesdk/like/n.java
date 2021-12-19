package com.bytedance.android.livesdk.like;

import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.covode.number.Covode;
import f.a.d.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements k {

    /* renamed from: a  reason: collision with root package name */
    static final k f18347a = new n();

    static {
        Covode.recordClassIndex(10329);
    }

    private n() {
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        return !((LikeHelper.c) obj).f18329c.isRecycled();
    }
}
