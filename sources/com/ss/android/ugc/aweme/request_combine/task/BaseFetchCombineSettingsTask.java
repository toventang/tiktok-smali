package com.ss.android.ugc.aweme.request_combine.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.j;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.request_combine.b.a;
import com.ss.android.ugc.aweme.request_combine.b.b;
import com.ss.android.ugc.aweme.request_combine.request.a.d;
import com.ss.android.ugc.aweme.request_combine.request.a.e;
import com.ss.android.ugc.aweme.request_combine.request.b.c;
import h.f.b.l;
import java.util.List;

public abstract class BaseFetchCombineSettingsTask implements w {
    static {
        Covode.recordClassIndex(78603);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public int bK_() {
        return 1048575;
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        a.a(b.FETCH_COMBINE_TASK_RUN);
        if (com.bytedance.ies.b.a.a.a(context)) {
            com.ss.android.ugc.aweme.framework.a.a.a("FetchCombineSettingsTask");
            if (com.ss.android.ugc.aweme.request_combine.a.a.a()) {
                a.a(b.USE_SETTINGS_COMBINE_API);
                new f.b().b((r) new c()).a();
                return;
            }
            f.d e2 = f.e();
            if (j.a().c()) {
                e2.a(new e());
            } else {
                e2.a(new com.ss.android.ugc.aweme.request_combine.request.b.b()).a(new com.ss.android.ugc.aweme.request_combine.request.b.a());
            }
            e2.a(new d()).a(new com.ss.android.ugc.aweme.request_combine.request.a.f()).a(new com.ss.android.ugc.aweme.request_combine.request.a.c()).a(new com.ss.android.ugc.aweme.request_combine.request.a.b()).a(new com.ss.android.ugc.aweme.request_combine.request.a.a(aa.IDLE)).a();
        }
    }
}
