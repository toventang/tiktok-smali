package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.f.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

final /* synthetic */ class MainServiceImpl$$Lambda$0 implements a {
    private final String arg$1;

    static {
        Covode.recordClassIndex(79524);
    }

    MainServiceImpl$$Lambda$0(String str) {
        this.arg$1 = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.f.a
    public final void onIntercept(String str, Effect effect) {
        r.a("shoot", (String) new d().a("creation_id", str).a("shoot_way", "scan").a("prop_id", this.arg$1).f66730a);
    }
}
