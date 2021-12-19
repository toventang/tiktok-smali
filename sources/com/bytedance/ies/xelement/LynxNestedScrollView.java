package com.bytedance.ies.xelement;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.a;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.c.h;
import java.util.Map;

public class LynxNestedScrollView extends AbsLynxUIScroll<a> implements a.AbstractC0888a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f36528a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36529b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36530c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36531d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36532e;

    static {
        Covode.recordClassIndex(21917);
    }

    @Override // com.bytedance.ies.xelement.a.AbstractC0888a
    public final void a(int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void scrollToIndex(int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setLowerThreshole(int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollLeft(int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollTop(int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setUpperThreshole(int i2) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getScrollX() {
        return ((a) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getScrollY() {
        return ((a) this.mView).getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void invalidate() {
        ((a) this.mView).getLinearLayout().invalidate();
    }

    private void a() {
        if (this.f36529b) {
            ((a) this.mView).setOrientation(1);
        } else {
            ((a) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i3 = this.mPaddingRight + this.mBorderRightWidth;
        ((a) this.mView).setPadding(i2, this.mPaddingTop + this.mBorderTopWidth, i3, this.mPaddingBottom + this.mBorderBottomWidth);
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
                width = Math.max(width, childAt.getWidth() + childAt.getLeft());
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop());
            }
        }
        a aVar = (a) this.mView;
        aVar.f36571i = height;
        aVar.f36570h = width;
        if (aVar.f36566d != null) {
            aVar.f36566d.requestLayout();
        }
        super.measure();
    }

    public LynxNestedScrollView(j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollTap(boolean z) {
        this.f36528a = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void b(boolean z) {
        this.f36529b = !z;
        a();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        a aVar = new a(context);
        aVar.setOnScrollListener(new a.AbstractC0888a() {
            /* class com.bytedance.ies.xelement.LynxNestedScrollView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(21920);
            }

            @Override // com.bytedance.ies.xelement.a.AbstractC0888a
            public final void a(int i2, int i3, int i4, int i5) {
            }

            @Override // com.bytedance.ies.xelement.a.AbstractC0888a
            public final void a(int i2) {
                if (!LynxNestedScrollView.this.f36528a) {
                    if (i2 != 0) {
                        LynxNestedScrollView.this.recognizeGesturere();
                    }
                } else if (i2 == 1) {
                    LynxNestedScrollView.this.recognizeGesturere();
                }
            }
        });
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollBarEnable(boolean z) {
        try {
            ((a) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e2) {
            LLog.a(6, "UIScrollView", e2.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f36530c = false;
            this.f36531d = false;
            this.f36532e = false;
            if (map.containsKey("scrolltolower")) {
                this.f36531d = true;
            }
            if (map.containsKey("scrolltoupper")) {
                this.f36530c = true;
            }
            if (map.containsKey("scroll")) {
                this.f36532e = true;
            }
            if (this.f36531d || this.f36530c || this.f36532e) {
                ((a) this.mView).setOnScrollListener(this);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void a(boolean z) {
        this.f36529b = z;
        a();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        lynxFlattenUI.b(canvas);
    }

    @Override // com.bytedance.ies.xelement.a.AbstractC0888a
    public final void a(int i2, int i3, int i4, int i5) {
        View childAt;
        if (this.f36532e) {
            a(i2, i3, i4, i5, "scroll");
        }
        if (i2 == i4 && i2 == 0) {
            if (i3 != 0) {
                View childAt2 = ((a) this.mView).getChildAt(0);
                if (childAt2 != null && childAt2.getMeasuredHeight() == getScrollY() + ((a) this.mView).getMeasuredHeight() && this.f36531d) {
                    a(0, i3, i4, i5, "scrolltolower");
                }
            } else if (this.f36530c) {
                a(0, 0, i4, i5, "scrolltoupper");
            }
        } else if (i3 != i5 || i3 != 0) {
        } else {
            if (i2 == 0 || (i2 > 0 && i4 == 0)) {
                if (this.f36530c) {
                    a(i2, 0, i4, i5, "scrolltoupper");
                }
            } else if (((a) this.mView).getHScrollView() != null && (childAt = ((a) this.mView).getHScrollView().getChildAt(0)) != null && i2 == childAt.getMeasuredWidth() - ((a) this.mView).getMeasuredWidth() && this.f36531d) {
                a(i2, 0, i4, i5, "scrolltolower");
            }
        }
    }

    private void a(int i2, int i3, int i4, int i5, String str) {
        h a2 = h.a(getSign(), str);
        a2.a(i2, i3, ((a) this.mView).getContentHeight(), ((a) this.mView).getContentWidth(), i4 - i2, i5 - i3);
        if (this.mContext != null) {
            this.mContext.f55897e.a(a2);
        }
    }
}
