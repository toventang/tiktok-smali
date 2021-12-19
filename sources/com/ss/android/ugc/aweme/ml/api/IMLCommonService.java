package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.a.b;

public interface IMLCommonService {
    static {
        Covode.recordClassIndex(70851);
    }

    void addCommonEventListener(String str, b bVar);

    b getAwemeAdapter();

    void onPlayFinishFirst(Aweme aweme, String str);

    void onPlayFirstFrame(Aweme aweme, String str);

    void onPlayPause(Aweme aweme, String str, boolean z);

    void onPlayPrepare(Aweme aweme, String str, b bVar);

    void onPlayResume(Aweme aweme, String str);

    void onPlayStop(String str, Aweme aweme, String str2);

    void onPlayStopCallPlayTime(Aweme aweme, long j2, String str);

    void runInMainActivityOnCreate();

    void runInMainActivityOnDestroy();
}
