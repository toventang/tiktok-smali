package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.a;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.d;

public interface b {
    static {
        Covode.recordClassIndex(82798);
    }

    void a();

    void a(int i2);

    void b();

    void c();

    View d();

    void setButtonClickable(boolean z);

    void setCollectMusicCallback(a aVar);

    void setRecyclerViewAdapter(aa.h hVar);

    void setStickPointMusicListener(d dVar);
}
