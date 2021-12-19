package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.d.b.a.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.sticker.e.f;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;

public final class k extends a {
    static {
        Covode.recordClassIndex(49071);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-moji";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "person-effect";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.RESOURCE;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return g.a().g().c().g(f.a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        Keva.getRepo("personal_effect").clear();
        FileUtils.INSTANCE.removeDir(f.a());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        a aVar = new a(null, null, 3);
        if (c().exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(aVar);
            aVar2.a(c());
        }
        return aVar.f79012a + 0;
    }
}
