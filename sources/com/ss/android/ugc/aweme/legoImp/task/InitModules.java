package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.dy;
import com.ss.android.ugc.aweme.experiment.hg;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class InitModules implements a, w {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f107793a = new AtomicBoolean(false);

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
        return new String[]{"AccountInitializerTask"};
    }

    static {
        Covode.recordClassIndex(69003);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static void l() {
        if (f107793a.compareAndSet(false, true) && b.g().isLogin()) {
            AppLog.setUserId(Long.parseLong(b.g().getCurUserId()));
            AppLog.setSessionKey(b.g().getSessionKey());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (((Boolean) dy.f89862a.getValue()).booleanValue()) {
            return;
        }
        if (hg.f90215a == 2 || hg.f90215a == 100) {
            g.a().execute(i.f107977a);
        } else {
            l();
        }
    }
}
