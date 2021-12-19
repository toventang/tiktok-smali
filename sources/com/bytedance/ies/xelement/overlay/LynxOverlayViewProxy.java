package com.bytedance.ies.xelement.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.d;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.w;
import java.util.List;

public final class LynxOverlayViewProxy extends UIGroup<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f37186d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f37187a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f37188b;

    /* renamed from: c  reason: collision with root package name */
    public int f37189c;

    /* renamed from: e  reason: collision with root package name */
    private final LynxOverlayView f37190e;

    static {
        Covode.recordClassIndex(22365);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22368);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final LynxUI<?> getTransitionUI() {
        return this.f37190e;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final int getChildCount() {
        return this.f37190e.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAnimationUpdated() {
        this.f37190e.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void onDetach() {
        this.f37190e.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        List<LynxBaseUI> children = this.f37190e.getChildren();
        l.a((Object) children, "");
        return children;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void layout() {
        super.layout();
        this.f37190e.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void measure() {
        super.measure();
        this.f37190e.measure();
    }

    static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f37191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxOverlayViewProxy f37192b;

        static {
            Covode.recordClassIndex(22369);
        }

        b(c cVar, LynxOverlayViewProxy lynxOverlayViewProxy) {
            this.f37191a = cVar;
            this.f37192b = lynxOverlayViewProxy;
        }

        public final void onGlobalLayout() {
            int[] iArr = new int[2];
            this.f37191a.getLocationOnScreen(iArr);
            if (this.f37191a.getWidth() != 0 && this.f37191a.getHeight() != 0) {
                if (iArr[0] >= this.f37192b.f37189c || iArr[0] <= 0 - this.f37191a.getWidth() || iArr[1] >= this.f37192b.f37188b || iArr[1] <= 0 - this.f37191a.getHeight()) {
                    this.f37192b.onDetach();
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(v vVar) {
        this.f37190e.afterPropsUpdated(vVar);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void insertView(LynxUI<?> lynxUI) {
        this.f37190e.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.f37190e.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        this.f37190e.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBackgroundColor(int i2) {
        this.f37190e.setBackgroundColor(i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.f37190e.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updatePropertiesInterval(v vVar) {
        this.f37190e.updatePropertiesInterval(vVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final LynxBaseUI getChildAt(int i2) {
        LynxBaseUI childAt = this.f37190e.getChildAt(i2);
        l.a((Object) childAt, "");
        return childAt;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(d dVar) {
        super.setParent(dVar);
        this.f37190e.setParent(dVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.f37190e.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        l.c(context, "");
        c cVar = new c(this, context, context);
        cVar.getViewTreeObserver().addOnGlobalLayoutListener(new b(cVar, this));
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxOverlayViewProxy(j jVar) {
        super(jVar);
        l.c(jVar, "");
        LynxOverlayView lynxOverlayView = new LynxOverlayView(jVar, this);
        this.f37190e = lynxOverlayView;
        super.insertChild(lynxOverlayView, 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context baseContext = jVar.getBaseContext();
        if (baseContext != null) {
            WindowManager windowManager = ((Activity) baseContext).getWindowManager();
            l.a((Object) windowManager, "");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f37188b = displayMetrics.heightPixels;
            this.f37189c = displayMetrics.widthPixels;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        this.f37190e.insertChild(lynxBaseUI, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        this.f37190e.insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i2, String str) {
        super.setSign(i2, str);
        this.f37190e.setSign(i2, str);
    }

    public static final class c extends com.lynx.tasm.behavior.ui.view.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxOverlayViewProxy f37193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f37194b;

        static {
            Covode.recordClassIndex(22370);
        }

        /* access modifiers changed from: protected */
        public final void onVisibilityChanged(View view, int i2) {
            l.c(view, "");
            if (i2 == 8) {
                this.f37193a.onDetach();
            } else if (this.f37193a.f37187a == 8) {
                this.f37193a.onAttach();
            }
            this.f37193a.f37187a = i2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LynxOverlayViewProxy lynxOverlayViewProxy, Context context, Context context2) {
            super(context2);
            this.f37193a = lynxOverlayViewProxy;
            this.f37194b = context;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateDrawingLayoutInfo(int i2, int i3, Rect rect) {
        l.c(rect, "");
        super.updateDrawingLayoutInfo(i2, i3, rect);
        this.f37190e.updateDrawingLayoutInfo(i2, i3, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLayoutData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Rect rect) {
        super.setLayoutData(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect);
        this.f37190e.setLayoutData(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        super.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
        this.f37190e.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}
