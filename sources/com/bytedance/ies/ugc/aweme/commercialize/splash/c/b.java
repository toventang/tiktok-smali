package com.bytedance.ies.ugc.aweme.commercialize.splash.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.c.a;
import com.ss.android.ad.splash.f;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f34756a = new b();

    static {
        Covode.recordClassIndex(20846);
    }

    private b() {
    }

    @Override // com.ss.android.ad.splash.f
    public final boolean a(a aVar) {
        if (com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().f()) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a("Child mode does not show ads");
            return false;
        } else if (!aVar.C() || !com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().g()) {
            return true;
        } else {
            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a("Personalized display off, no ads");
            return false;
        }
    }
}
