package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.ies.ugc.aweme.smartanchor_declaration.RouterAnchorPoint;
import com.bytedance.router.IRouterInjectInitializer;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ck.s;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.s.a;
import java.util.List;

public class InitRouter implements w {
    static {
        Covode.recordClassIndex(69017);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (a.c()) {
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
        a.b.f109011a.a("method_init_smart_router_duration", false);
        t.f71163a.add(new s());
        t.a(g.a());
        t.a();
        t.f71164b = new com.ss.android.ugc.aweme.app.h.a();
        SmartRouter.init(d.a());
        SmartRouter.configRouter("snssdk1233").withOtherSchemes(new String[]{"aweme", "sslocal"});
        if (!b.e()) {
            RouterAnchorPoint.getPoint().run(new Object());
            if (com.ss.android.ugc.aweme.lego.d.d()) {
                com.bytedance.ies.powerpage.d.f34436a.a();
            }
            SmartRouter.canOpen(null);
        } else {
            SmartRouter.injectInitializer(new IRouterInjectInitializer() {
                /* class com.ss.android.ugc.aweme.legoImp.task.InitRouter.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69018);
                }

                @Override // com.bytedance.router.IRouterInjectInitializer
                public final void injectInitialize() {
                    RouterAnchorPoint.getPoint().run(new Object());
                    com.bytedance.ies.powerpage.d.f34436a.a();
                }
            });
        }
        a.b.f109011a.b("method_init_smart_router_duration", false);
    }
}
