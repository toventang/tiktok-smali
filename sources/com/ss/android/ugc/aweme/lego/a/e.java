package com.ss.android.ugc.aweme.lego.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.f;
import h.f.b.l;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    static boolean f107373a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f107374b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(68729);
    }

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private int f107375a;

        static {
            Covode.recordClassIndex(68730);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivityPaused(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivityResumed(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.d(activity, "");
            l.d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            l.d(activity, "");
            int i2 = this.f107375a + 1;
            this.f107375a = i2;
            if (i2 == 1) {
                e.f107373a = false;
                ad adVar = ad.TASK_APP_BACKGROUND;
                l.d(adVar, "");
                com.ss.android.ugc.e.a aVar = f.f107547l.get(adVar);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            l.d(activity, "");
            int i2 = this.f107375a - 1;
            this.f107375a = i2;
            if (i2 == 0) {
                e.f107373a = true;
                ad adVar = ad.TASK_APP_BACKGROUND;
                l.d(adVar, "");
                com.ss.android.ugc.e.a aVar = f.f107547l.get(adVar);
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void handleMessage(Message message) {
        com.ss.android.ugc.aweme.lego.component.f fVar;
        l.d(message, "");
        int i2 = message.what;
        if (i2 == 1205) {
            f.d();
        } else if (i2 == 1207) {
            com.ss.android.ugc.aweme.lego.component.f fVar2 = f.f107546k;
            if (fVar2 != null) {
                fVar2.a(f.COLD_BOOT_END_SHORT);
            }
        } else if (i2 == 1208 && (fVar = f.f107546k) != null) {
            fVar.a(f.COLD_BOOT_END_LONG);
        }
    }
}
