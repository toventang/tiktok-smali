package com.ss.android.ugc.aweme.sharer.ext.b;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3256a f124535a = new C3256a((byte) 0);

    static {
        Covode.recordClassIndex(81812);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.b.a$a  reason: collision with other inner class name */
    public static final class C3256a {
        static {
            Covode.recordClassIndex(81813);
        }

        private C3256a() {
        }

        public /* synthetic */ C3256a(byte b2) {
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
