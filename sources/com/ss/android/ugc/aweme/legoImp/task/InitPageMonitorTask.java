package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.a;
import com.ss.android.ugc.aweme.cc.a.d;
import com.ss.android.ugc.aweme.cc.e;
import com.ss.android.ugc.aweme.experiment.fc;
import com.ss.android.ugc.aweme.experiment.fd;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class InitPageMonitorTask implements w {
    static {
        Covode.recordClassIndex(69006);
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
        return ae.MAIN;
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
        if (fd.f90027a && context != null) {
            e eVar = new e();
            Application application = (Application) context;
            l.d(application, "");
            a.a(new e.a(eVar));
            application.registerActivityLifecycleCallbacks(new e.b(eVar));
            if (fc.f90024a) {
                com.ss.android.ugc.aweme.cc.a.a aVar = d.f69783b;
                if (aVar != null) {
                    aVar.a(null);
                }
                eVar.a(d.f69782a);
                d.f69783b = eVar;
            }
        }
    }
}
