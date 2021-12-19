package com.bytedance.platform.a.b.c.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.a.g;
import java.lang.reflect.Field;

public final class c extends a implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, View.OnLayoutChangeListener, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public Application f41876c;

    /* renamed from: d  reason: collision with root package name */
    public Field f41877d;

    /* renamed from: e  reason: collision with root package name */
    private long f41878e;

    static {
        Covode.recordClassIndex(25587);
    }

    public final void onDraw() {
        a("onDraw");
    }

    public final void onGlobalLayout() {
        a("onGlobalLayout");
    }

    public final boolean onPreDraw() {
        a("onPreDraw");
        return true;
    }

    public final void onScrollChanged() {
        a("onScrollChanged");
    }

    public final void onActivityDestroyed(Activity activity) {
        a("onActivityDestroyed");
    }

    public final void onActivityPaused(Activity activity) {
        a("onActivityPaused");
    }

    public final void onActivityResumed(Activity activity) {
        a("onActivityResumed");
    }

    public final void onActivityStopped(Activity activity) {
        a("onActivityStopped");
    }

    public final void onTouchModeChanged(boolean z) {
        a("onTouchModeChanged");
    }

    public final void onViewAttachedToWindow(View view) {
        a("onViewAttachedToWindow");
    }

    public final void onViewDetachedFromWindow(View view) {
        a("onViewDetachedFromWindow");
    }

    private void a(String str) {
        if (this.f41875b != null && System.currentTimeMillis() - this.f41878e > 1000) {
            this.f41875b.a();
            this.f41878e = System.currentTimeMillis();
            "notifyCallback form method = ".concat(String.valueOf(str));
            g.a(g.a.ERROR);
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f41877d != null) {
            try {
                View decorView = activity.getWindow().getDecorView();
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                viewTreeObserver.addOnDrawListener(this);
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnPreDrawListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
                viewTreeObserver.addOnTouchModeChangeListener(this);
                decorView.addOnAttachStateChangeListener(this);
                decorView.addOnLayoutChangeListener(this);
            } catch (Throwable unused) {
            }
        }
    }

    public c(Application application, b bVar) {
        super("PerformTraversalsHook", bVar);
        this.f41876c = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a("onActivityCreated");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a("onActivitySaveInstanceState");
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        a("onGlobalFocusChanged");
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        a("onLayoutChange");
    }
}
