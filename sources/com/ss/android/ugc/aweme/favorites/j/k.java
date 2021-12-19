package com.ss.android.ugc.aweme.favorites.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.f.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f90741a = new k();

    static {
        Covode.recordClassIndex(56981);
    }

    private k() {
    }

    @Override // com.ss.android.ugc.aweme.tools.f.a
    public final void onIntercept(String str, Effect effect) {
        r.a("shoot", new d().a("creation_id", str).a("shoot_way", "prop_page").a("prop_id", effect.getEffectId()).a("enter_from", "prop_collection").f66730a);
    }
}
