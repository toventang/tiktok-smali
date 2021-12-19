package com.ss.android.ugc.aweme.music.assem.list;

import com.bytedance.assem.arch.a.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.api.b;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;

public interface r extends d, b {
    static {
        Covode.recordClassIndex(71483);
    }

    OriginalMusicList a(String str, String str2, int i2, int i3);

    PinnedMusicList a(String str);
}
