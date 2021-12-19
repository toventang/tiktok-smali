package com.ss.android.ugc.aweme.feed.x;

import android.view.View;
import com.bytedance.covode.number.Covode;

public final class s {
    static {
        Covode.recordClassIndex(60388);
    }

    public static void a(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.x.s.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(60389);
                }

                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }
}
