package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface ImSysEmojiApi {
    static {
        Covode.recordClassIndex(56148);
    }

    @f(a = "im/resources/system/emoji/")
    t<j> getResources(@l.b.t(a = "id") int i2);
}
