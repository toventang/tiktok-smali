package com.ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.u;

public final class j implements u {
    static {
        Covode.recordClassIndex(37446);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.u
    public final long a(int i2, int i3) {
        if (i2 == 1) {
            return 3000;
        }
        if (i2 == 2) {
            return 15000;
        }
        if (i2 == 3) {
            return 30000;
        }
        return i2 > 3 ? 300000 : 0;
    }
}
