package com.ss.android.ugc.aweme.port.in;

import com.bytedance.covode.number.Covode;

public interface IHashTagService {
    static {
        Covode.recordClassIndex(74489);
    }

    void saveLocalHashTag(boolean z, String str);
}
