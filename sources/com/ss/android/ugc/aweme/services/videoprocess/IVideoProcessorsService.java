package com.ss.android.ugc.aweme.services.videoprocess;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.af.a;

public interface IVideoProcessorsService {
    static {
        Covode.recordClassIndex(79879);
    }

    void convertVideo2Gif(String str, String str2, boolean z, a aVar);
}
