package com.ss.android.ugc.playerkit.videoview.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.a.h;
import com.ss.android.ugc.aweme.player.sdk.a.i;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.playerkit.model.c;

public final class e implements a {
    static {
        Covode.recordClassIndex(98061);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.b.a
    public final l a() {
        if (c.f148702a.isMultiPlayer()) {
            return new h(new i(c.f148702a.getPlayerType()));
        }
        return d.f148916a.a(c.f148702a.getPlayerType());
    }
}
