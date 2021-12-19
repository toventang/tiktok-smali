package com.ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.ss.android.ugc.tools.d.a.c;

public final class l implements ILargeTransactionService {
    static {
        Covode.recordClassIndex(56754);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ILargeTransactionService
    public final void clearPreviousDiskBundle() {
        c.f149164c.execute(c.a.f149171a);
    }
}
