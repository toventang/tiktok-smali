package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class p extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120468a = new p();

    static {
        Covode.recordClassIndex(78414);
    }

    p() {
        super(SocialRecRequestState.class, "isOverStayTime", "isOverStayTime()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((SocialRecRequestState) obj).isOverStayTime());
    }
}
