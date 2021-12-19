package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.experiment.dx;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class SharePreferencePreloadForAllProcessTask implements a, w {
    static {
        Covode.recordClassIndex(69123);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 35;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.ss.android.ugc.aweme.framework.a.a.a("SharePreferencePreloadForAllProcessTask");
        a(context, "app_setting", 0);
        a(context, "use_https", 0);
        a(context, "update_params", 0);
        a(context, "is_allow_oppo_push", 0);
        a(context, "push_setting", 0);
        a(context, "push_multi_process_config", 4);
        a(context, "applog_stats", 0);
    }

    private static void a(Context context, String str, int i2) {
        if (dx.b()) {
            d.a(context, str, i2);
        } else {
            d.a(context, str, i2).getAll();
        }
    }
}
