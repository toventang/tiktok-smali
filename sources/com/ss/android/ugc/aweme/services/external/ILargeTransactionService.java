package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;

public interface ILargeTransactionService {
    static {
        Covode.recordClassIndex(79639);
    }

    void clearPreviousDiskBundle();
}
