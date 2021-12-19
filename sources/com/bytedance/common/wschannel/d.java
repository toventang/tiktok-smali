package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;

final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27203a;

    /* renamed from: c  reason: collision with root package name */
    private static WeakHandler f27204c = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.bytedance.common.wschannel.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16032);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public a f27205b;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f27206d = new Runnable() {
        /* class com.bytedance.common.wschannel.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(16033);
        }

        public final void run() {
            Logger.debug();
            if (d.f27203a) {
                d.f27203a = false;
                if (d.this.f27205b != null) {
                    d.this.f27205b.b();
                }
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(16034);
        }

        void a();

        void b();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    d() {
    }

    static {
        Covode.recordClassIndex(16031);
    }

    public final void onActivityPaused(Activity activity) {
        if (f27203a) {
            f27204c.postDelayed(this.f27206d, 3000);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f27203a) {
            f27203a = true;
            a aVar = this.f27205b;
            if (aVar != null) {
                aVar.a();
            }
        }
        Logger.debug();
        f27204c.removeCallbacks(this.f27206d);
    }
}
