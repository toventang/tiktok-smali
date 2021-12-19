package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.bl;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static WeakReference<Activity> f99087i = new WeakReference<>(null);

    /* renamed from: a  reason: collision with root package name */
    public int f99088a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f99089b = true;

    /* renamed from: c  reason: collision with root package name */
    public long f99090c;

    /* renamed from: d  reason: collision with root package name */
    public al f99091d;

    /* renamed from: e  reason: collision with root package name */
    public a f99092e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f99093f = true;

    /* renamed from: g  reason: collision with root package name */
    public long f99094g;

    /* renamed from: h  reason: collision with root package name */
    public int f99095h;

    public interface a {
        static {
            Covode.recordClassIndex(63135);
        }

        void a(Activity activity);

        void b(Activity activity);
    }

    public final boolean a() {
        if (this.f99095h > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(63133);
    }

    public h(Application application) {
        if (application == null) {
            this.f99089b = false;
            return;
        }
        application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.ss.android.ugc.aweme.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63134);
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                if (activity instanceof MainActivity) {
                    h hVar = h.this;
                    hVar.f99095h--;
                }
            }

            public final void onActivityPaused(Activity activity) {
                if (activity != null) {
                    bd.a(activity);
                }
                h.this.f99093f = true;
                h.this.f99094g = System.currentTimeMillis();
                bl.a(activity, new bl.b(bl.a.f75684a));
            }

            public final void onActivityResumed(Activity activity) {
                if (activity != null) {
                    bd.a(activity);
                    bd.f68527a.addFirst(new WeakReference<>(activity));
                }
                h.this.f99093f = false;
                h.f99087i = new WeakReference<>(activity);
                bl.a(activity, new bl.c(bl.a.f75684a));
            }

            public final void onActivityStarted(Activity activity) {
                bl.a(activity, new bl.d(bl.a.f75684a));
                h.this.f99088a++;
                if (h.this.f99088a == 1) {
                    h.this.f99089b = false;
                    if (h.this.f99091d != null) {
                        h.this.f99091d.a();
                    }
                    if (h.this.f99092e != null) {
                        h.this.f99092e.a(activity);
                    }
                }
            }

            public final void onActivityStopped(Activity activity) {
                bl.a(activity, new bl.e(bl.a.f75684a));
                h.this.f99088a--;
                if (h.this.f99088a == 0) {
                    h.this.f99089b = true;
                    h.this.f99090c = System.currentTimeMillis();
                    if (h.this.f99091d != null) {
                        h.this.f99091d.b();
                    }
                    if (h.this.f99092e != null) {
                        h.this.f99092e.b(activity);
                    }
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MainActivity) {
                    h.this.f99095h++;
                }
            }
        });
    }
}
