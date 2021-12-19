package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.d.b.a;
import com.ss.android.ugc.aweme.cs.d.b.a.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.e;
import java.io.File;

public final class l extends a {
    static {
        Covode.recordClassIndex(49072);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-save-photo-effect";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "save-photo-effect";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.RESOURCE;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return g.a().g().c().g(e.f130264a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        if (!c().exists()) {
            return true;
        }
        c cVar = new c(com.ss.android.ugc.aweme.cs.d.b.a(), null, 2);
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
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(null, null, 3);
        if (c().exists()) {
            a aVar2 = new a();
            aVar2.a(aVar);
            aVar2.a(c());
        }
        return aVar.f79012a + 0;
    }
}
