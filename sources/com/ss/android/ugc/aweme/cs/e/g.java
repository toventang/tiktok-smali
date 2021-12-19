package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.d.b.a;
import com.ss.android.ugc.aweme.cs.d.b.a.c;
import com.ss.android.ugc.aweme.port.in.l;
import h.a.am;
import java.io.File;

public final class g extends a {
    static {
        Covode.recordClassIndex(49067);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-mvtheme";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "mv-theme";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.RESOURCE;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return com.ss.android.ugc.aweme.port.in.g.a().g().c().g(l.f115658a.d().a().c());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        if (!c().exists()) {
            return true;
        }
        c cVar = new c(com.ss.android.ugc.aweme.cs.d.b.a(), am.a("contact_video"));
        cVar.f79016a = true;
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(c());
        cVar.a();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(com.ss.android.ugc.aweme.cs.d.b.a(), null, 2);
        if (c().exists()) {
            a aVar2 = new a();
            aVar2.a(aVar);
            aVar2.a(c());
        }
        return aVar.f79012a + 0;
    }
}
