package com.lynx.tasm.behavior.ui.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.scroll.a;
import com.lynx.tasm.c.c;
import com.lynx.tasm.c.h;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.Map;

public class UIScrollView extends AbsLynxUIScroll<a> implements b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f56269a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f56270b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56271c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f56272d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f56273e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f56274f;

    /* renamed from: g  reason: collision with root package name */
    public int f56275g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f56276h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56277i;

    /* renamed from: j  reason: collision with root package name */
    private int f56278j;

    /* renamed from: k  reason: collision with root package name */
    private int f56279k;

    /* renamed from: l  reason: collision with root package name */
    private int f56280l;

    static {
        Covode.recordClassIndex(35139);
    }

    public static boolean a(int i2) {
        return (i2 & 1) != 0;
    }

    public static boolean b(int i2) {
        return (i2 & 2) != 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getOverflow() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.b
    public final void a() {
        this.f56274f = true;
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public View getRealParentView() {
        a aVar = (a) this.mView;
        if (aVar == null) {
            return null;
        }
        return aVar.getLinearLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getScrollX() {
        return ((a) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getScrollY() {
        return ((a) this.mView).getScrollY();
    }

    private void c() {
        if (this.f56276h) {
            ((a) this.mView).setOrientation(1);
        } else {
            ((a) this.mView).setOrientation(0);
        }
    }

    public final void b() {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        for (int i2 = 0; i2 < this.mChildren.size(); i2++) {
            ((LynxBaseUI) this.mChildren.get(i2)).checkStickyOnParentScroll(scrollX, scrollY);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void invalidate() {
        ((a) this.mView).getLinearLayout().invalidate();
        ((a) this.mView).invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i3 = this.mPaddingRight + this.mBorderRightWidth;
        ((a) this.mView).setPadding(i2, this.mPaddingTop + this.mBorderTopWidth, i3, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void layout() {
        super.layout();
        int i2 = this.f56278j;
        if (i2 <= 0) {
            return;
        }
        if (this.f56276h && i2 + getHeight() <= ((a) this.mView).getContentHeight()) {
            ((a) this.mView).a(((a) this.mView).getRealScrollX(), this.f56278j, false);
            this.f56278j = 0;
        } else if (!this.f56276h && this.f56278j + getWidth() <= ((a) this.mView).getContentWidth()) {
            ((a) this.mView).a(this.f56278j, ((a) this.mView).getRealScrollY(), false);
            this.f56278j = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void measure() {
        boolean z;
        if (((a) this.mView).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            LynxBaseUI childAt = getChildAt(i2);
            if (z) {
                width = Math.max(width, childAt.getWidth() + childAt.getLeft() + childAt.mMarginRight + this.mPaddingRight);
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop() + childAt.mMarginBottom);
            }
        }
        if (!(((a) this.mView).getContentWidth() == width && ((a) this.mView).getContentHeight() == height)) {
            float f2 = (float) width;
            float f3 = (float) height;
            if (this.f56277i && DisplayMetricsHolder.a() != null) {
                c cVar = new c(getSign(), "contentsizechanged");
                cVar.a("scrollWidth", Float.valueOf(f2 / DisplayMetricsHolder.a().density));
                cVar.a("scrollHeight", Float.valueOf(f3 / DisplayMetricsHolder.a().density));
                if (this.mContext != null) {
                    this.mContext.f55897e.a(cVar);
                }
            }
        }
        a aVar = (a) this.mView;
        aVar.f56287f = height;
        aVar.f56286e = width;
        if (aVar.f56282a != null) {
            aVar.f56282a.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setLowerThreshole(int i2) {
        this.f56279k = i2;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollTap(boolean z) {
        this.f56273e = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setUpperThreshole(int i2) {
        this.f56280l = i2;
    }

    public UIScrollView(j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void b(boolean z) {
        this.f56276h = !z;
        c();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        a aVar = new a(context);
        aVar.setOnScrollListener(new a.AbstractC1263a() {
            /* class com.lynx.tasm.behavior.ui.scroll.UIScrollView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35142);
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void b() {
                if (UIScrollView.this.f56274f) {
                    UIScrollView.this.b();
                }
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void a() {
                if (UIScrollView.this.f56272d) {
                    UIScrollView uIScrollView = UIScrollView.this;
                    uIScrollView.a(uIScrollView.getScrollX(), UIScrollView.this.getScrollY(), UIScrollView.this.getScrollX(), UIScrollView.this.getScrollY(), "scrollend");
                }
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void a(int i2) {
                if (!UIScrollView.this.f56273e) {
                    if (i2 != 0) {
                        UIScrollView.this.recognizeGesturere();
                    }
                } else if (i2 == 1) {
                    UIScrollView.this.recognizeGesturere();
                }
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.a.AbstractC1263a
            public final void a(int i2, int i3, int i4, int i5) {
                if (UIScrollView.this.f56274f) {
                    UIScrollView.this.b();
                }
                if (UIScrollView.this.f56270b || UIScrollView.this.f56269a) {
                    int a2 = UIScrollView.this.a(i2, i3);
                    if (UIScrollView.this.f56270b && UIScrollView.b(a2) && !UIScrollView.b(UIScrollView.this.f56275g)) {
                        UIScrollView uIScrollView = UIScrollView.this;
                        uIScrollView.a(uIScrollView.getScrollX(), UIScrollView.this.getScrollY(), UIScrollView.this.getScrollX(), UIScrollView.this.getScrollY(), "scrolltolower");
                    } else if (UIScrollView.this.f56269a && UIScrollView.a(a2) && !UIScrollView.a(UIScrollView.this.f56275g)) {
                        UIScrollView uIScrollView2 = UIScrollView.this;
                        uIScrollView2.a(uIScrollView2.getScrollX(), UIScrollView.this.getScrollY(), UIScrollView.this.getScrollX(), UIScrollView.this.getScrollY(), "scrolltoupper");
                    }
                    UIScrollView.this.f56275g = a2;
                }
                if (UIScrollView.this.f56271c) {
                    UIScrollView.this.a(i2, i3, i4, i5, "scroll");
                }
            }
        });
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setEnableScroll(boolean z) {
        if (this.mView != null) {
            ((a) this.mView).setEnableScroll(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollBarEnable(boolean z) {
        try {
            ((a) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e2) {
            LLog.a(6, "UIScrollView", e2.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollLeft(int i2) {
        int realScrollY = ((a) this.mView).getRealScrollY();
        int a2 = (int) com.lynx.tasm.utils.j.a((float) i2);
        if (getWidth() + a2 <= ((a) this.mView).getContentWidth()) {
            ((a) this.mView).a(a2, realScrollY, false);
            this.f56278j = 0;
            return;
        }
        this.f56278j = a2;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollTop(int i2) {
        int realScrollX = ((a) this.mView).getRealScrollX();
        int a2 = (int) com.lynx.tasm.utils.j.a((float) i2);
        if (getHeight() + a2 <= ((a) this.mView).getContentHeight()) {
            ((a) this.mView).a(realScrollX, a2, false);
            this.f56278j = 0;
            return;
        }
        this.f56278j = a2;
    }

    @p
    public void autoScroll(ReadableMap readableMap) {
        a aVar = (a) this.mView;
        double d2 = readableMap.getDouble("rate", 0.0d);
        if (!readableMap.getBoolean("start", true)) {
            aVar.o = false;
            aVar.p = 0;
        } else if (d2 > 0.0d && !aVar.o) {
            aVar.o = true;
            aVar.p = (int) Math.max((double) com.lynx.tasm.utils.j.a((float) (d2 / 60.0d)), 1.0d);
            aVar.n = new a.c(aVar, (byte) 0);
            aVar.post(aVar.n);
        }
    }

    @p
    public void scrollTo(ReadableMap readableMap) {
        double d2 = readableMap.getDouble("offset", 0.0d);
        int i2 = readableMap.getInt("index", -1);
        double d3 = (double) DisplayMetricsHolder.a().density;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        boolean z = readableMap.getBoolean("smooth", false);
        if (this.f56276h) {
            if (i2 >= 0 && i2 < this.mChildren.size()) {
                double top = (double) ((LynxBaseUI) this.mChildren.get(i2)).getTop();
                Double.isNaN(top);
                d4 += top;
            }
            ((a) this.mView).a(0, (int) d4, z);
            return;
        }
        if (i2 >= 0 && i2 < this.mChildren.size()) {
            double left = (double) ((LynxBaseUI) this.mChildren.get(i2)).getLeft();
            Double.isNaN(left);
            d4 += left;
        }
        ((a) this.mView).a((int) d4, 0, z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void scrollToIndex(int i2) {
        if (i2 >= 0 && i2 < this.mChildren.size()) {
            if (this.f56276h) {
                ((a) this.mView).a(((a) this.mView).getRealScrollX(), ((LynxBaseUI) this.mChildren.get(i2)).getTop(), false);
                return;
            }
            int realScrollY = ((a) this.mView).getRealScrollY();
            ((a) this.mView).a(((LynxBaseUI) this.mChildren.get(i2)).getLeft(), realScrollY, false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f56269a = false;
            this.f56270b = false;
            this.f56271c = false;
            this.f56272d = false;
            if (map.containsKey("scrolltolower")) {
                this.f56270b = true;
            }
            if (map.containsKey("scrolltoupper")) {
                this.f56269a = true;
            }
            if (map.containsKey("scroll")) {
                this.f56271c = true;
            }
            if (map.containsKey("scrollend")) {
                this.f56272d = true;
            }
            if (map.containsKey("contentsizechanged")) {
                this.f56277i = true;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLynxDirection(int i2) {
        this.mLynxDirection = i2;
        if (i2 == 2) {
            ((a) this.mView).setLayoutDirection(1);
            ((a) this.mView).getHScrollView().setLayoutDirection(1);
            ((a) this.mView).getLinearLayout().setLayoutDirection(1);
            return;
        }
        ((a) this.mView).setLayoutDirection(0);
        ((a) this.mView).getHScrollView().setLayoutDirection(0);
        ((a) this.mView).getLinearLayout().setLayoutDirection(0);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(boolean z) {
        this.f56276h = z;
        c();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        super.drawChild(lynxFlattenUI, canvas);
    }

    public final int a(int i2, int i3) {
        if (this.f56276h) {
            return a(i3, this.f56280l, this.f56279k, 1, 2);
        }
        if (this.mLynxDirection == 2) {
            return a(i2, this.f56279k, this.f56280l, 2, 1);
        }
        return a(i2, this.f56280l, this.f56279k, 1, 2);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
        a(lynxBaseUI, z, str, str2, 0);
    }

    private int a(int i2, int i3, int i4, int i5, int i6) {
        int measuredWidth;
        int measuredWidth2;
        if (i2 <= i3) {
            return 0 | i5;
        }
        if (((a) this.mView).getHScrollView() == null) {
            return 0;
        }
        View childAt = ((a) this.mView).getHScrollView().getChildAt(0);
        if (this.f56276h) {
            measuredWidth = childAt.getMeasuredHeight();
            measuredWidth2 = ((a) this.mView).getMeasuredHeight();
        } else {
            measuredWidth = childAt.getMeasuredWidth();
            measuredWidth2 = ((a) this.mView).getMeasuredWidth();
        }
        if (i2 >= (measuredWidth - measuredWidth2) - i4) {
            return 0 | i6;
        }
        return 0;
    }

    public final void a(int i2, int i3, int i4, int i5, String str) {
        h a2 = h.a(getSign(), str);
        a2.a(i2, i3, ((a) this.mView).getContentHeight(), ((a) this.mView).getContentWidth(), i2 - i4, i3 - i5);
        if (this.mContext != null) {
            this.mContext.f55897e.a(a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.lynx.tasm.behavior.ui.LynxBaseUI r6, boolean r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.UIScrollView.a(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }
}
