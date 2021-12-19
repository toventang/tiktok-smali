package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IPreloadApiService {
    static {
        Covode.recordClassIndex(38382);
    }

    void a(Aweme aweme, String str);

    void a(String str, String str2, String str3);
}
