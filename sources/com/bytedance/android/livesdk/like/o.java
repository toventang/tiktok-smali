package com.bytedance.android.livesdk.like;

import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LikeHelper f18348a;

    static {
        Covode.recordClassIndex(10330);
    }

    o(LikeHelper likeHelper) {
        this.f18348a = likeHelper;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LikeHelper likeHelper = this.f18348a;
        LikeHelper.c cVar = (LikeHelper.c) obj;
        likeHelper.r.put(cVar.f18328b, cVar.f18329c);
        if (cVar.f18327a) {
            likeHelper.s.add(cVar.f18329c);
        } else {
            likeHelper.q.add(cVar.f18329c);
        }
    }
}
