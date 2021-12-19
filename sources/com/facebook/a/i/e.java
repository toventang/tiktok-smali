package com.facebook.a.i;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.facebook.a.b.a.d;
import com.facebook.a.b.a.f;
import com.facebook.a.e.b;
import com.facebook.internal.a.b.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46847a = e.class.getCanonicalName();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<Integer, e> f46848e = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f46849b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f46850c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f46851d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(28531);
    }

    public final void onGlobalLayout() {
        if (!a.a(this)) {
            try {
                c();
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    private void a() {
        View a2;
        if (!a.a(this)) {
            try {
                if (!this.f46851d.getAndSet(true) && (a2 = b.a(this.f46849b.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        c();
                        this.f46849b.get();
                    }
                }
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    private void b() {
        View a2;
        if (!a.a(this)) {
            try {
                if (this.f46851d.getAndSet(false) && (a2 = b.a(this.f46849b.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        int i2 = Build.VERSION.SDK_INT;
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    private void c() {
        if (!a.a(this)) {
            try {
                AnonymousClass1 r2 = new Runnable() {
                    /* class com.facebook.a.i.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28532);
                    }

                    public final void run() {
                        Field field;
                        Object obj;
                        if (!a.a(this)) {
                            try {
                                View a2 = b.a((Activity) e.a(e.this).get());
                                Activity activity = (Activity) e.a(e.this).get();
                                if (!(a2 == null || activity == null)) {
                                    for (View view : c.a(a2)) {
                                        if (!d.a(view)) {
                                            String b2 = c.b(view);
                                            if (!b2.isEmpty() && b2.length() <= 300) {
                                                String localClassName = activity.getLocalClassName();
                                                if (!a.a(f.class)) {
                                                    try {
                                                        int hashCode = view.hashCode();
                                                        if (!f.f46853a.contains(Integer.valueOf(hashCode))) {
                                                            f fVar = new f(view, a2, localClassName);
                                                            if (!a.a(f.class)) {
                                                                try {
                                                                    Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                                                                    try {
                                                                        field = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                                                                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                                                        field = null;
                                                                    }
                                                                    if (!(declaredField == null || field == null)) {
                                                                        try {
                                                                            declaredField.setAccessible(true);
                                                                            field.setAccessible(true);
                                                                            try {
                                                                                declaredField.setAccessible(true);
                                                                                obj = declaredField.get(view);
                                                                            } catch (IllegalAccessException unused2) {
                                                                            }
                                                                            if (obj == null) {
                                                                                view.setOnClickListener(fVar);
                                                                            } else {
                                                                                field.set(obj, fVar);
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                        } catch (Throwable th) {
                                                                            a.a(th, f.class);
                                                                        }
                                                                    }
                                                                } catch (ClassNotFoundException | NoSuchFieldException unused4) {
                                                                }
                                                                view.setOnClickListener(fVar);
                                                            }
                                                            f.f46853a.add(Integer.valueOf(hashCode));
                                                        }
                                                    } catch (Throwable th2) {
                                                        a.a(th2, f.class);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused5) {
                            } catch (Throwable th3) {
                                a.a(th3, this);
                            }
                        }
                    }
                };
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    r2.run();
                } else {
                    this.f46850c.post(r2);
                }
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    private e(Activity activity) {
        this.f46849b = new WeakReference<>(activity);
    }

    static /* synthetic */ WeakReference a(e eVar) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            return eVar.f46849b;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    static void a(Activity activity) {
        if (!a.a(e.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, e> map = f46848e;
                if (!map.containsKey(Integer.valueOf(hashCode))) {
                    e eVar = new e(activity);
                    map.put(Integer.valueOf(hashCode), eVar);
                    eVar.a();
                }
            } catch (Throwable th) {
                a.a(th, e.class);
            }
        }
    }

    static void b(Activity activity) {
        if (!a.a(e.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, e> map = f46848e;
                if (map.containsKey(Integer.valueOf(hashCode))) {
                    map.remove(Integer.valueOf(hashCode));
                    map.get(Integer.valueOf(hashCode)).b();
                }
            } catch (Throwable th) {
                a.a(th, e.class);
            }
        }
    }
}
