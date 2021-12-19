package com.ss.android.ugc.aweme.ug.guide.a;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3776a f141883a = new C3776a((byte) 0);

    static {
        Covode.recordClassIndex(92715);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.a.a$a  reason: collision with other inner class name */
    public static final class C3776a {
        static {
            Covode.recordClassIndex(92716);
        }

        private C3776a() {
        }

        public /* synthetic */ C3776a(byte b2) {
            this();
        }

        public static boolean a(Activity activity) {
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (activity.isDestroyed()) {
                return true;
            }
            return false;
        }
    }
}
