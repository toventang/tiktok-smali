package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.s.a;
import com.ss.android.ugc.aweme.tools.b.a.b;
import com.ss.android.ugc.aweme.tools.b.c;
import com.ss.android.ugc.aweme.tools.b.d;
import com.ss.android.ugc.aweme.tools.b.f;
import java.util.List;

public class InitAVModule implements w {
    static {
        Covode.recordClassIndex(68989);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 17;
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    public static void c() {
        AVInitializerImpl.a().initMonitor(g.a());
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (a.e()) {
            return ae.BACKGROUND;
        }
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        a.b.f109011a.a("method_av_module_init_duration", false);
        AVInitializerImpl.a().initialize(g.a());
        if (!com.ss.android.ugc.aweme.s.a.e()) {
            c();
        }
        com.ss.android.ugc.aweme.tools.b.g.f138758b = false;
        f fVar = f.MAIN_BUSINESS;
        c bVar = new b();
        if (com.ss.android.ugc.aweme.tools.b.g.f138758b) {
            bVar = new d(bVar);
        }
        com.ss.android.ugc.aweme.tools.b.g.f138757a.put(fVar, bVar);
        a.b.f109011a.b("method_av_module_init_duration", false);
    }
}
