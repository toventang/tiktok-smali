package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(65546);
    }

    public static final boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if ((context instanceof Application) || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public static final boolean a(Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null || !fragment.isAdded() || !a(context)) {
            return false;
        }
        return true;
    }
}
