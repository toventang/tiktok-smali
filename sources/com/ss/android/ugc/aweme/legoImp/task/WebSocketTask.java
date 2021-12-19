package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.wschannel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.notice.api.e.t;
import h.f.b.l;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

public class WebSocketTask implements w {
    static {
        Covode.recordClassIndex(69174);
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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        MethodCollector.i(3274);
        a.a("WebSocketTask");
        t a2 = t.f112753j.a();
        Application application = (Application) d.a();
        l.d(application, "");
        j.a(application, a2.f112757d);
        synchronized (a2) {
            try {
                EventBus.a(EventBus.a(), a2);
            } catch (Throwable th) {
                MethodCollector.o(3274);
                throw th;
            }
        }
        com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a(true, "websocket_task");
        MethodCollector.o(3274);
    }
}
