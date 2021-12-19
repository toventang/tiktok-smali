package com.bytedance.scene.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.b;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class StatusBarView extends View {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f43054c = {R.attr.om};

    /* renamed from: a  reason: collision with root package name */
    public ad f43055a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f43056b = new Runnable() {
        /* class com.bytedance.scene.ui.view.StatusBarView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26389);
        }

        public final void run() {
            StatusBarView.this.requestLayout();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private boolean f43057d = true;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f43058e;

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.f43058e;
    }

    static {
        Covode.recordClassIndex(26388);
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.f43058e = drawable;
        invalidate();
    }

    public final void setStatusBarBackgroundColor(int i2) {
        this.f43058e = new ColorDrawable(i2);
        invalidate();
    }

    public final void setStatusBarBackground(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = b.a(getContext(), i2);
        } else {
            drawable = null;
        }
        this.f43058e = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        ad adVar;
        int b2;
        MethodCollector.i(3142);
        super.onDraw(canvas);
        if (this.f43057d && this.f43058e != null && Build.VERSION.SDK_INT >= 21 && (adVar = this.f43055a) != null && (b2 = adVar.b()) > 0) {
            this.f43058e.setBounds(0, 0, getWidth(), b2);
            this.f43058e.draw(canvas);
        }
        MethodCollector.o(3142);
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i2 : size;
        }
        return Math.min(i2, size);
    }

    private void b(int i2, int i3) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i2), a(getSuggestedMinimumHeight(), i3));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        ad adVar = this.f43055a;
        if (adVar != null) {
            b(i2, View.MeasureSpec.makeMeasureSpec(adVar.b(), 1073741824));
        } else {
            b(i2, i3);
        }
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3106);
        v.a(this, new r() {
            /* class com.bytedance.scene.ui.view.StatusBarView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(26390);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                if (StatusBarView.this.getVisibility() == 8) {
                    StatusBarView.this.f43055a = null;
                    return adVar;
                }
                if (!new ad(adVar).equals(StatusBarView.this.f43055a)) {
                    StatusBarView.this.f43055a = new ad(adVar);
                    StatusBarView statusBarView = StatusBarView.this;
                    statusBarView.post(statusBarView.f43056b);
                }
                return new ad(adVar).a(adVar.a(), 0, adVar.c(), adVar.d());
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f43054c);
        try {
            this.f43058e = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            v.a(this, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
            MethodCollector.o(3106);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.o(3106);
            throw th;
        }
    }
}
