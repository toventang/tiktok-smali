package com.bytedance.android.livesdk.utils;

import android.os.Build;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.d;
import com.bytedance.covode.number.Covode;

public final class ab {
    static {
        Covode.recordClassIndex(13119);
    }

    public static void a(Fragment fragment) {
        e activity = fragment.getActivity();
        if (activity != null && d.a(activity)) {
            Window window = activity.getWindow();
            if (Build.VERSION.SDK_INT >= 21 && window != null) {
                if (window.getAttributes() == null || (window.getAttributes().flags & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    window.addFlags(Integer.MIN_VALUE);
                }
                window.setStatusBarColor(-16777216);
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
    }
}
