package com.bytedance.android.livesdk.container;

import android.widget.FrameLayout;
import com.bytedance.android.live.b.i;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(9279);
    }

    void a();

    void b();

    void c();

    FrameLayout getFrameLayout();

    void setConfig(HybridConfig hybridConfig);

    void setContainerId(String str);

    void setHybridLoadListener(i.c cVar);
}
