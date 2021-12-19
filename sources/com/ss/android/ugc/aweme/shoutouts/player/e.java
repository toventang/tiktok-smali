package com.ss.android.ugc.aweme.shoutouts.player;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements ad.b {
    static {
        Covode.recordClassIndex(87173);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new ShoutoutsPlayViewModel();
    }
}
