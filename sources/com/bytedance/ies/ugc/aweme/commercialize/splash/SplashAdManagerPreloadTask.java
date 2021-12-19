package com.bytedance.ies.ugc.aweme.commercialize.splash;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.d;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class SplashAdManagerPreloadTask implements a, w {
    static {
        Covode.recordClassIndex(20823);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return new String[]{"InitAdServiceTask"};
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "SplashAdManagerPreloadTask");
        if (((Boolean) j.f34828a.getValue()).booleanValue()) {
            i.b(a.f34737a, i.f4824a);
        }
        com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(context);
        if (j.d() && com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34787c && !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34795k) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34795k = true;
            d.f34861b.a(context);
        }
    }
}
