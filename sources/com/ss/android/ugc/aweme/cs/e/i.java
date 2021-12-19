package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.d.b.a;
import com.ss.android.ugc.aweme.cs.d.b.a.c;
import com.ss.android.ugc.aweme.port.in.g;
import java.io.File;

public final class i extends a {
    static {
        Covode.recordClassIndex(49069);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-music";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "music-res";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.RESOURCE;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return g.a().g().c().g(g.a().s().c());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        if (!c().exists()) {
            return true;
        }
        c cVar = new c(com.ss.android.ugc.aweme.cs.d.b.a(), null, 2);
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
