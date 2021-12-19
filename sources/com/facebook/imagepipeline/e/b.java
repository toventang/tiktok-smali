package com.facebook.imagepipeline.e;

import com.bytedance.covode.number.Covode;
import com.facebook.c.b.c;
import com.facebook.c.b.d;
import com.facebook.c.b.e;
import com.facebook.c.b.i;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private c f47834a;

    static {
        Covode.recordClassIndex(28970);
    }

    public b(c cVar) {
        this.f47834a = cVar;
    }

    @Override // com.facebook.imagepipeline.e.f
    public final i a(c cVar) {
        d a2 = this.f47834a.a(cVar);
        l.a a3 = l.a(o.FIXED);
        a3.f79174c = 1;
        ExecutorService a4 = g.a(a3.a());
        return new e(a2, cVar.f46985g, new e.b(cVar.f46984f, cVar.f46983e, cVar.f46982d), cVar.f46987i, cVar.f46986h, a4, cVar.f46990l);
    }
}
