package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.e.b;
import com.bytedance.disk.e.b.c;
import com.bytedance.disk.e.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.storagemanager.a;
import java.util.List;

public class MigrationTask implements w {
    static {
        Covode.recordClassIndex(69059);
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
        MethodCollector.i(5530);
        if (!a.f136685a.get()) {
            synchronized (a.class) {
                try {
                    if (!a.f136685a.get()) {
                        com.bytedance.disk.e.a.a(context);
                        com.bytedance.disk.e.a a2 = com.bytedance.disk.e.a.a();
                        int h2 = (int) d.h();
                        c cVar = a.f136686b;
                        c.a<Void> aVar = com.bytedance.disk.e.a.f28570c;
                        b bVar = a2.f28576a;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(h2);
                        objArr[1] = 1233;
                        if (com.bytedance.disk.e.a.f28569b != null) {
                            cVar = com.bytedance.disk.e.a.f28569b;
                        }
                        objArr[2] = cVar;
                        aVar.a(bVar, objArr);
                        com.bytedance.disk.e.a.f28571d.a(a2.f28576a, new Object[0]);
                        a.f136685a.set(true);
                        MethodCollector.o(5530);
                    }
                } finally {
                    MethodCollector.o(5530);
                }
            }
        } else {
            MethodCollector.o(5530);
        }
    }
}
