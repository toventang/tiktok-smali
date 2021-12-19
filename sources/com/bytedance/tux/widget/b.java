package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import androidx.core.h.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.j.g;
import h.j.h;
import h.l.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f45651a;

    /* renamed from: b  reason: collision with root package name */
    private int f45652b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45653c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45654d;

    /* renamed from: e  reason: collision with root package name */
    private List<Integer> f45655e;

    static {
        Covode.recordClassIndex(27788);
    }

    public final Drawable getDividerLine() {
        return this.f45651a;
    }

    public final int getDividerLineSize() {
        return this.f45652b;
    }

    public final boolean getForceVertical() {
        return this.f45653c;
    }

    public final boolean getLayoutHorizontal() {
        return this.f45654d;
    }

    public final void setDividerLine(Drawable drawable) {
        this.f45651a = drawable;
    }

    public final void setDividerLineSize(int i2) {
        this.f45652b = i2;
    }

    public final void setForceVertical(boolean z) {
        this.f45653c = z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    static final class a extends m implements h.f.a.b<View, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45656a = new a();

        static {
            Covode.recordClassIndex(27789);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(View view) {
            boolean z;
            View view2 = view;
            l.c(view2, "");
            if (view2.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.tux.widget.b$b  reason: collision with other inner class name */
    static final class C1123b extends m implements h.f.a.b<View, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1123b f45657a = new C1123b();

        static {
            Covode.recordClassIndex(27790);
        }

        C1123b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(View view) {
            boolean z;
            View view2 = view;
            l.c(view2, "");
            if (view2.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<View, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f45658a = new c();

        static {
            Covode.recordClassIndex(27791);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(View view) {
            boolean z;
            View view2 = view;
            l.c(view2, "");
            if (view2.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(7332);
        this.f45653c = true;
        this.f45654d = true;
        this.f45655e = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.ap1, R.attr.ap2, R.attr.ap7}, 0, 0);
        this.f45653c = obtainStyledAttributes.getBoolean(2, false);
        this.f45651a = obtainStyledAttributes.getDrawable(0);
        this.f45652b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.o(7332);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (canvas == null) {
            super.dispatchDraw(canvas);
            return;
        }
        Drawable drawable = this.f45651a;
        if (drawable != null) {
            Iterator<T> it = this.f45655e.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (this.f45654d) {
                    drawable.setBounds(intValue, getPaddingTop(), this.f45652b + intValue, getPaddingTop() + getMeasuredHeight());
                } else {
                    drawable.setBounds(getPaddingLeft(), intValue, getPaddingRight() + getMeasuredWidth(), this.f45652b + intValue);
                }
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        g a2 = h.a(0, getChildCount());
        ArrayList arrayList = new ArrayList(n.a(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((af) it).a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            View view = (View) obj;
            l.a((Object) view, "");
            if (view.getVisibility() != 8) {
                arrayList2.add(obj);
            }
        }
        ArrayList<View> arrayList3 = arrayList2;
        int size = arrayList3.size();
        this.f45654d = true;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size3 = View.MeasureSpec.getSize(i3);
        int i20 = 0;
        int i21 = 0;
        for (View view2 : arrayList3) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            l.a((Object) view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i12 = marginLayoutParams.leftMargin;
            } else {
                i12 = 0;
            }
            int i22 = paddingLeft + i12;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2 != null) {
                i13 = marginLayoutParams2.rightMargin;
            } else {
                i13 = 0;
            }
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i22 + i13, view2.getLayoutParams().width);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (marginLayoutParams3 != null) {
                i14 = marginLayoutParams3.topMargin;
            } else {
                i14 = 0;
            }
            int i23 = paddingTop + i14;
            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams4 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (marginLayoutParams4 != null) {
                i15 = marginLayoutParams4.bottomMargin;
            } else {
                i15 = 0;
            }
            view2.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i3, i23 + i15, view2.getLayoutParams().height));
            int measuredWidth = view2.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams5 != null) {
                i16 = marginLayoutParams5.leftMargin;
            } else {
                i16 = 0;
            }
            int i24 = measuredWidth + i16;
            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams6 != null) {
                i17 = marginLayoutParams6.rightMargin;
            } else {
                i17 = 0;
            }
            i20 = Math.max(i24 + i17, i20);
            int measuredHeight = view2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams7 != null) {
                i18 = marginLayoutParams7.topMargin;
            } else {
                i18 = 0;
            }
            int i25 = measuredHeight + i18;
            ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams8 != null) {
                i19 = marginLayoutParams8.bottomMargin;
            } else {
                i19 = 0;
            }
            i21 = Math.max(i25 + i19, i21);
        }
        if (this.f45653c) {
            a(i2, i3, i20, i21);
            return;
        }
        int i26 = size - 1;
        int paddingLeft2 = (i20 * size) + (this.f45652b * i26) + getPaddingLeft() + getPaddingRight();
        if (mode == 0 || (mode == Integer.MIN_VALUE && getLayoutParams().width == -2)) {
            for (View view3 : arrayList3) {
                l.a((Object) view3, "");
                ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
                if (!(layoutParams9 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams9 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams9;
                if (marginLayoutParams9 != null) {
                    i4 = marginLayoutParams9.leftMargin;
                } else {
                    i4 = 0;
                }
                int i27 = i20 - i4;
                ViewGroup.LayoutParams layoutParams10 = view3.getLayoutParams();
                if (!(layoutParams10 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams10 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams10;
                if (marginLayoutParams10 != null) {
                    i5 = marginLayoutParams10.rightMargin;
                } else {
                    i5 = 0;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i5, 1073741824);
                ViewGroup.LayoutParams layoutParams11 = view3.getLayoutParams();
                if (!(layoutParams11 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams11 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                if (marginLayoutParams11 != null) {
                    i6 = marginLayoutParams11.topMargin;
                } else {
                    i6 = 0;
                }
                int i28 = i21 - i6;
                ViewGroup.LayoutParams layoutParams12 = view3.getLayoutParams();
                if (!(layoutParams12 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams12 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams12;
                if (marginLayoutParams12 != null) {
                    i7 = marginLayoutParams12.bottomMargin;
                } else {
                    i7 = 0;
                }
                view3.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i28 - i7, 1073741824));
            }
            if (mode2 != 1073741824) {
                size3 = i21 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft2, size3);
        } else if (size == 0) {
            if (mode2 != 1073741824) {
                size3 = getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size2, size3);
        } else if (size2 < paddingLeft2) {
            a(i2, i3, i20, i21);
        } else {
            int paddingLeft3 = (size2 - (((this.f45652b * i26) + getPaddingLeft()) + getPaddingRight())) / size;
            for (View view4 : arrayList3) {
                l.a((Object) view4, "");
                ViewGroup.LayoutParams layoutParams13 = view4.getLayoutParams();
                if (!(layoutParams13 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams13 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParams13;
                if (marginLayoutParams13 != null) {
                    i8 = marginLayoutParams13.leftMargin;
                } else {
                    i8 = 0;
                }
                int i29 = paddingLeft3 - i8;
                ViewGroup.LayoutParams layoutParams14 = view4.getLayoutParams();
                if (!(layoutParams14 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams14 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams14;
                if (marginLayoutParams14 != null) {
                    i9 = marginLayoutParams14.rightMargin;
                } else {
                    i9 = 0;
                }
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i29 - i9, 1073741824);
                ViewGroup.LayoutParams layoutParams15 = view4.getLayoutParams();
                if (!(layoutParams15 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams15 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams15 = (ViewGroup.MarginLayoutParams) layoutParams15;
                if (marginLayoutParams15 != null) {
                    i10 = marginLayoutParams15.topMargin;
                } else {
                    i10 = 0;
                }
                int i30 = i21 - i10;
                ViewGroup.LayoutParams layoutParams16 = view4.getLayoutParams();
                if (!(layoutParams16 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams16 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) layoutParams16;
                if (marginLayoutParams16 != null) {
                    i11 = marginLayoutParams16.bottomMargin;
                } else {
                    i11 = 0;
                }
                view4.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i30 - i11, 1073741824));
            }
            if (mode2 != 1073741824) {
                size3 = i21 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size2, size3);
        }
    }

    private final void a(int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        h.l.h a2 = k.a((h.l.h) x.a(this), (h.f.a.b) c.f45658a);
        int j2 = k.j(a2);
        int i15 = 0;
        this.f45654d = false;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824 || (mode == Integer.MIN_VALUE && getLayoutParams().width == -1)) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && getLayoutParams().height == -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i6 = (size - getPaddingLeft()) - getPaddingRight();
        } else {
            i6 = i4;
            size = i4;
        }
        if (!z2) {
            Iterator a3 = a2.a();
            while (a3.hasNext()) {
                View view = (View) a3.next();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i11 = marginLayoutParams.leftMargin;
                } else {
                    i11 = 0;
                }
                int i16 = i6 - i11;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    i12 = marginLayoutParams2.rightMargin;
                } else {
                    i12 = 0;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i12, 1073741824);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams3 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams3 != null) {
                    i13 = marginLayoutParams3.topMargin;
                } else {
                    i13 = 0;
                }
                int i17 = i5 - i13;
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams4 != null) {
                    i14 = marginLayoutParams4.bottomMargin;
                } else {
                    i14 = 0;
                }
                view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i17 - i14, 1073741824));
            }
            int paddingTop = (i5 * j2) + (this.f45652b * (j2 - 1)) + getPaddingTop() + getPaddingBottom();
            if (paddingTop > 0) {
                i15 = paddingTop;
            }
            setMeasuredDimension(size, i15);
            return;
        }
        int paddingTop2 = (size2 - (((this.f45652b * (j2 - 1)) + getPaddingTop()) + getPaddingBottom())) / j2;
        Iterator a4 = a2.a();
        while (a4.hasNext()) {
            View view2 = (View) a4.next();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams5 != null) {
                i7 = marginLayoutParams5.leftMargin;
            } else {
                i7 = 0;
            }
            int i18 = i4 - i7;
            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams6 != null) {
                i8 = marginLayoutParams6.rightMargin;
            } else {
                i8 = 0;
            }
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18 - i8, 1073741824);
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams7 != null) {
                i9 = marginLayoutParams7.topMargin;
            } else {
                i9 = 0;
            }
            int i19 = paddingTop2 - i9;
            ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams8 != null) {
                i10 = marginLayoutParams8.bottomMargin;
            } else {
                i10 = 0;
            }
            view2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i19 - i10, 1073741824));
        }
        setMeasuredDimension(i4 + getPaddingLeft() + getPaddingRight(), size2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this.f45655e.clear();
        if (this.f45654d) {
            List<View> g2 = k.g(k.a((h.l.h) x.a(this), (h.f.a.b) a.f45656a));
            int paddingLeft = getPaddingLeft();
            if (v.e(this) != 0) {
                g2 = n.h((Iterable) g2);
            }
            for (View view : g2) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    i10 = 0;
                }
                int i14 = paddingLeft + i10;
                int paddingTop = getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    i11 = marginLayoutParams2.topMargin;
                } else {
                    i11 = 0;
                }
                int i15 = paddingTop + i11;
                int measuredWidth = view.getMeasuredWidth() + i14;
                int paddingTop2 = getPaddingTop();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams3 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams3 != null) {
                    i12 = marginLayoutParams3.topMargin;
                } else {
                    i12 = 0;
                }
                view.layout(i14, i15, measuredWidth, paddingTop2 + i12 + view.getMeasuredHeight());
                int measuredWidth2 = i14 + view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams4 != null) {
                    i13 = marginLayoutParams4.rightMargin;
                } else {
                    i13 = 0;
                }
                int i16 = measuredWidth2 + i13;
                this.f45655e.add(Integer.valueOf(i16));
                paddingLeft = i16 + this.f45652b;
            }
            return;
        }
        h.l.h a2 = k.a((h.l.h) x.a(this), (h.f.a.b) C1123b.f45657a);
        int paddingTop3 = getPaddingTop();
        Iterator a3 = a2.a();
        while (a3.hasNext()) {
            View view2 = (View) a3.next();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams5 != null) {
                i6 = marginLayoutParams5.topMargin;
            } else {
                i6 = 0;
            }
            int i17 = paddingTop3 + i6;
            int paddingLeft2 = getPaddingLeft();
            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams6 != null) {
                i7 = marginLayoutParams6.leftMargin;
            } else {
                i7 = 0;
            }
            int i18 = paddingLeft2 + i7;
            int paddingLeft3 = getPaddingLeft();
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams7 != null) {
                i8 = marginLayoutParams7.leftMargin;
            } else {
                i8 = 0;
            }
            view2.layout(i18, i17, paddingLeft3 + i8 + view2.getMeasuredWidth(), view2.getMeasuredHeight() + i17);
            int measuredHeight = i17 + view2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams8 != null) {
                i9 = marginLayoutParams8.topMargin;
            } else {
                i9 = 0;
            }
            int i19 = measuredHeight + i9;
            this.f45655e.add(Integer.valueOf(i19));
            paddingTop3 = i19 + this.f45652b;
        }
    }
}
