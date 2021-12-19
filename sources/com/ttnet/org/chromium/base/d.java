package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.n;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f155226a;

    /* renamed from: d  reason: collision with root package name */
    private static n f155227d = new n(Looper.getMainLooper(), new n.a() {
        /* class com.ttnet.org.chromium.base.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103299);
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public a f155228b;

    /* renamed from: c  reason: collision with root package name */
    private int f155229c;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f155230e = new Runnable() {
        /* class com.ttnet.org.chromium.base.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(103300);
        }

        public final void run() {
            if (d.f155226a) {
                d.f155226a = false;
                if (d.this.f155228b != null) {
                    d.this.f155228b.b();
                }
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(103301);
        }

        void a();

        void b();

        void c();

        void d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    static {
        Covode.recordClassIndex(103298);
    }

    public d() {
        if (b() != null) {
            f155226a = true;
        }
        this.f155229c = 0;
        List<Activity> a2 = a();
        if (a2 != null) {
            this.f155229c = a2.size();
        }
    }

    private static List<Activity> a() {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Field declaredField2 = value.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                arrayList.add((Activity) declaredField2.get(value));
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Activity b() {
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
        if (f155226a) {
            f155227d.postDelayed(this.f155230e, 30000);
        }
    }

    public final void onActivityStopped(Activity activity) {
        a aVar;
        int i2 = this.f155229c - 1;
        this.f155229c = i2;
        if (i2 == 0 && (aVar = this.f155228b) != null) {
            aVar.d();
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f155226a) {
            f155226a = true;
            a aVar = this.f155228b;
            if (aVar != null) {
                aVar.a();
            }
        }
        f155227d.removeCallbacks(this.f155230e);
    }

    public final void onActivityStarted(Activity activity) {
        a aVar;
        if (this.f155229c == 0 && (aVar = this.f155228b) != null) {
            aVar.c();
        }
        this.f155229c++;
    }
}
