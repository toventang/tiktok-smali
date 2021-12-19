package com.ss.android.ugc.aweme.share.m;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3228a f124080a = new C3228a((byte) 0);

    static {
        Covode.recordClassIndex(81479);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.m.a$a  reason: collision with other inner class name */
    public static final class C3228a {
        static {
            Covode.recordClassIndex(81480);
        }

        private C3228a() {
        }

        public /* synthetic */ C3228a(byte b2) {
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
