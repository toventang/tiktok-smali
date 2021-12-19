package com.bytedance.tux.sheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.sheet.sheet.TuxSheetHandle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class TuxSheetContainer extends RelativeLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f45212c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f45213a;

    /* renamed from: b  reason: collision with root package name */
    public TuxSheetHandle f45214b;

    /* renamed from: d  reason: collision with root package name */
    private int f45215d;

    /* renamed from: e  reason: collision with root package name */
    private int f45216e;

    /* renamed from: f  reason: collision with root package name */
    private int f45217f;

    /* renamed from: g  reason: collision with root package name */
    private int f45218g;

    /* renamed from: h  reason: collision with root package name */
    private h.f.a.a<z> f45219h;

    /* renamed from: i  reason: collision with root package name */
    private BottomSheetBehavior.a f45220i;

    /* renamed from: j  reason: collision with root package name */
    private final h f45221j;

    /* renamed from: k  reason: collision with root package name */
    private BottomSheetBehavior<?> f45222k;

    static {
        Covode.recordClassIndex(27555);
    }

    public TuxSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final int getMinHeightPx() {
        return ((Number) this.f45221j.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27556);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.f45222k;
    }

    public final BottomSheetBehavior.a getBottomSheetCallback() {
        return this.f45220i;
    }

    public final h.f.a.a<z> getDismissFunc() {
        return this.f45219h;
    }

    public final int getDynamicMaxHeightPx() {
        return this.f45218g;
    }

    public final int getDynamicPeekHeightPx() {
        return this.f45217f;
    }

    public final int getFixedHeightPx() {
        return this.f45216e;
    }

    public final int getVariant() {
        return this.f45215d;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f45214b = (TuxSheetHandle) findViewById(R.id.e2o);
    }

    static final class b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ TuxSheetContainer this$0;

        static {
            Covode.recordClassIndex(27557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TuxSheetContainer tuxSheetContainer) {
            super(0);
            this.this$0 = tuxSheetContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.a0l));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            int r2 = r5.f45215d
            r1 = 0
            r0 = 2
            if (r2 == r0) goto L_0x000c
            r0 = 3
            if (r2 != r0) goto L_0x005f
        L_0x000c:
            r4 = 1
        L_0x000d:
            com.bytedance.tux.sheet.sheet.TuxSheetHandle r0 = r5.f45214b
            if (r0 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x005c
        L_0x0013:
            r0.setVisibility(r1)
        L_0x0016:
            r3 = r5
        L_0x0017:
            r2 = 0
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 == 0) goto L_0x0052
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r5.f45222k
            if (r0 != 0) goto L_0x003c
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.a(r3)
        L_0x0028:
            r5.f45222k = r1
            if (r1 == 0) goto L_0x0033
            com.bytedance.tux.sheet.TuxSheetContainer$c r0 = new com.bytedance.tux.sheet.TuxSheetContainer$c
            r0.<init>(r5, r4)
            r1.o = r0
        L_0x0033:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r5.f45222k
            if (r1 == 0) goto L_0x003b
            boolean r0 = r5.f45213a
            r1.f52332h = r0
        L_0x003b:
            return
        L_0x003c:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.e
            if (r0 != 0) goto L_0x0050
        L_0x0044:
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r2
            if (r2 == 0) goto L_0x004d
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r5.f45222k
            r2.a(r0)
        L_0x004d:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r5.f45222k
            goto L_0x0028
        L_0x0050:
            r2 = r1
            goto L_0x0044
        L_0x0052:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x005b
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            if (r3 != 0) goto L_0x0017
        L_0x005b:
            return
        L_0x005c:
            r1 = 8
            goto L_0x0013
        L_0x005f:
            r4 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.TuxSheetContainer.onAttachedToWindow():void");
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.f45222k = bottomSheetBehavior;
    }

    public final void setBottomSheetCallback(BottomSheetBehavior.a aVar) {
        this.f45220i = aVar;
    }

    public final void setDismissFunc(h.f.a.a<z> aVar) {
        this.f45219h = aVar;
    }

    public final void setDynamicMaxHeightPx(int i2) {
        this.f45218g = i2;
    }

    public final void setDynamicPeekHeightPx(int i2) {
        this.f45217f = i2;
    }

    public final void setFixedHeightPx(int i2) {
        this.f45216e = i2;
    }

    public final void setHideable(boolean z) {
        this.f45213a = z;
    }

    public final void setVariant(int i2) {
        this.f45215d = i2;
    }

    public final void setHideable$tux_release(boolean z) {
        this.f45213a = z;
        BottomSheetBehavior<?> bottomSheetBehavior = this.f45222k;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f52332h = z;
        }
    }

    public static final class c extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxSheetContainer f45223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f45224b;

        static {
            Covode.recordClassIndex(27558);
        }

        c(TuxSheetContainer tuxSheetContainer, boolean z) {
            this.f45223a = tuxSheetContainer;
            this.f45224b = z;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            TuxSheetHandle tuxSheetHandle;
            BottomSheetBehavior.a bottomSheetCallback;
            l.c(view, "");
            if (!(!this.f45224b || (tuxSheetHandle = this.f45223a.f45214b) == null || (bottomSheetCallback = tuxSheetHandle.getBottomSheetCallback()) == null)) {
                bottomSheetCallback.a(view, f2);
            }
            BottomSheetBehavior.a bottomSheetCallback2 = this.f45223a.getBottomSheetCallback();
            if (bottomSheetCallback2 != null) {
                bottomSheetCallback2.a(view, f2);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            h.f.a.a<z> dismissFunc;
            TuxSheetHandle tuxSheetHandle;
            int i3;
            BottomSheetBehavior.a bottomSheetCallback;
            l.c(view, "");
            if (this.f45224b) {
                TuxSheetHandle tuxSheetHandle2 = this.f45223a.f45214b;
                if (!(tuxSheetHandle2 == null || (bottomSheetCallback = tuxSheetHandle2.getBottomSheetCallback()) == null)) {
                    bottomSheetCallback.a(view, i2);
                }
                if (this.f45223a.getVariant() == 3 && (tuxSheetHandle = this.f45223a.f45214b) != null) {
                    if (i2 == 3) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    tuxSheetHandle.setVisibility(i3);
                }
            }
            if (i2 == 5 && (dismissFunc = this.f45223a.getDismissFunc()) != null) {
                dismissFunc.invoke();
            }
            BottomSheetBehavior.a bottomSheetCallback2 = this.f45223a.getBottomSheetCallback();
            if (bottomSheetCallback2 != null) {
                bottomSheetCallback2.a(view, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r1 > 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.TuxSheetContainer.onMeasure(int, int):void");
    }

    private /* synthetic */ TuxSheetContainer(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSheetContainer(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(8702);
        this.f45213a = true;
        this.f45216e = -1;
        this.f45217f = -1;
        this.f45218g = -1;
        this.f45221j = i.a((h.f.a.a) new b(this));
        MethodCollector.o(8702);
    }
}
