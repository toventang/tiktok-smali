package com.ss.android.ugc.aweme.relation.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class h extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120327a = new h();

    static {
        Covode.recordClassIndex(78278);
    }

    h() {
        super(SocialRecRequestState.class, "isNewVersionSynced", "isNewVersionSynced()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((SocialRecRequestState) obj).isNewVersionSynced());
    }
}
