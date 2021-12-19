package com.bytedance.hybrid.spark.e;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f31178a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f31179b;

    /* renamed from: c  reason: collision with root package name */
    private int f31180c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup.LayoutParams f31181d;

    static {
        Covode.recordClassIndex(18104);
    }

    public final void onGlobalLayout() {
        int i2;
        WindowInsets rootWindowInsets;
        View view = this.f31178a.get();
        if (view != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            if (Build.VERSION.SDK_INT < 23 || (rootWindowInsets = view.getRootWindowInsets()) == null || rootWindowInsets.getStableInsetTop() == rect.top || rootWindowInsets.getStableInsetTop() >= rect.top) {
                i2 = rect.bottom;
            } else {
                i2 = rect.bottom - (rect.top - rootWindowInsets.getStableInsetTop());
            }
            if (i2 != this.f31180c) {
                this.f31181d.height = i2;
                view.setLayoutParams(this.f31181d);
                view.getClass();
                view.post(new b(view));
                this.f31180c = i2;
            }
        } else if (this.f31179b.isAlive()) {
            this.f31179b.removeGlobalOnLayoutListener(this);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f31178a = new WeakReference<>(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f31179b = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(this);
            this.f31181d = view.getLayoutParams();
        }
    }
}
