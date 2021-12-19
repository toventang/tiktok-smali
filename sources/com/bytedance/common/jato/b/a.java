package com.bytedance.common.jato.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f26778a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Object> f26779b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f26780c;

    /* renamed from: d  reason: collision with root package name */
    private String f26781d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26782e;

    /* renamed from: f  reason: collision with root package name */
    private int f26783f;

    static {
        Covode.recordClassIndex(15799);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* renamed from: com.bytedance.common.jato.b.a$a  reason: collision with other inner class name */
    public static final class C0575a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26784a = new a((byte) 0);

        static {
            Covode.recordClassIndex(15800);
        }
    }

    private a() {
        this.f26779b = new ArrayList<>();
        this.f26781d = null;
    }

    private Object[] a() {
        Object[] objArr;
        MethodCollector.i(8420);
        synchronized (this.f26779b) {
            try {
                if (this.f26779b.size() > 0) {
                    objArr = this.f26779b.toArray();
                } else {
                    objArr = null;
                }
            } catch (Throwable th) {
                MethodCollector.o(8420);
                throw th;
            }
        }
        if (objArr == null) {
            Object[] objArr2 = new Object[0];
            MethodCollector.o(8420);
            return objArr2;
        }
        MethodCollector.o(8420);
        return objArr;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void onActivityPaused(Activity activity) {
        a();
    }

    public final void onActivityResumed(Activity activity) {
        this.f26780c = new WeakReference<>(activity);
        this.f26781d = null;
        a();
    }

    public final void onActivityStarted(Activity activity) {
        a();
        if (this.f26782e) {
            this.f26782e = false;
            return;
        }
        int i2 = this.f26783f + 1;
        this.f26783f = i2;
        if (i2 == 1) {
            this.f26778a = true;
            a();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f26782e = true;
            return;
        }
        int i2 = this.f26783f - 1;
        this.f26783f = i2;
        if (i2 == 0) {
            this.f26778a = false;
            a();
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a();
    }
}
