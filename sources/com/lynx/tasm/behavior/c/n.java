package com.lynx.tasm.behavior.c;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.a.b.c;
import com.lynx.tasm.a.c.a;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

public final class n extends f {

    /* renamed from: a  reason: collision with root package name */
    private final int f55851a;

    /* renamed from: c  reason: collision with root package name */
    private final int f55852c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55853d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55854e;

    /* renamed from: f  reason: collision with root package name */
    private final int f55855f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55856g;

    /* renamed from: h  reason: collision with root package name */
    private final int f55857h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55858i;

    /* renamed from: j  reason: collision with root package name */
    private final int f55859j;

    /* renamed from: k  reason: collision with root package name */
    private final int f55860k;

    /* renamed from: l  reason: collision with root package name */
    private final int f55861l;

    /* renamed from: m  reason: collision with root package name */
    private final int f55862m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final Rect r;
    private final float[] s;
    private final float t;

    static {
        Covode.recordClassIndex(34921);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        LynxBaseUI lynxBaseUI;
        LynxUI lynxUI;
        LynxBaseUI lynxBaseUI2;
        int i2 = this.f55846b.f55847a;
        int i3 = this.f55851a;
        int i4 = this.f55852c;
        int i5 = this.f55853d;
        int i6 = this.f55854e;
        int i7 = this.f55855f;
        int i8 = this.f55857h;
        int i9 = this.f55856g;
        int i10 = this.f55858i;
        int i11 = this.n;
        int i12 = this.o;
        int i13 = this.p;
        int i14 = this.q;
        int i15 = this.f55860k;
        int i16 = this.f55859j;
        int i17 = this.f55861l;
        int i18 = this.f55862m;
        Rect rect = this.r;
        float[] fArr = this.s;
        float f2 = this.t;
        LynxBaseUI lynxBaseUI3 = qVar.f55935e.get(Integer.valueOf(i2));
        if (lynxBaseUI3 == null) {
            qVar.f55933c.a(new RuntimeException("can't find ui tag is:".concat(String.valueOf(i2))));
            return;
        }
        boolean z = lynxBaseUI3 instanceof UIShadowProxy;
        if (z) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI3).f56071a;
        } else {
            lynxBaseUI = lynxBaseUI3;
        }
        lynxBaseUI.updateLayoutSize(i5, i6);
        a transitionAnimator = lynxBaseUI3.getTransitionAnimator();
        String str = "UIOwner.updateLayout." + lynxBaseUI3.mTagName;
        TraceEvent.a(0, str);
        if (transitionAnimator != null && transitionAnimator.b() && !qVar.f55937g && !lynxBaseUI3.mIsFirstAnimatedReady) {
            transitionAnimator.a(lynxBaseUI3, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, rect);
            qVar.f55932b.invalidate();
        } else if (!lynxBaseUI3.enableLayoutAnimation() || qVar.f55937g || (i2 == qVar.f55931a && (i2 != qVar.f55931a || !qVar.f55938h))) {
            lynxBaseUI3.updateLayout(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, rect);
        } else {
            c layoutAnimator = lynxBaseUI3.getLayoutAnimator();
            if (z) {
                lynxUI = (LynxUI) ((UIShadowProxy) lynxBaseUI3).f56071a;
            } else {
                lynxUI = (LynxUI) lynxBaseUI3;
            }
            layoutAnimator.a(lynxUI, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, rect);
            qVar.f55932b.invalidate();
        }
        if (z) {
            lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI3).f56071a;
        } else {
            lynxBaseUI2 = lynxBaseUI3;
        }
        lynxBaseUI2.onAnimatedNodeReady();
        lynxBaseUI3.updateSticky(fArr);
        lynxBaseUI3.mMaxHeight = f2;
        TraceEvent.b(0, str);
    }

    public n(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Rect rect, float[] fArr, float f2) {
        super(i2, 5);
        this.f55851a = i3;
        this.f55852c = i4;
        this.f55853d = i5;
        this.f55854e = i6;
        this.f55855f = i7;
        this.f55856g = i9;
        this.f55858i = i10;
        this.f55857h = i8;
        this.n = i11;
        this.o = i12;
        this.p = i13;
        this.q = i14;
        this.f55859j = i16;
        this.f55862m = i18;
        this.f55860k = i15;
        this.f55861l = i17;
        this.r = rect;
        this.s = fArr;
        this.t = f2;
    }
}
