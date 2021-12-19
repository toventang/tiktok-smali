package com.ss.android.ugc.aweme.legoImp.task.uitask;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.legoimpl.AndInflaterPreloadBootTask;
import com.ss.android.legoimpl.InitAndInflaterTask;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.task.aa;
import com.ss.android.ugc.aweme.legoImp.task.z;
import com.ss.android.ugc.aweme.s.d;
import java.util.List;

public final class UIInitTask implements w {
    static {
        Covode.recordClassIndex(69236);
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
        return ae.BACKGROUND;
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
        System.currentTimeMillis();
        if (context != null) {
            new TuxInitTask().a(context);
            if (((Boolean) d.f120773a.getValue()).booleanValue()) {
                try {
                    g.b().execute(new aa(new z(), context));
                } catch (Throwable unused) {
                }
            }
            new InitAndInflaterTask().a(context);
            new AndInflaterPreloadBootTask().a(context);
            System.currentTimeMillis();
        }
    }
}
