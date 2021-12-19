package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class q extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120469a = new q();

    static {
        Covode.recordClassIndex(78415);
    }

    q() {
        super(SocialRecRequestState.class, "isSkipByEmptyData", "isSkipByEmptyData()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((SocialRecRequestState) obj).isSkipByEmptyData());
    }
}
