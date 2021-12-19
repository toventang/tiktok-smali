package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IMainAdScene extends a {
    static {
        Covode.recordClassIndex(20783);
    }

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void onVideoPageChangeEvent(Aweme aweme, boolean z);
}
