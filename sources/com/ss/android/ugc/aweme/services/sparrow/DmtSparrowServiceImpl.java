package com.ss.android.ugc.aweme.services.sparrow;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cr.a;
import com.ss.android.ugc.aweme.cr.b;
import com.ss.android.ugc.aweme.cr.c;
import h.h;
import h.i;

public final class DmtSparrowServiceImpl implements a {
    private final h frameVerificationService$delegate = i.a((h.f.a.a) DmtSparrowServiceImpl$frameVerificationService$2.INSTANCE);
    private final h publishXService$delegate = i.a((h.f.a.a) DmtSparrowServiceImpl$publishXService$2.INSTANCE);

    static {
        Covode.recordClassIndex(79797);
    }

    @Override // com.ss.android.ugc.aweme.cr.a
    public final b getFrameVerificationService() {
        return (b) this.frameVerificationService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.cr.a
    public final c getPublishXService() {
        return (c) this.publishXService$delegate.getValue();
    }
}
