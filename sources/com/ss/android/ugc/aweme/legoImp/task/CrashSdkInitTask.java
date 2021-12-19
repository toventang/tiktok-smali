package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.common.g.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.ArrayList;
import java.util.List;

public class CrashSdkInitTask implements w {
    static {
        Covode.recordClassIndex(68965);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (a.a()) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.ss.android.ugc.aweme.analysis.a(b.a().a(true, "enable_alog", true)));
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                com.ss.android.ugc.aweme.framework.a.a.a(applicationContext, arrayList);
            } catch (Throwable unused) {
            }
            com.ss.android.ugc.aweme.i18n.a.a();
            new com.ss.android.ugc.aweme.app.d.a().run();
        }
    }
}
