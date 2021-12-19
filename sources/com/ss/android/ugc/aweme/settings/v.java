package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import h.f.b.l;

public final class v {
    static {
        Covode.recordClassIndex(80871);
    }

    public static final boolean a() {
        IMusicService m2 = MusicService.m();
        l.b(m2, "");
        return m2.f();
    }
}
