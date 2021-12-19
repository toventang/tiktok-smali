package com.ss.android.ugc.aweme.legoImp.task.uitask;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.tux.b.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.tux.a.a.a;
import com.ss.android.ugc.aweme.tux.a.c.a;
import com.ss.android.ugc.aweme.tux.a.d.a;
import com.ss.android.ugc.aweme.tux.a.e.a;
import com.ss.android.ugc.aweme.tux.a.e.b;
import com.ss.android.ugc.aweme.tux.a.e.c;
import com.ss.android.ugc.aweme.tux.a.f.a;
import com.ss.android.ugc.aweme.tux.a.h.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class TuxInitTask implements w {
    static {
        Covode.recordClassIndex(69235);
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
        boolean z;
        if (context != null) {
            l.d(context, "");
            if (b.a().a(true, "tux_config_lazy_load", 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            f.f44676a = z;
            f.f44677b.a(R.attr.ap4, a.C3755a.f141497a);
            f.f44677b.a(R.attr.aom, a.C3754a.f141476a).a(R.attr.aoo, a.b.f141481a).a(R.attr.cu, a.c.f141493a);
            f.f44677b.a(R.attr.ap8, a.C3756a.f141525a);
            f.f44677b.a(R.attr.aor, a.C3757a.f141526a).a(R.attr.aos, a.b.f141529a).a(R.attr.cv, a.c.f141532a);
            f.f44677b.a(R.attr.et, b.a.f141535a);
            f.f44677b.a(R.attr.fi, c.a.f141538a);
            f.f44677b.a(R.attr.arb, a.C3760a.f141569a).a(R.attr.g6, a.b.f141578a);
            f.f44677b.a(R.attr.apy, a.C3758a.f141541a).a(R.attr.apz, a.b.f141554a);
            com.bytedance.tux.c.b.f44755e = com.bytedance.ies.abmock.b.a().a(true, "enable_graw", false);
        }
    }
}
