package com.ss.android.ugc.aweme.relation.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class j extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120329a = new j();

    static {
        Covode.recordClassIndex(78280);
    }

    j() {
        super(SocialRecRequestState.class, "isSkipByEmptyData", "isSkipByEmptyData()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((SocialRecRequestState) obj).isSkipByEmptyData());
    }
}
