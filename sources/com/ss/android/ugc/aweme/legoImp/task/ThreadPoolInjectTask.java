package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.utility.b.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.h;
import com.ss.android.ugc.aweme.cw.i;
import com.ss.android.ugc.aweme.cw.j;
import com.ss.android.ugc.aweme.cw.k;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import f.a.aa;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class ThreadPoolInjectTask implements w {
    static {
        Covode.recordClassIndex(69167);
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
        l.d(context, "");
        a.b.f109011a.a("method_thread_pool_inject_duration", false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(o.IO);
        arrayList.add(o.DEFAULT);
        arrayList.add(o.SERIAL);
        arrayList.add(o.BACKGROUND);
        h.a a2 = h.a();
        a2.f79157a = false;
        a2.f79158b = (List) h.a(arrayList);
        a2.f79159c = (List) h.a(i.f79163a);
        a2.f79160d = h.a(TimeUnit.MINUTES.toMillis(5));
        a2.f79161e = h.a(TimeUnit.MINUTES.toMillis(5));
        a2.f79162f = h.a(TimeUnit.MINUTES.toMillis(15));
        g.f79144a = a2.a();
        g.f79145b = new k();
        com.ss.android.ugc.aweme.net.k.f112430a = g.a();
        com.ss.android.b.a.a.a.a(e.f79121a);
        ExecutorService a3 = g.a();
        com.bytedance.common.utility.b.e.f26914b = a3;
        com.bytedance.common.utility.b.e.f26915c = a3;
        c.f26891a = g.b();
        f.a.d.g<? super aa, ? extends aa> gVar = j.f79164a;
        if (!f.a.h.a.w) {
            f.a.h.a.f157970i = gVar;
            a.b.f109011a.b("method_thread_pool_inject_duration", false);
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
