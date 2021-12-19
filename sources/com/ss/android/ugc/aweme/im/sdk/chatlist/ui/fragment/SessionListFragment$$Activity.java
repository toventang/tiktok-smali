package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.host.TikTokHostActivity;

public class SessionListFragment$$Activity extends TikTokHostActivity {
    static {
        Covode.recordClassIndex(65351);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.host.TikTokHostActivity
    public void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }
}
