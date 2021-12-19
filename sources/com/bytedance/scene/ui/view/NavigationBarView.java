package com.bytedance.scene.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.b;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class NavigationBarView extends View {

    /* renamed from: a  reason: collision with root package name */
    public ad f43048a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f43049b = new Runnable() {
        /* class com.bytedance.scene.ui.view.NavigationBarView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26386);
        }

        public final void run() {
            NavigationBarView.this.requestLayout();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private boolean f43050c = true;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f43051d;

    static {
        Covode.recordClassIndex(26385);
    }

    public final Drawable getNavigationBarBackgroundDrawable() {
        return this.f43051d;
    }

    public final void setNavigationBarBackground(Drawable drawable) {
        this.f43051d = drawable;
        invalidate();
    }

    public final void setNavigationBarBackgroundColor(int i2) {
        this.f43051d = new ColorDrawable(i2);
        invalidate();
    }

    public final void setNavigationBarBackground(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = b.a(getContext(), i2);
        } else {
            drawable = null;
        }
        this.f43051d = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        ad adVar;
        int d2;
        MethodCollector.i(1986);
        super.onDraw(canvas);
        if (this.f43050c && this.f43051d != null && Build.VERSION.SDK_INT >= 21 && (adVar = this.f43048a) != null && (d2 = adVar.d()) > 0) {
            this.f43051d.setBounds(0, getHeight() - d2, getWidth(), getHeight());
            this.f43051d.draw(canvas);
        }
        MethodCollector.o(1986);
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
        ad adVar = this.f43048a;
        if (adVar != null) {
            b(i2, View.MeasureSpec.makeMeasureSpec(adVar.d(), 1073741824));
        } else {
            b(i2, i3);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1960);
        v.a(this, new r() {
            /* class com.bytedance.scene.ui.view.NavigationBarView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(26387);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                if (NavigationBarView.this.getVisibility() == 8) {
                    NavigationBarView.this.f43048a = null;
                    return adVar;
                }
                if (!new ad(adVar).equals(NavigationBarView.this.f43048a)) {
                    NavigationBarView.this.f43048a = new ad(adVar);
                    NavigationBarView navigationBarView = NavigationBarView.this;
                    navigationBarView.post(navigationBarView.f43049b);
                }
                return new ad(adVar).a(adVar.a(), adVar.b(), adVar.c(), 0);
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843858});
            try {
                this.f43051d = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
                MethodCollector.o(1960);
            }
        } else {
            MethodCollector.o(1960);
        }
    }
}
