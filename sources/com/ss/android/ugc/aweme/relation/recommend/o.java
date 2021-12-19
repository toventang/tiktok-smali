package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class o extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120467a = new o();

    static {
        Covode.recordClassIndex(78413);
    }

    o() {
        super(SocialRecRequestState.class, "isSkipByException", "isSkipByException()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((SocialRecRequestState) obj).isSkipByException());
    }
}
