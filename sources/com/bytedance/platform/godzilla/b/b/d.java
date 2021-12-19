package com.bytedance.platform.godzilla.b.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.c;
import com.bytedance.platform.godzilla.a.g;
import java.lang.reflect.Field;

public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Field f41973a;

    /* renamed from: b  reason: collision with root package name */
    public Field f41974b;

    static {
        Covode.recordClassIndex(25646);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Handler f41977a;

        static {
            Covode.recordClassIndex(25648);
        }

        a(Handler handler) {
            this.f41977a = handler;
        }

        public boolean handleMessage(Message message) {
            try {
                "Handle message ".concat(String.valueOf(message));
                g.a(g.a.ERROR);
                this.f41977a.handleMessage(message);
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
    }

    public final void a(Application application) {
        try {
            Field a2 = c.a(View.class, "mAttachInfo");
            this.f41973a = a2;
            if (a2 != null) {
                a2.setAccessible(true);
                application.registerActivityLifecycleCallbacks(this);
                g.a(g.a.ERROR);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onActivityStarted(Activity activity) {
        g.a(g.a.ERROR);
        if (this.f41973a != null) {
            try {
                final View decorView = activity.getWindow().getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.platform.godzilla.b.b.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25647);
                    }

                    public final void onViewDetachedFromWindow(View view) {
                    }

                    public final void onViewAttachedToWindow(View view) {
                        try {
                            Object obj = d.this.f41973a.get(decorView);
                            if (d.this.f41974b == null) {
                                d.this.f41974b = com.bytedance.platform.godzilla.d.a.a(obj.getClass(), "mHandler");
                            }
                            Handler handler = (Handler) d.this.f41974b.get(obj);
                            Field a2 = com.bytedance.platform.godzilla.d.a.a((Class<?>) Handler.class, "mCallback");
                            Handler.Callback callback = (Handler.Callback) a2.get(handler);
                            if (callback == null || !callback.getClass().getName().equals(a.class.getName())) {
                                a2.set(handler, new a(handler));
                                g.a(g.a.ERROR);
                                return;
                            }
                            g.a(g.a.ERROR);
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
