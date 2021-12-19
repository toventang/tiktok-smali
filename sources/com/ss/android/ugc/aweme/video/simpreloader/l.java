package com.ss.android.ugc.aweme.video.simpreloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.u.a;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.preload.i;
import java.io.File;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f143980a;

    static {
        Covode.recordClassIndex(94209);
    }

    @Override // com.bytedance.u.a
    public final String a() {
        return "CACHE";
    }

    @Override // com.bytedance.u.a
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.u.a
    public final boolean b() {
        this.f143980a.c();
        return true;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return this.f143980a.b();
    }

    @Override // com.bytedance.u.a
    public final long e() {
        File c2 = c();
        if (c2 == null || !c2.exists()) {
            return 0;
        }
        return Math.max(e.d(c2.getAbsolutePath()), 0L);
    }

    public l(i iVar) {
        this.f143980a = iVar;
    }
}
