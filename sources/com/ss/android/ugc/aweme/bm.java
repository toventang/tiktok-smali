package com.ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface bm {
    static {
        Covode.recordClassIndex(42318);
    }

    void promptIfNeededOrToast(Context context, String str, int i2);
}
