package com.bytedance.ies.xelement.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.overlay.b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.d;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.w;
import java.util.List;

public final class LynxOverlayView extends UIGroup<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37175b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LynxOverlayViewProxy f37176a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37177c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37178d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f37179e = true;

    /* renamed from: f  reason: collision with root package name */
    private String f37180f;

    /* renamed from: g  reason: collision with root package name */
    private final a f37181g;

    /* renamed from: h  reason: collision with root package name */
    private b f37182h;

    static {
        Covode.recordClassIndex(22359);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -1952821320:
                    if (nextKey.equals("overlay-id")) {
                        setOverlayId(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1389050563:
                    if (nextKey.equals("events-pass-through")) {
                        setEventsPassThrough(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -939362323:
                    if (nextKey.equals("cut-out-mode")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setCutOutMode(z);
                        continue;
                    }
                    break;
                case -243354428:
                    if (nextKey.equals("status-bar-translucent")) {
                        setStatusBarTranslucent(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 466743410:
                    if (nextKey.equals("visible")) {
                        setVisible(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1860950378:
                    if (nextKey.equals("full-screen")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setFullScreen(z);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22363);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void onDetach() {
        super.onDetach();
        b();
    }

    public final boolean a() {
        if (!this.f37178d) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public final void requestLayout() {
        super.requestLayout();
        if (this.f37176a.getTransitionAnimator() != null || this.f37176a.enableLayoutAnimation()) {
            this.f37182h.invalidate();
        }
    }

    private final void b() {
        if (this.f37181g.isShowing()) {
            try {
                this.f37181g.dismiss();
                a("onDismissOverlay");
                b.a(this.f37180f);
            } catch (WindowManager.BadTokenException e2) {
                LLog.c("x-overlay", e2.toString());
            } catch (RuntimeException e3) {
                LLog.c("x-overlay", e3.toString());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void destroy() {
        if (this.f37181g.isShowing()) {
            try {
                this.f37181g.dismiss();
            } catch (WindowManager.BadTokenException e2) {
                LLog.c("x-overlay", e2.toString());
            } catch (RuntimeException e3) {
                LLog.c("x-overlay", e3.toString());
            }
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new com.lynx.tasm.behavior.ui.view.a(context);
    }

    @m(a = "overlay-id")
    public final void setOverlayId(String str) {
        l.c(str, "");
        this.f37180f = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(d dVar) {
        super.setParent(dVar);
        if (dVar == null) {
            b();
        }
    }

    @m(a = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        a aVar;
        Window window;
        WindowManager.LayoutParams attributes;
        if (z && (aVar = this.f37181g) != null && (window = aVar.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("currentOverlayId", this.f37180f);
        javaOnlyMap.put("overlays", b.a());
        javaOnlyArray.pushMap(javaOnlyMap);
        this.mContext.a(str, javaOnlyArray);
    }

    @m(a = "events-pass-through")
    public final void setEventsPassThrough(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null) {
            int i2 = c.f37204c[h2.ordinal()];
            if (i2 == 1) {
                String e2 = aVar.e();
                if (e2 == null) {
                    l.a();
                }
                this.f37179e = Boolean.parseBoolean(e2);
            } else if (i2 == 2) {
                this.f37179e = aVar.b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0 == null) goto L_0x001e;
     */
    @com.lynx.tasm.behavior.m(a = "full-screen")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setFullScreen(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0039
            r1 = 5894(0x1706, float:8.259E-42)
            com.bytedance.ies.xelement.overlay.a r0 = r2.f37181g
            if (r0 == 0) goto L_0x003a
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getSystemUiVisibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0021
        L_0x001e:
            h.f.b.l.a()
        L_0x0021:
            int r0 = r0.intValue()
            r1 = r1 | r0
            com.bytedance.ies.xelement.overlay.a r0 = r2.f37181g
            if (r0 == 0) goto L_0x0039
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0039
            r0.setSystemUiVisibility(r1)
        L_0x0039:
            return
        L_0x003a:
            r0 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.overlay.LynxOverlayView.setFullScreen(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    @com.lynx.tasm.behavior.m(a = "status-bar-translucent")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatusBarTranslucent(com.lynx.react.bridge.a r4) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.overlay.LynxOverlayView.setStatusBarTranslucent(com.lynx.react.bridge.a):void");
    }

    @m(a = "visible")
    public final void setVisible(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null) {
            int i2 = c.f37202a[h2.ordinal()];
            if (i2 == 1) {
                String e2 = aVar.e();
                if (e2 == null) {
                    l.a();
                }
                this.f37177c = Boolean.parseBoolean(e2);
            } else if (i2 == 2) {
                this.f37177c = aVar.b();
            }
        }
        if (this.f37177c) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            if (jVar.getBaseContext() instanceof Activity) {
                j jVar2 = this.mContext;
                l.a((Object) jVar2, "");
                Context baseContext = jVar2.getBaseContext();
                if (baseContext == null) {
                    throw new w("null cannot be cast to non-null type");
                } else if (!((Activity) baseContext).isFinishing()) {
                    try {
                        String str = this.f37180f;
                        a aVar2 = this.f37181g;
                        l.c(aVar2, "");
                        if (str == null) {
                            StringBuilder sb = new StringBuilder("default_overlay_id_");
                            int i3 = b.f37198b;
                            b.f37198b = i3 + 1;
                            str = sb.append(i3).toString();
                            l.a((Object) str, "");
                        }
                        b.f37197a.add(0, new b.a(str, aVar2));
                        this.f37180f = str;
                        this.f37181g.show();
                        a("onShowOverlay");
                    } catch (WindowManager.BadTokenException e3) {
                        LLog.c("x-overlay", e3.toString());
                    } catch (RuntimeException e4) {
                        LLog.c("x-overlay", e4.toString());
                    }
                }
            }
        } else {
            b();
        }
    }

    public static final class b extends com.lynx.tasm.behavior.ui.view.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxOverlayView f37184a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f37185b;

        static {
            Covode.recordClassIndex(22364);
        }

        @Override // com.lynx.tasm.behavior.ui.view.a
        public final void onMeasure(int i2, int i3) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            this.f37184a.measureChildren();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxOverlayView lynxOverlayView, j jVar, Context context) {
            super(context);
            this.f37184a = lynxOverlayView;
            this.f37185b = jVar;
        }

        @Override // com.lynx.tasm.behavior.ui.view.a
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            this.f37184a.layout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxOverlayView(j jVar, LynxOverlayViewProxy lynxOverlayViewProxy) {
        super(jVar);
        l.c(jVar, "");
        l.c(lynxOverlayViewProxy, "");
        this.f37176a = lynxOverlayViewProxy;
        a aVar = new a(jVar, this);
        this.f37181g = aVar;
        this.f37182h = new b(this, jVar, jVar);
        Window window = aVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        this.f37182h.addView(this.mView, -1, -1);
        aVar.setContentView(this.f37182h, new ViewGroup.LayoutParams(-1, -1));
        aVar.setOnKeyListener(new DialogInterface.OnKeyListener(this) {
            /* class com.bytedance.ies.xelement.overlay.LynxOverlayView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LynxOverlayView f37183a;

            static {
                Covode.recordClassIndex(22362);
            }

            {
                this.f37183a = r1;
            }

            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (i2 != 4) {
                    return false;
                }
                l.a((Object) keyEvent, "");
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                this.f37183a.a("onRequestClose");
                return true;
            }
        });
        this.f37182h.setClickable(true);
        this.f37182h.setFocusable(true);
        this.f37182h.setFocusableInTouchMode(true);
    }

    public final boolean a(float f2, float f3) {
        if (!this.f37177c) {
            return false;
        }
        if (!this.f37179e) {
            return true;
        }
        List<LynxBaseUI> list = this.mChildren;
        l.a((Object) list, "");
        for (LynxBaseUI lynxBaseUI : list) {
            int left = getLeft();
            l.a((Object) lynxBaseUI, "");
            if (((float) (left + lynxBaseUI.getLeft())) + lynxBaseUI.getTranslationX() < f2 && ((float) getLeft()) + ((float) lynxBaseUI.getLeft()) + lynxBaseUI.getTranslationX() + ((float) lynxBaseUI.getWidth()) > f2 && ((float) (getTop() + lynxBaseUI.getTop())) + lynxBaseUI.getTranslationY() < f3 && ((float) getTop()) + ((float) lynxBaseUI.getTop()) + lynxBaseUI.getTranslationY() + ((float) lynxBaseUI.getHeight()) > f3) {
                return true;
            }
        }
        return false;
    }
}
