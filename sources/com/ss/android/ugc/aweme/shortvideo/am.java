package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;

/* access modifiers changed from: package-private */
public final class am implements aq {
    static {
        Covode.recordClassIndex(82089);
    }

    am() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.aq
    public final boolean a() {
        if (g.a().e().getDurationMode(true)) {
            g.a().e().setDurationMode(false);
        }
        return g.a().e().getDurationMode(true);
    }
}
