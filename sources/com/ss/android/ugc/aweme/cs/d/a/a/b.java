package com.ss.android.ugc.aweme.cs.d.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.d.b.a.a;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.h;
import h.f.b.l;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public c f79007a;

    static {
        Covode.recordClassIndex(49040);
    }

    /* access modifiers changed from: protected */
    public long a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public long b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 0;
    }

    public final long d() {
        String a2 = com.ss.android.ugc.aweme.cs.d.b.a(this.f79007a);
        a aVar = new a(null, g.a().g().b().b(), 1);
        if (a2.length() > 0) {
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(aVar);
            aVar2.a(a2);
        }
        return 0 + aVar.f79012a + a() + b() + c();
    }

    public b(c cVar) {
        l.d(cVar, "");
        this.f79007a = cVar;
    }

    protected static long a(String str) {
        if (str != null) {
            return h.i(str);
        }
        return 0;
    }
}
