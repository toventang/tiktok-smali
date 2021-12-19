package com.ss.android.ugc.aweme.lancet;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.TTNetInit;

public final class s {
    static {
        Covode.recordClassIndex(68596);
    }

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Activity f107243a;

        static {
            Covode.recordClassIndex(68597);
        }

        public final void run() {
            TTNetInit.onActivityResume(this.f107243a);
        }

        public a(Activity activity) {
            this.f107243a = activity;
        }
    }
}
