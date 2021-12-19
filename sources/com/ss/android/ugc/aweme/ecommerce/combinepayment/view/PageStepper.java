package com.ss.android.ugc.aweme.ecommerce.combinepayment.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PageStepper extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f85693a;

    /* renamed from: b  reason: collision with root package name */
    private int f85694b;

    /* renamed from: c  reason: collision with root package name */
    private int f85695c;

    /* renamed from: d  reason: collision with root package name */
    private int f85696d;

    /* renamed from: e  reason: collision with root package name */
    private final int f85697e;

    /* renamed from: f  reason: collision with root package name */
    private final int f85698f;

    static {
        Covode.recordClassIndex(53594);
    }

    public PageStepper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getDarkColor() {
        return this.f85696d;
    }

    public final int getLightColor() {
        return this.f85695c;
    }

    public final int getLightStep() {
        return this.f85694b;
    }

    public final int getTotalStep() {
        return this.f85693a;
    }

    private final void a() {
        MethodCollector.i(4750);
        removeAllViews();
        int i2 = this.f85693a;
        if (i2 > 0) {
            int i3 = 1;
            while (true) {
                View view = new View(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.f85698f);
                layoutParams.weight = 1.0f;
                if (i3 != this.f85693a) {
                    layoutParams.rightMargin = this.f85697e;
                    int i4 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginEnd(this.f85697e);
                }
                view.setLayoutParams(layoutParams);
                if (i3 <= this.f85694b) {
                    view.setBackgroundColor(this.f85695c);
                } else {
                    view.setBackgroundColor(this.f85696d);
                }
                addView(view);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        MethodCollector.o(4750);
    }

    public final void setDarkColor(int i2) {
        this.f85696d = i2;
    }

    public final void setLightColor(int i2) {
        this.f85695c = i2;
    }

    public final void setTotalStep(int i2) {
        this.f85693a = i2;
        a();
    }

    public final void setLightStep(int i2) {
        if (i2 <= 0) {
            this.f85694b = 0;
        } else {
            this.f85694b = i2;
        }
        a();
    }

    private /* synthetic */ PageStepper(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PageStepper(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4762);
        this.f85693a = 3;
        this.f85694b = 1;
        this.f85695c = b.c(context, R.color.bh);
        this.f85696d = b.c(context, R.color.f159922f);
        int b2 = (int) n.b(context, 2.0f);
        this.f85697e = b2;
        this.f85698f = b2;
        setOrientation(0);
        if (isInEditMode()) {
            this.f85695c = b.c(context, R.color.nb);
            this.f85696d = b.c(context, R.color.j7);
            a();
        }
        MethodCollector.o(4762);
    }
}
