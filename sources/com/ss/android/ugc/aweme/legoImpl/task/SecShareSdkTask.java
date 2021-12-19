package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.account.share.data.write.b;
import com.ss.android.account.share.data.write.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class SecShareSdkTask implements w {
    static {
        Covode.recordClassIndex(69262);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
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
        d dVar = new d();
        HashMap hashMap = new HashMap();
        hashMap.put("com.zhiliaoapp.musically.go", "D7811EC4166FEA6CC720BA66699DC84B584AC9E6986613A76D4E43D8CBE32B27");
        l.c(hashMap, "");
        dVar.f58243a = hashMap;
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        l.c(a2, "");
        l.c(dVar, "");
        Context applicationContext = a2.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        l.a((Object) applicationContext, "");
        b.f58234d = applicationContext;
        b.f58232b = dVar;
        b.f58233c = true;
    }
}
