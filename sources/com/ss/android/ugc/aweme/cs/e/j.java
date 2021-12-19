package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.d.b.a;
import com.ss.android.ugc.aweme.cs.d.b.a.c;
import com.ss.android.ugc.aweme.port.in.g;
import java.io.File;

public final class j extends a {
    static {
        Covode.recordClassIndex(49070);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "new_cache";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.CACHE;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return new File(g.a().g().c().d(null));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        if (!c().exists()) {
            return true;
        }
        c cVar = new c(null, null, 3);
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(c());
        cVar.a();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(null, null, 3);
        if (c().exists()) {
            a aVar2 = new a();
            aVar2.a(aVar);
            aVar2.a(c());
        }
        return aVar.f79012a + 0;
    }
}
