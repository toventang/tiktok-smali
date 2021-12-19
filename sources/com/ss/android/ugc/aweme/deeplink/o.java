package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final b f79514a = new b((byte) 0);

    static {
        Covode.recordClassIndex(49391);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(49393);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static void a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            g.a().registerActivityLifecycleCallbacks(new a(str, str2));
        }
    }

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private int f79515a;

        /* renamed from: b  reason: collision with root package name */
        private final String f79516b;

        /* renamed from: c  reason: collision with root package name */
        private final String f79517c;

        static {
            Covode.recordClassIndex(49392);
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
        }

        public final void onActivityStopped(Activity activity) {
            l.d(activity, "");
        }

        public a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f79516b = str;
            this.f79517c = str2;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "");
            if (TextUtils.equals(activity.getClass().getName(), this.f79516b)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(this.f79517c).a();
                g.a().unregisterActivityLifecycleCallbacks(this);
                return;
            }
            int i2 = this.f79515a + 1;
            this.f79515a = i2;
            if (i2 > 5) {
                g.a().unregisterActivityLifecycleCallbacks(this);
            }
        }
    }
}
