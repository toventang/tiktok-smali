package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.common.util.f;
import com.ss.android.di.push.a;
import com.ss.android.ugc.aweme.experiment.eu;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.push.downgrade.h;
import com.ss.android.ugc.aweme.services.MainServiceForPush;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;

public class InitPushTask implements w {
    static {
        Covode.recordClassIndex(69015);
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
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static boolean c() {
        if (eu.a() || b.a().a(true, "push_init_optimize_enable", false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        Application a2 = g.a();
        if (a2 == null || f.a(a2)) {
            return ae.BACKGROUND;
        }
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (c()) {
            b(context);
        }
    }

    public static void b(Context context) {
        boolean d2;
        if (f.a(context)) {
            if (com.ss.android.ugc.aweme.experiment.b.f89589d) {
                fr.a(5000);
            }
        } else if (!h.a(context, f.b(context))) {
            return;
        }
        if (b.a().a(true, "push_childer_mode_optimize_enable", true)) {
            d2 = in.e();
        } else {
            d2 = in.d();
        }
        if (!d2) {
            a.a().init(context, new MainServiceForPush());
        } else {
            a.a().initMessageDepend();
        }
    }
}
