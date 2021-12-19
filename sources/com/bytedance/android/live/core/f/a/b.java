package com.bytedance.android.live.core.f.a;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(4598);
    }

    /* access modifiers changed from: package-private */
    public static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        private View f9031a;

        /* renamed from: b  reason: collision with root package name */
        private View.OnAttachStateChangeListener f9032b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f9033c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f9034d = false;

        static {
            Covode.recordClassIndex(4599);
        }

        public final boolean onPreDraw() {
            a();
            return true;
        }

        private void a() {
            boolean b2 = b();
            if (this.f9034d != b2) {
                this.f9034d = b2;
                if (b2) {
                    this.f9032b.onViewAttachedToWindow(this.f9031a);
                } else {
                    this.f9032b.onViewDetachedFromWindow(this.f9031a);
                }
            }
        }

        private boolean b() {
            if (!this.f9033c) {
                return false;
            }
            View view = this.f9031a;
            while (true) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
            if (view == this.f9031a.getRootView()) {
                return true;
            }
            return false;
        }

        public final void onViewAttachedToWindow(View view) {
            if (!this.f9033c) {
                this.f9033c = true;
                this.f9031a.getViewTreeObserver().addOnPreDrawListener(this);
                a();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f9033c) {
                this.f9033c = false;
                this.f9031a.getViewTreeObserver().removeOnPreDrawListener(this);
                a();
            }
        }

        public static void a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
            new a(view, onAttachStateChangeListener);
        }

        private a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f9031a = view;
            this.f9032b = onAttachStateChangeListener;
            int i2 = Build.VERSION.SDK_INT;
            boolean isAttachedToWindow = view.isAttachedToWindow();
            this.f9033c = isAttachedToWindow;
            if (isAttachedToWindow) {
                this.f9031a.getViewTreeObserver().addOnPreDrawListener(this);
            }
            this.f9031a.addOnAttachStateChangeListener(this);
            a();
        }
    }
}
