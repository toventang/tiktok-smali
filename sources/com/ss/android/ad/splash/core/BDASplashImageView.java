package com.ss.android.ad.splash.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.c;
import com.ss.android.ugc.aweme.lancet.k;

public class BDASplashImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public b f58292a;

    /* renamed from: b  reason: collision with root package name */
    private p f58293b;

    /* renamed from: c  reason: collision with root package name */
    private float f58294c;

    /* renamed from: d  reason: collision with root package name */
    private float f58295d;

    static {
        Covode.recordClassIndex(36213);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    public void setInteraction(p pVar) {
        this.f58293b = pVar;
    }

    public BDASplashImageView(Context context) {
        super(context);
        MethodCollector.i(2982);
        MethodCollector.o(2982);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        if (this.f58292a.q != 4) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f58294c = motionEvent.getX();
            this.f58295d = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            c.a aVar = new c.a();
            float f2 = this.f58294c;
            float f3 = this.f58295d;
            int width = getWidth();
            int height = getHeight();
            float f4 = (float) width;
            if (f4 > 0.0f) {
                float f5 = (float) height;
                if (f5 > 0.0f) {
                    float f6 = f2 / f4;
                    float f7 = f3 / f5;
                    int i4 = 2;
                    if (f6 < 0.33f) {
                        i3 = 0;
                    } else if (0.33f > f6 || f6 > 0.67f) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (f7 < 0.33f) {
                        i4 = 0;
                    } else if (0.33f <= f7 && f7 <= 0.67f) {
                        i4 = 1;
                    }
                    i2 = (i4 * 3) + i3;
                    aVar.f58461a = i2;
                    this.f58293b.a(this.f58292a, aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                }
            }
            i2 = -1;
            aVar.f58461a = i2;
            this.f58293b.a(this.f58292a, aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
        }
        return true;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2986);
        MethodCollector.o(2986);
    }
}
