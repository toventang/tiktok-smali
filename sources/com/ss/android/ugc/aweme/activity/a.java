package com.ss.android.ugc.aweme.activity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(40305);
    }

    public static final boolean a(Activity activity) {
        if (activity instanceof com.bytedance.ies.uikit.a.a) {
            return ((com.bytedance.ies.uikit.a.a) activity).u();
        }
        if (!(activity instanceof com.bytedance.ies.foundation.activity.a) || ((com.bytedance.ies.foundation.activity.a) activity).isDestroyed()) {
            return false;
        }
        return true;
    }

    public static final boolean a(Activity activity, boolean z) {
        if (activity == null) {
            return z;
        }
        if (activity instanceof com.bytedance.ies.uikit.a.a) {
            return ((com.bytedance.ies.uikit.a.a) activity).t();
        }
        if (activity instanceof com.bytedance.ies.foundation.activity.a) {
            return ((com.bytedance.ies.foundation.activity.a) activity).isActive();
        }
        return z;
    }
}
