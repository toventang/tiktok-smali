package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.b;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class h extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Drawable f52553a;

    /* renamed from: b  reason: collision with root package name */
    Rect f52554b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f52555c;

    static {
        Covode.recordClassIndex(32558);
    }

    /* access modifiers changed from: protected */
    public void a(ad adVar) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f52553a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f52553a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f52554b != null && this.f52553a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f52555c.set(0, 0, width, this.f52554b.top);
            this.f52553a.setBounds(this.f52555c);
            this.f52553a.draw(canvas);
            this.f52555c.set(0, height - this.f52554b.bottom, width, height);
            this.f52553a.setBounds(this.f52555c);
            this.f52553a.draw(canvas);
            this.f52555c.set(0, this.f52554b.top, this.f52554b.left, height - this.f52554b.bottom);
            this.f52553a.setBounds(this.f52555c);
            this.f52553a.draw(canvas);
            this.f52555c.set(width - this.f52554b.right, this.f52554b.top, width, height - this.f52554b.bottom);
            this.f52553a.setBounds(this.f52555c);
            this.f52553a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(3407);
        this.f52555c = new Rect();
        TypedArray a2 = k.a(context, attributeSet, new int[]{R.attr.x7}, i2, R.style.r2, new int[0]);
        this.f52553a = a2.getDrawable(0);
        a2.recycle();
        setWillNotDraw(true);
        v.a(this, new r() {
            /* class com.google.android.material.internal.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32559);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                if (h.this.f52554b == null) {
                    h.this.f52554b = new Rect();
                }
                h.this.f52554b.set(adVar.a(), adVar.b(), adVar.c(), adVar.d());
                h.this.a(adVar);
                h hVar = h.this;
                boolean z = true;
                if ((!adVar.f2507b.g().equals(b.f2405a)) && h.this.f52553a != null) {
                    z = false;
                }
                hVar.setWillNotDraw(z);
                v.c(h.this);
                return adVar.f2507b.c();
            }
        });
        MethodCollector.o(3407);
    }
}
