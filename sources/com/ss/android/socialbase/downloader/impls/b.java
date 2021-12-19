package com.ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.g.l;

public final class b implements i {
    static {
        Covode.recordClassIndex(37430);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public final int a(int i2, l lVar) {
        if (lVar.ordinal() <= l.MODERATE.ordinal()) {
            return 1;
        }
        if (lVar == l.GOOD) {
            return i2 - 1;
        }
        return i2;
    }
}
