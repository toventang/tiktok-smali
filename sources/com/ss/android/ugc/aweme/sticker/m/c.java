package com.ss.android.ugc.aweme.sticker.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;

public final class c implements i {
    static {
        Covode.recordClassIndex(88229);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.i
    public final void a(long j2) {
        g.a().I().a("sticker_user_wait_time", new ar().a("duration", Long.valueOf(j2)).a());
    }
}
