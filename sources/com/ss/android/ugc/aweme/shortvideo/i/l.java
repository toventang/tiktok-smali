package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.port.in.g;

public final class l extends c {
    static {
        Covode.recordClassIndex(84298);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.i.c
    public final int a(int i2, o oVar) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.c
    public final int c() {
        return g.a().e().getBackCameraFilterV2(-1);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.c
    public final int d() {
        return g.a().e().getFrontCameraFilterV2(-1);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.b, com.ss.android.ugc.aweme.shortvideo.i.c
    public final void b(int i2) {
        g.a().e().setFrontCameraFilterV2(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.b, com.ss.android.ugc.aweme.shortvideo.i.c
    public final void c(int i2) {
        g.a().e().setBackCameraFilterV2(i2);
    }
}
