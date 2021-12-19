package com.ss.android.ugc.aweme.feed.adapter;

import android.view.Surface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.f.a;

public interface ah extends OnUIPlayListener {
    static {
        Covode.recordClassIndex(57680);
    }

    void A();

    a O();

    void b(Aweme aweme);

    void e(int i2);

    void e(boolean z);

    int s();

    boolean w();

    Surface x();

    View y();

    void z();
}
