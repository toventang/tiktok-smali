package com.ss.android.ugc.aweme.notice.api.helper;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface NotificationClickHelper {
    static {
        Covode.recordClassIndex(72483);
    }

    boolean a(Activity activity, boolean z, boolean z2, boolean z3, String str);
}
