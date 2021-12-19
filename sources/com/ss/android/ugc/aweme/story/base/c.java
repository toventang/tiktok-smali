package com.ss.android.ugc.aweme.story.base;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;

public interface c {
    static {
        Covode.recordClassIndex(89457);
    }

    void a(int i2, int i3, Intent intent);

    void a(EnterStoryParam enterStoryParam);

    boolean b();

    void c();
}
