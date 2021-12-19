package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;

/* access modifiers changed from: package-private */
public final class bm implements Cdo {
    static {
        Covode.recordClassIndex(82148);
    }

    bm() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.Cdo
    public final boolean a() {
        int beautificationMode = g.a().e().getBeautificationMode(0);
        if (beautificationMode == 0 || beautificationMode != 1) {
            return false;
        }
        return true;
    }
}
