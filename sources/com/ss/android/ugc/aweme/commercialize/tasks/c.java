package com.ss.android.ugc.aweme.commercialize.tasks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.b;
import com.bytedance.ies.ugc.aweme.rich.c.a.d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.tasks.a.e;
import com.ss.android.ugc.aweme.commercialize.tasks.a.f;
import com.ss.android.ugc.aweme.commercialize.tasks.a.g;
import com.ss.android.ugc.aweme.commercialize.tasks.a.h;
import com.ss.android.ugc.aweme.commercialize.tasks.a.i;
import com.ss.android.ugc.aweme.commercialize.tasks.a.j;
import com.ss.android.ugc.aweme.commercialize.tasks.a.k;
import h.f.b.l;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f75341a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(46490);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.d
    public final b a(int i2, com.bytedance.ies.ugc.aweme.rich.c.a.c cVar, Bundle bundle) {
        l.d(cVar, "");
        l.d(bundle, "");
        switch (i2) {
            case 0:
                return new e(cVar, bundle);
            case 1:
                return new j(cVar, bundle);
            case 2:
                return new k(cVar, bundle);
            case 3:
                return new f(cVar, bundle);
            case 4:
                return new h(cVar, bundle);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return new i(cVar, bundle);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return new com.ss.android.ugc.aweme.commercialize.tasks.a.d(cVar, bundle);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return new com.ss.android.ugc.aweme.commercialize.tasks.a.c(cVar, bundle);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return new g(cVar, bundle);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new com.ss.android.ugc.aweme.commercialize.tasks.a.b(cVar, bundle);
            default:
                return null;
        }
    }
}
