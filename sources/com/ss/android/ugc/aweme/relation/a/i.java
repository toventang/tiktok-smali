package com.ss.android.ugc.aweme.relation.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class i extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120328a = new i();

    static {
        Covode.recordClassIndex(78279);
    }

    i() {
        super(SocialRecRequestState.class, "needNewVersionRecShow", "getNeedNewVersionRecShow()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((SocialRecRequestState) obj).getNeedNewVersionRecShow());
    }
}
