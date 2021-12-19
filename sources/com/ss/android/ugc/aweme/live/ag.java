package com.ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.l.a.a;

public final class ag implements g {
    static {
        Covode.recordClassIndex(69312);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.ss.android.ugc.aweme.live.g
    public final Class c() {
        return LivePlayActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.live.g
    public final String a() {
        return Live.getLiveDomain();
    }

    @Override // com.ss.android.ugc.aweme.live.g
    public final a b() {
        return com.bytedance.l.b.c.a.b();
    }

    @Override // com.ss.android.ugc.aweme.live.g
    public final Class a(int i2) {
        if (i2 == 5) {
            return LiveBroadcastActivity.class;
        }
        if (i2 != 6) {
            return null;
        }
        return LiveBgBroadcastActivity.class;
    }
}
