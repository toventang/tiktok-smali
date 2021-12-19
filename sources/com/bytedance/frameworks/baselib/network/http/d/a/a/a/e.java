package com.bytedance.frameworks.baselib.network.http.d.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Map;

public final class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29112a;

    /* renamed from: c  reason: collision with root package name */
    private static WeakHandler f29113c = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.bytedance.frameworks.baselib.network.http.d.a.a.a.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17043);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public a f29114b;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f29115d = new Runnable() {
        /* class com.bytedance.frameworks.baselib.network.http.d.a.a.a.e.AnonymousClass2 */

        static {
            Covode.recordClassIndex(17044);
        }

        public final void run() {
            if (e.f29112a) {
                e.f29112a = false;
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(17045);
        }

        void a();
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

    static {
        Covode.recordClassIndex(17042);
    }

    public e() {
        if (a() != null) {
            f29112a = true;
        }
    }

    private static Activity a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (f29112a) {
            f29113c.postDelayed(this.f29115d, 30000);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f29112a) {
            f29112a = true;
            a aVar = this.f29114b;
            if (aVar != null) {
                aVar.a();
            }
        }
        f29113c.removeCallbacks(this.f29115d);
    }
}
