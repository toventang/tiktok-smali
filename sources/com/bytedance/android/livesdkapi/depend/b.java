package com.bytedance.android.livesdkapi.depend;

import android.app.Application;
import com.bytedance.covode.number.Covode;

public interface b extends Application.ActivityLifecycleCallbacks {
    static {
        Covode.recordClassIndex(13576);
    }

    void a(boolean z);
}
