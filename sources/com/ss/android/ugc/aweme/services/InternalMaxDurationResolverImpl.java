package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.ck;
import com.ss.android.ugc.aweme.record.e;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class InternalMaxDurationResolverImpl implements e {
    static {
        Covode.recordClassIndex(79489);
    }

    @Override // com.ss.android.ugc.aweme.record.e
    public final long resolveMaxDurationFor3MinWithMusic(ShortVideoContext shortVideoContext, long j2) {
        l.d(shortVideoContext, "");
        return j2;
    }

    @Override // com.ss.android.ugc.aweme.record.e
    public final long getMaxShootingDuration() {
        return MaxShootingDuration.INSTANCE.getLength();
    }

    @Override // com.ss.android.ugc.aweme.record.e
    public final long getMaxShootingDuration(boolean z, ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        if (z) {
            return 15000;
        }
        if (shortVideoContext.Z != 11) {
            return MaxShootingDuration.INSTANCE.getLength();
        }
        return ck.a();
    }
}
