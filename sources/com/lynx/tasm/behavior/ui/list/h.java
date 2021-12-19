package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UIComponent;

public final class h extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final a f56243a;

    static {
        Covode.recordClassIndex(35131);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f56243a.f56245b != null) {
            this.f56243a.removeAllViews();
            this.f56243a.f56245b = null;
        }
    }

    public h(a aVar) {
        super(aVar);
        this.f56243a = aVar;
    }

    public final void a(int i2) {
        if (i2 > 0) {
            this.f56243a.f56247d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        int f56244a;

        /* renamed from: b  reason: collision with root package name */
        public UIComponent f56245b;

        /* renamed from: c  reason: collision with root package name */
        public int f56246c;

        /* renamed from: d  reason: collision with root package name */
        public int f56247d = 400;

        static {
            Covode.recordClassIndex(35132);
        }

        public a(Context context) {
            super(context);
            MethodCollector.i(14014);
            MethodCollector.o(14014);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i2, int i3) {
            int measuredWidth;
            int measuredHeight;
            if (this.f56244a == 0) {
                measuredWidth = View.MeasureSpec.getSize(i2);
                measuredHeight = this.f56247d;
            } else {
                UIComponent uIComponent = this.f56245b;
                if (uIComponent != null) {
                    uIComponent.measure();
                    if (2 == this.f56244a) {
                        this.f56244a = 3;
                    }
                    measuredWidth = this.f56245b.getWidth() + this.f56245b.mMarginLeft + this.f56245b.mMarginRight;
                    measuredHeight = this.f56245b.getHeight() + this.f56245b.mMarginTop + this.f56245b.mMarginBottom;
                } else {
                    measuredWidth = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                }
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
            if (UIList.f56161h) {
                LLog.a(4, "UIList", com.a.a("WrapView %d (w %d, h %d), mLayoutStatus %d", new Object[]{Integer.valueOf(this.f56246c), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()), Integer.valueOf(this.f56244a)}));
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            UIComponent uIComponent = this.f56245b;
            if (uIComponent != null) {
                uIComponent.setTop(0);
                this.f56245b.setLeft(0);
                this.f56245b.layout();
                int i6 = this.f56245b.mMarginLeft;
                int i7 = this.f56245b.mMarginTop;
                ((com.lynx.tasm.behavior.ui.view.a) this.f56245b.mView).layout(i6, i7, this.f56245b.getWidth() + i6, this.f56245b.getHeight() + i7);
                if (this.f56245b.getOverflow() != 0) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                }
                Rect x = v.x(this.f56245b.mView);
                if (x != null) {
                    x.set(Math.min(x.left, i2), Math.min(x.top, i3), Math.max(x.right, i4), Math.max(x.bottom, i5));
                    v.a(this, x);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(UIComponent uIComponent) {
        this.f56243a.f56245b = uIComponent;
        this.f56243a.addView(uIComponent.mView, new FrameLayout.LayoutParams(-1, -2));
        this.f56243a.f56246c = getAdapterPosition();
    }
}
