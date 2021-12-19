package com.ss.android.ugc.aweme.detail.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.y;

public final class b {
    static {
        Covode.recordClassIndex(49459);
    }

    public static void a(View view, Aweme aweme) {
        if (y.f(aweme)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
