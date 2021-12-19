package com.bytedance.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class WidgetContainer extends View {

    /* renamed from: a  reason: collision with root package name */
    a f24302a;

    static {
        Covode.recordClassIndex(14273);
    }

    public WidgetContainer(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public WidgetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    static boolean a(int i2) {
        return (i2 == -1 || i2 == -2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        l.c(canvas, "");
    }

    public final void draw(Canvas canvas) {
        l.c(canvas, "");
    }

    public final void a(View view) {
        ViewParent viewParent;
        MethodCollector.i(3887);
        if (getParent() != null) {
            MethodCollector.o(3887);
            return;
        }
        ViewGroup viewGroup = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = parent;
        }
        ViewGroup viewGroup3 = viewGroup;
        if (viewGroup3 != null) {
            viewGroup3.removeView(this);
        }
        a aVar = this.f24302a;
        if (aVar == null) {
            MethodCollector.o(3887);
            return;
        }
        setId(aVar.f24306d);
        if (view != null) {
            view.setId(-1);
        }
        setVisibility(aVar.f24307e);
        ViewGroup viewGroup4 = aVar.f24308f;
        int i2 = aVar.f24305c;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = aVar.f24304b;
        layoutParams.height = aVar.f24303a;
        viewGroup4.addView(this, i2, layoutParams);
        MethodCollector.o(3887);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    private WidgetContainer(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4102);
        setWillNotDraw(true);
        MethodCollector.o(4102);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ WidgetContainer(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24303a;

        /* renamed from: b  reason: collision with root package name */
        public int f24304b;

        /* renamed from: c  reason: collision with root package name */
        public int f24305c;

        /* renamed from: d  reason: collision with root package name */
        public int f24306d;

        /* renamed from: e  reason: collision with root package name */
        public int f24307e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f24308f;

        static {
            Covode.recordClassIndex(14274);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!(this.f24303a == aVar.f24303a && this.f24304b == aVar.f24304b && this.f24305c == aVar.f24305c && this.f24306d == aVar.f24306d && this.f24307e == aVar.f24307e && l.a(this.f24308f, aVar.f24308f))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i2 = ((((((((this.f24303a * 31) + this.f24304b) * 31) + this.f24305c) * 31) + this.f24306d) * 31) + this.f24307e) * 31;
            ViewGroup viewGroup = this.f24308f;
            return i2 + (viewGroup != null ? viewGroup.hashCode() : 0);
        }

        public final String toString() {
            return "OriginLayoutParam(height=" + this.f24303a + ", width=" + this.f24304b + ", index=" + this.f24305c + ", id=" + this.f24306d + ", visibility=" + this.f24307e + ", parent=" + this.f24308f + ")";
        }

        public a(int i2, int i3, int i4, int i5, int i6, ViewGroup viewGroup) {
            l.c(viewGroup, "");
            this.f24303a = i2;
            this.f24304b = i3;
            this.f24305c = i4;
            this.f24306d = i5;
            this.f24307e = i6;
            this.f24308f = viewGroup;
        }
    }
}
