package com.lynx.tasm.behavior.ui.swiper;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.TTliveAudienceDeviceRatingLowSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.swiper.c;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.a;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.j;
import com.lynx.tasm.utils.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class XSwiperUI extends UISimpleView<b> {

    /* renamed from: a  reason: collision with root package name */
    static final int f56301a = Color.argb(255, 255, 255, 255);

    /* renamed from: b  reason: collision with root package name */
    static final int f56302b = Color.argb(89, 255, 255, 255);
    private float A = -1.0f;
    private int B = -1;
    private c.AbstractC1264c C = new c.AbstractC1264c() {
        /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass5 */

        static {
            Covode.recordClassIndex(35158);
        }

        @Override // com.lynx.tasm.behavior.ui.swiper.c.AbstractC1264c
        public final void a(View view) {
            view.setRotationY(0.0f);
        }

        @Override // com.lynx.tasm.behavior.ui.swiper.c.AbstractC1264c
        public final void a(View view, int i2) {
            float f2;
            int a2 = ((b) XSwiperUI.this.mView).f56329a.a();
            if (a2 != 0) {
                f2 = ((float) i2) / ((float) a2);
            } else {
                f2 = 0.0f;
            }
            float a3 = XSwiperUI.a(f2 * 9.0f, -9.0f, 9.0f);
            view.setCameraDistance(1280.0f);
            view.setRotationY(-a3);
        }
    };
    private c.AbstractC1264c D = new c.AbstractC1264c() {
        /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass6 */

        static {
            Covode.recordClassIndex(35159);
        }

        @Override // com.lynx.tasm.behavior.ui.swiper.c.AbstractC1264c
        public final void a(View view) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        @Override // com.lynx.tasm.behavior.ui.swiper.c.AbstractC1264c
        public final void a(View view, int i2) {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float abs = (float) Math.abs(i2);
            int a2 = ((b) XSwiperUI.this.mView).f56329a.a();
            if (a2 != 0) {
                float f8 = (float) a2;
                f2 = XSwiperUI.this.o - (((XSwiperUI.this.o - XSwiperUI.this.n) * abs) / f8);
                f3 = XSwiperUI.this.q - ((abs * (XSwiperUI.this.q - XSwiperUI.this.p)) / f8);
            } else {
                f2 = 1.0f;
                f3 = 1.0f;
            }
            float a3 = XSwiperUI.a(f2, XSwiperUI.this.n, XSwiperUI.this.o);
            float a4 = XSwiperUI.a(f3, XSwiperUI.this.p, XSwiperUI.this.q);
            view.setScaleX(a3);
            view.setScaleY(a4);
            if (XSwiperUI.this.r <= 0.0f) {
                return;
            }
            if (((b) XSwiperUI.this.mView).f56329a.d()) {
                float f9 = XSwiperUI.this.p + ((XSwiperUI.this.q - XSwiperUI.this.p) / 2.0f);
                float abs2 = 1.0f - (Math.abs(a4 - f9) / (XSwiperUI.this.q - f9));
                float f10 = ((XSwiperUI.this.r * ((float) a2)) * (XSwiperUI.this.q - XSwiperUI.this.p)) / 2.0f;
                if (i2 > 0) {
                    if (a4 <= f9) {
                        f7 = (-f10) + (abs2 * 0.5f * f10);
                    } else {
                        f6 = abs2 * -0.5f;
                        f7 = f6 * f10;
                    }
                } else if (a4 >= f9) {
                    f6 = abs2 * 0.5f;
                    f7 = f6 * f10;
                } else {
                    f7 = f10 - ((abs2 * 0.5f) * f10);
                }
                view.setTranslationY(f7);
                return;
            }
            float f11 = XSwiperUI.this.n + ((XSwiperUI.this.o - XSwiperUI.this.n) / 2.0f);
            float abs3 = 1.0f - (Math.abs(a3 - f11) / (XSwiperUI.this.o - f11));
            float f12 = ((XSwiperUI.this.r * ((float) a2)) * (XSwiperUI.this.o - XSwiperUI.this.n)) / 2.0f;
            if (i2 > 0) {
                if (a3 <= f11) {
                    f5 = (-f12) + (abs3 * 0.5f * f12);
                } else {
                    f4 = abs3 * -0.5f;
                    f5 = f4 * f12;
                }
            } else if (a3 >= f11) {
                f4 = abs3 * 0.5f;
                f5 = f4 * f12;
            } else {
                f5 = f12 - ((abs3 * 0.5f) * f12);
            }
            view.setTranslationX(f5);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public boolean f56303c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f56304d;

    /* renamed from: e  reason: collision with root package name */
    public int f56305e = 5000;

    /* renamed from: f  reason: collision with root package name */
    public boolean f56306f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f56307g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f56308h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f56309i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f56310j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f56311k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f56312l = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    public final List<View> f56313m = new ArrayList();
    public float n = 0.6f;
    public float o = 1.0f;
    public float p = 0.6f;
    public float q = 1.0f;
    public float r = 0.0f;
    public boolean s = false;
    public Runnable t = new Runnable() {
        /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass7 */

        static {
            Covode.recordClassIndex(35160);
        }

        public final void run() {
            if (XSwiperUI.this.f56308h && XSwiperUI.this.f56303c) {
                c cVar = ((b) XSwiperUI.this.mView).f56329a;
                int i2 = cVar.f56336a + 1;
                if (XSwiperUI.this.f56304d && i2 == XSwiperUI.this.f56313m.size()) {
                    i2 = 0;
                }
                cVar.a(i2, XSwiperUI.this.f56306f);
                XSwiperUI.this.f56312l.postDelayed(this, (long) XSwiperUI.this.f56305e);
            }
        }
    };
    private String u = "normal";
    private int v;
    private int w;
    private int x = -1;
    private int y = -1;
    private float z = -1.0f;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            double d2 = 0.0d;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            switch (nextKey.hashCode()) {
                case -1992012396:
                    if (nextKey.equals("duration")) {
                        int i3 = 500;
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 500);
                        }
                        setDuration(i3);
                        continue;
                    }
                    break;
                case -1880619844:
                    if (nextKey.equals("previous-margin-percent")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setPreviousMarginPercent(d2);
                        continue;
                    }
                    break;
                case -1811312718:
                    if (nextKey.equals("continuous-switch")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setContinuousSwitch(z2);
                        continue;
                    }
                    break;
                case -1612268224:
                    if (nextKey.equals("next-margin-percent")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setNextMarginPercent(d2);
                        continue;
                    }
                    break;
                case -1596393144:
                    if (nextKey.equals("indicator-dots")) {
                        if (!readableMap.isNull(nextKey)) {
                            z8 = readableMap.getBoolean(nextKey, false);
                        }
                        setIndicator(z8);
                        continue;
                    }
                    break;
                case -1498085729:
                    if (nextKey.equals("circular")) {
                        if (!readableMap.isNull(nextKey)) {
                            z7 = readableMap.getBoolean(nextKey, false);
                        }
                        setCircular(z7);
                        continue;
                    }
                    break;
                case -1439500848:
                    if (nextKey.equals("orientation")) {
                        setOrientation(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1363870918:
                    if (nextKey.equals("min-x-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMinXScale(d2);
                        continue;
                    }
                    break;
                case -1221689938:
                    if (nextKey.equals("new-event-order")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setNewEventOrder(z6);
                        continue;
                    }
                    break;
                case -1029251878:
                    if (nextKey.equals("indicator-active-color")) {
                        setIndicatorActiveColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -686438324:
                    if (nextKey.equals("max-x-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMaxXScale(d2);
                        continue;
                    }
                    break;
                case -476367237:
                    if (nextKey.equals("min-y-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMinYScale(d2);
                        continue;
                    }
                    break;
                case -111166008:
                    if (nextKey.equals("next-margin")) {
                        setNextMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 24002884:
                    if (nextKey.equals("previous-margin")) {
                        setPreviousMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 201065357:
                    if (nextKey.equals("max-y-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMaxYScale(d2);
                        continue;
                    }
                    break;
                case 364166425:
                    if (nextKey.equals("touchable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setTouchable(z5);
                        continue;
                    }
                    break;
                case 570418373:
                    if (nextKey.equals("interval")) {
                        int i4 = 5000;
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 5000);
                        }
                        setInterval(i4);
                        continue;
                    }
                    break;
                case 1090700700:
                    if (nextKey.equals("norm-translation-factor")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setNormalTranslationFactor(d2);
                        continue;
                    }
                    break;
                case 1126940025:
                    if (nextKey.equals("current")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setCurrentIndex(i2);
                        continue;
                    }
                    break;
                case 1127093697:
                    if (nextKey.equals("current-item-id")) {
                        setCurrentItemId(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z4);
                        continue;
                    }
                    break;
                case 1599847372:
                    if (nextKey.equals("smooth-scroll")) {
                        boolean z9 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z9 = readableMap.getBoolean(nextKey, true);
                        }
                        setSmoothScroll(z9);
                        continue;
                    }
                    break;
                case 1665556140:
                    if (nextKey.equals("page-margin")) {
                        setPageMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1696908181:
                    if (nextKey.equals("finish-reset")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setFinishReset(z3);
                        continue;
                    }
                    break;
                case 2050488869:
                    if (nextKey.equals("indicator-color")) {
                        setIndicatorColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void destroy() {
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void onDetach() {
        super.onDetach();
    }

    static {
        Covode.recordClassIndex(35151);
    }

    private void a() {
        ((b) this.mView).f56329a.a(new a() {
            /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass4 */

            static {
                Covode.recordClassIndex(35157);
            }

            @Override // com.lynx.tasm.behavior.ui.swiper.a
            public final int a() {
                return XSwiperUI.this.f56313m.size();
            }

            @Override // com.lynx.tasm.behavior.ui.swiper.a
            public final View a(int i2) {
                return XSwiperUI.this.f56313m.get(i2);
            }
        });
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f56313m.clear();
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            this.f56313m.add(((LynxUI) lynxBaseUI).mView);
        }
        a();
        setMode(this.u);
        ((b) this.mView).a(isRtl());
        if (getOverflow() != 0) {
            ((b) this.mView).setClipChildren(false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChildV2(LynxBaseUI lynxBaseUI) {
        removeChild(lynxBaseUI);
    }

    @m(a = "finish-reset", f = false)
    public void setFinishReset(boolean z2) {
        this.f56304d = z2;
    }

    @m(a = "interval", e = 5000)
    public void setInterval(int i2) {
        this.f56305e = i2;
    }

    @m(a = "max-x-scale")
    public void setMaxXScale(double d2) {
        this.o = (float) d2;
    }

    @m(a = "max-y-scale")
    public void setMaxYScale(double d2) {
        this.q = (float) d2;
    }

    @m(a = "min-x-scale")
    public void setMinXScale(double d2) {
        this.n = (float) d2;
    }

    @m(a = "min-y-scale")
    public void setMinYScale(double d2) {
        this.p = (float) d2;
    }

    @m(a = "circular", f = false)
    public void setCircular(boolean z2) {
        ((b) this.mView).f56329a.f56340e = z2;
    }

    @m(a = "continuous-switch", f = false)
    public void setContinuousSwitch(boolean z2) {
        ((b) this.mView).f56329a.v = z2;
    }

    @m(a = "indicator-dots", f = false)
    public void setIndicator(boolean z2) {
        int i2;
        LinearLayout linearLayout = ((b) this.mView).f56330b;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    @m(a = "new-event-order", f = false)
    public void setNewEventOrder(boolean z2) {
        this.s = z2;
        ((b) this.mView).f56329a.r = z2;
    }

    @m(a = "touchable", f = false)
    public void setTouchable(boolean z2) {
        ((b) this.mView).f56329a.o = z2;
    }

    @m(a = "autoplay", f = false)
    public void setAutoPlay(boolean z2) {
        this.f56303c = z2;
        ((b) this.mView).f56329a.u = z2;
        this.f56312l.removeCallbacks(this.t);
        if (this.f56303c) {
            this.f56312l.postDelayed(this.t, (long) this.f56305e);
        }
    }

    @m(a = "current-item-id")
    public void setCurrentItemId(final String str) {
        if (str != null) {
            final c cVar = ((b) this.mView).f56329a;
            if (cVar.getChildCount() <= 0) {
                cVar.post(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(35162);
                    }

                    public final void run() {
                        XSwiperUI.this.a(str);
                    }
                });
            } else {
                a(str);
            }
        }
    }

    @m(a = "duration", e = 500)
    public void setDuration(int i2) {
        this.v = i2;
        if (this.f56306f) {
            ((b) this.mView).f56329a.f56338c = i2;
        } else {
            ((b) this.mView).f56329a.f56338c = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLynxDirection(int i2) {
        super.setLynxDirection(i2);
        if (i2 == 2 || i2 == 2) {
            ((b) this.mView).a(true);
        } else {
            ((b) this.mView).a(false);
        }
        setMode(this.u);
    }

    @m(a = "next-margin-percent", d = TTliveAudienceDeviceRatingLowSetting.DEFAULT)
    public void setNextMarginPercent(double d2) {
        if (d2 <= 1.0d && d2 >= 0.0d) {
            this.A = (float) d2;
            setMode(this.u);
        }
    }

    @m(a = "norm-translation-factor", d = 0.0f)
    public void setNormalTranslationFactor(double d2) {
        if (d2 <= 1.0d && d2 >= -1.0d) {
            this.r = (float) d2;
            setMode(this.u);
        }
    }

    @m(a = "previous-margin-percent", d = TTliveAudienceDeviceRatingLowSetting.DEFAULT)
    public void setPreviousMarginPercent(double d2) {
        if (d2 <= 1.0d && d2 >= 0.0d) {
            this.z = (float) d2;
            setMode(this.u);
        }
    }

    @m(a = "smooth-scroll", f = true)
    public void setSmoothScroll(boolean z2) {
        this.f56306f = z2;
        if (z2) {
            ((b) this.mView).f56329a.f56338c = this.v;
            return;
        }
        ((b) this.mView).f56329a.f56338c = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        final b bVar = new b(context);
        bVar.f56329a.f56345j = new c.b() {
            /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35154);
            }

            @Override // com.lynx.tasm.behavior.ui.swiper.c.b
            public final void a(int i2) {
                ((b) XSwiperUI.this.mView).b(i2);
                if (!XSwiperUI.this.f56307g) {
                    return;
                }
                if (!XSwiperUI.this.s || !bVar.f56329a.f56337b) {
                    com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(XSwiperUI.this.getSign(), "change");
                    cVar.a("current", Integer.valueOf(i2));
                    XSwiperUI.this.mContext.f55897e.a(cVar);
                }
            }
        };
        c cVar = bVar.f56329a;
        cVar.f56347l.add(new c.d() {
            /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            boolean f56316b;

            static {
                Covode.recordClassIndex(35155);
            }

            /* access modifiers changed from: package-private */
            @Override // com.lynx.tasm.behavior.ui.swiper.c.d
            public final void b() {
                this.f56316b = false;
                if (!XSwiperUI.this.f56310j) {
                    return;
                }
                if (!XSwiperUI.this.s || !bVar.f56329a.f56337b) {
                    com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(XSwiperUI.this.getSign(), "scrollend");
                    cVar.a("current", Integer.valueOf(bVar.f56329a.f56336a));
                    XSwiperUI.this.mContext.f55897e.a(cVar);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.lynx.tasm.behavior.ui.swiper.c.d
            public final void b(float f2, float f3) {
                this.f56316b = true;
                if (!XSwiperUI.this.f56309i) {
                    return;
                }
                if (!XSwiperUI.this.s || !bVar.f56329a.f56337b) {
                    com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(XSwiperUI.this.getSign(), "scrollstart");
                    cVar.a("current", Integer.valueOf(bVar.f56329a.f56336a));
                    cVar.a("dx", Float.valueOf(j.c(f2)));
                    cVar.a("dy", Float.valueOf(j.c(f3)));
                    XSwiperUI.this.mContext.f55897e.a(cVar);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.lynx.tasm.behavior.ui.swiper.c.d
            public final void c(float f2, float f3) {
                if (this.f56316b) {
                    XSwiperUI.this.recognizeGesturere();
                    if (!XSwiperUI.this.f56311k) {
                        return;
                    }
                    if (!XSwiperUI.this.s || !bVar.f56329a.f56337b) {
                        com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(XSwiperUI.this.getSign(), "transition");
                        cVar.a("current", Integer.valueOf(bVar.f56329a.f56336a));
                        cVar.a("dx", Float.valueOf(j.c(f2)));
                        cVar.a("dy", Float.valueOf(j.c(f3)));
                        XSwiperUI.this.mContext.f55897e.a(cVar);
                    }
                }
            }
        });
        bVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35156);
            }

            public final void onViewDetachedFromWindow(View view) {
                XSwiperUI.this.f56308h = false;
                XSwiperUI.this.f56312l.removeCallbacks(XSwiperUI.this.t);
            }

            public final void onViewAttachedToWindow(View view) {
                XSwiperUI.this.f56308h = true;
                if (XSwiperUI.this.f56303c) {
                    XSwiperUI.this.f56312l.removeCallbacks(XSwiperUI.this.t);
                    XSwiperUI.this.f56312l.postDelayed(XSwiperUI.this.t, (long) XSwiperUI.this.f56305e);
                }
            }
        });
        return bVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        MethodCollector.i(13475);
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            this.f56313m.remove(((LynxUI) lynxBaseUI).mView);
            a();
            b bVar = (b) this.mView;
            bVar.f56330b.removeViewAt(0);
            bVar.b(bVar.f56334f);
        }
        MethodCollector.o(13475);
    }

    @m(a = "current", e = 0)
    public void setCurrentIndex(final int i2) {
        c cVar = ((b) this.mView).f56329a;
        int i3 = cVar.f56336a;
        if (cVar.getChildCount() <= 0 || (this.s && i3 != this.B)) {
            cVar.post(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.swiper.XSwiperUI.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(35161);
                }

                public final void run() {
                    XSwiperUI xSwiperUI = XSwiperUI.this;
                    xSwiperUI.a(i2, xSwiperUI.f56306f);
                }
            });
        } else {
            a(i2, this.f56306f);
        }
        this.B = i2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f56307g = map.containsKey("change");
            this.f56309i = map.containsKey("scrollstart");
            this.f56310j = map.containsKey("scrollend");
            this.f56311k = map.containsKey("transition");
        }
    }

    @m(a = "indicator-active-color")
    public void setIndicatorActiveColor(String str) {
        int i2;
        try {
            i2 = ColorUtils.a(str);
        } catch (Exception unused) {
            i2 = f56301a;
        }
        b bVar = (b) this.mView;
        bVar.f56332d = i2;
        for (int childCount = bVar.f56330b.getChildCount() - 1; childCount >= 0; childCount--) {
            if (childCount == bVar.f56334f) {
                bVar.f56330b.getChildAt(childCount).setBackground(b.a(bVar.f56332d));
                return;
            }
        }
    }

    @m(a = "indicator-color")
    public void setIndicatorColor(String str) {
        int i2;
        try {
            i2 = ColorUtils.a(str);
        } catch (Exception unused) {
            i2 = f56302b;
        }
        b bVar = (b) this.mView;
        bVar.f56333e = i2;
        for (int childCount = bVar.f56330b.getChildCount() - 1; childCount >= 0; childCount--) {
            if (childCount != bVar.f56334f) {
                bVar.f56330b.getChildAt(childCount).setBackground(b.a(bVar.f56333e));
            }
        }
    }

    @m(a = "next-margin")
    public void setNextMargin(com.lynx.react.bridge.a aVar) {
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            if (e2.endsWith("px") || e2.endsWith("rpx")) {
                int b2 = (int) n.b(e2, -1.0f);
                if (b2 >= 0) {
                    this.y = b2;
                } else {
                    this.y = -1;
                }
                setMode(this.u);
            }
        }
    }

    @m(a = "orientation")
    public void setOrientation(String str) {
        if ("vertical".equals(str)) {
            ((b) this.mView).c(1);
        } else if ("horizontal".equals(str)) {
            ((b) this.mView).c(0);
        }
    }

    @m(a = "previous-margin")
    public void setPreviousMargin(com.lynx.react.bridge.a aVar) {
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            if (e2.endsWith("px") || e2.endsWith("rpx")) {
                int b2 = (int) n.b(e2, -1.0f);
                if (b2 >= 0) {
                    this.x = b2;
                } else {
                    this.x = -1;
                }
                setMode(this.u);
            }
        }
    }

    public XSwiperUI(com.lynx.tasm.behavior.j jVar) {
        super(jVar);
    }

    private boolean a(c cVar) {
        int width;
        if (cVar.d()) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        float f2 = this.z;
        if (f2 > 0.0f) {
            this.x = (int) (((float) width) * f2);
        }
        float f3 = this.A;
        if (f3 > 0.0f) {
            this.y = (int) (((float) width) * f3);
        }
        int i2 = this.x;
        int i3 = this.y;
        int i4 = this.w;
        int i5 = (((width - i2) - i3) - i4) - i4;
        if (i2 < 0 || i3 < 0 || i5 <= 0) {
            return true;
        }
        int i6 = i2 + i4;
        if (isRtl()) {
            cVar.b(-i6);
        } else {
            cVar.b(i6);
        }
        cVar.a(i5);
        return false;
    }

    @m(a = "page-margin")
    public void setPageMargin(com.lynx.react.bridge.a aVar) {
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            if (e2.endsWith("px") || e2.endsWith("rpx")) {
                int b2 = (int) n.b(e2, 10.0f);
                int i2 = 0;
                if (b2 > 0) {
                    this.w = b2;
                } else {
                    this.w = 0;
                }
                c cVar = ((b) this.mView).f56329a;
                int i3 = this.w;
                if (i3 >= 0) {
                    i2 = i3;
                }
                cVar.f56341f = i2;
                cVar.a(cVar.f56346k);
                setMode(this.u);
            }
        }
    }

    public final void a(String str) {
        for (int i2 = 0; i2 < this.mChildren.size(); i2++) {
            if (str.equals(((LynxBaseUI) this.mChildren.get(i2)).mName)) {
                a(i2, this.f56306f);
                return;
            }
        }
    }

    @m(a = "mode")
    public void setMode(String str) {
        int width;
        char c2;
        c cVar = ((b) this.mView).f56329a;
        if (cVar.d()) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1039745817:
                if (str.equals("normal")) {
                    c2 = 0;
                    break;
                } else {
                    return;
                }
            case 2908512:
                if (str.equals("carousel")) {
                    c2 = 1;
                    break;
                } else {
                    return;
                }
            case 94431515:
                if (str.equals("carry")) {
                    c2 = 2;
                    break;
                } else {
                    return;
                }
            case 1720139793:
                if (str.equals("flat-coverflow")) {
                    c2 = 3;
                    break;
                } else {
                    return;
                }
            case 1980277093:
                if (str.equals("coverflow")) {
                    c2 = 4;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        switch (c2) {
            case 0:
                this.u = "normal";
                cVar.a((c.AbstractC1264c) null);
                cVar.b(0);
                cVar.a(1.0f);
                return;
            case 1:
                this.u = "carousel";
                cVar.a((c.AbstractC1264c) null);
                cVar.b(0);
                cVar.a(0.8f);
                return;
            case 2:
                this.u = "carry";
                cVar.a(this.D);
                if (a(cVar)) {
                    cVar.b(0);
                    cVar.a(1.0f);
                    return;
                }
                return;
            case 3:
                this.u = "flat-coverflow";
                cVar.a((c.AbstractC1264c) null);
                if (a(cVar)) {
                    int i2 = (int) ((((float) width) * 0.4f) / 2.0f);
                    if (isRtl()) {
                        cVar.b(-i2);
                    } else {
                        cVar.b(i2);
                    }
                    cVar.a(0.6f);
                    return;
                }
                return;
            case 4:
                this.u = "coverflow";
                cVar.a(this.C);
                if (a(cVar)) {
                    int i3 = (int) ((((float) width) * 0.4f) / 2.0f);
                    if (isRtl()) {
                        cVar.b(-i3);
                    } else {
                        cVar.b(i3);
                    }
                    cVar.a(0.6f);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateAttributes(v vVar) {
        super.updateAttributes(vVar);
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (nextKey.hashCode()) {
                    case -1992012396:
                        if (!nextKey.equals("duration")) {
                            break;
                        } else {
                            setDuration(readableMap.getInt(nextKey));
                            break;
                        }
                    case -1811312718:
                        if (!nextKey.equals("continuous-switch")) {
                            break;
                        } else {
                            setContinuousSwitch(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case -1596393144:
                        if (!nextKey.equals("indicator-dots")) {
                            break;
                        } else {
                            setIndicator(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case -1498085729:
                        if (!nextKey.equals("circular")) {
                            break;
                        } else {
                            setCircular(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case -1439500848:
                        if (!nextKey.equals("orientation")) {
                            break;
                        } else {
                            setOrientation(readableMap.getString(nextKey));
                            break;
                        }
                    case -1221689938:
                        if (!nextKey.equals("new-event-order")) {
                            break;
                        } else {
                            setNewEventOrder(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case -1029251878:
                        if (!nextKey.equals("indicator-active-color")) {
                            break;
                        } else {
                            setIndicatorActiveColor(readableMap.getString(nextKey));
                            break;
                        }
                    case -111166008:
                        if (!nextKey.equals("next-margin")) {
                            break;
                        } else {
                            setNextMargin(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case 3357091:
                        if (!nextKey.equals("mode")) {
                            break;
                        } else {
                            setMode(readableMap.getString(nextKey));
                            break;
                        }
                    case 24002884:
                        if (!nextKey.equals("previous-margin")) {
                            break;
                        } else {
                            setPreviousMargin(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case 364166425:
                        if (!nextKey.equals("touchable")) {
                            break;
                        } else {
                            setTouchable(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case 570418373:
                        if (!nextKey.equals("interval")) {
                            break;
                        } else {
                            setInterval(readableMap.getInt(nextKey));
                            break;
                        }
                    case 1090700700:
                        if (!nextKey.equals("norm-translation-factor")) {
                            break;
                        } else {
                            setNormalTranslationFactor(readableMap.getDouble(nextKey));
                            break;
                        }
                    case 1126940025:
                        if (!nextKey.equals("current")) {
                            break;
                        } else {
                            setCurrentIndex(readableMap.getInt(nextKey));
                            break;
                        }
                    case 1127093697:
                        if (!nextKey.equals("current-item-id")) {
                            break;
                        } else {
                            setCurrentItemId(readableMap.getString(nextKey));
                            break;
                        }
                    case 1439562083:
                        if (!nextKey.equals("autoplay")) {
                            break;
                        } else {
                            setAutoPlay(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case 1599847372:
                        if (!nextKey.equals("smooth-scroll")) {
                            break;
                        } else {
                            setSmoothScroll(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case 1665556140:
                        if (!nextKey.equals("page-margin")) {
                            break;
                        } else {
                            setPageMargin(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case 1696908181:
                        if (!nextKey.equals("finish-reset")) {
                            break;
                        } else {
                            setFinishReset(readableMap.getBoolean(nextKey));
                            break;
                        }
                    case 2050488869:
                        if (!nextKey.equals("indicator-color")) {
                            break;
                        } else {
                            setIndicatorColor(readableMap.getString(nextKey));
                            break;
                        }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e2.toString());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChildV2(LynxBaseUI lynxBaseUI, int i2) {
        insertChild(lynxBaseUI, i2);
    }

    public final void a(int i2, boolean z2) {
        c cVar = ((b) this.mView).f56329a;
        if (i2 >= 0 && i2 < cVar.f56348m) {
            cVar.a(i2, z2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        MethodCollector.i(13473);
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i2, lynxBaseUI);
            lynxBaseUI.setParent(this);
            this.f56313m.add(i2, ((LynxUI) lynxBaseUI).mView);
            a();
            b bVar = (b) this.mView;
            View view = new View(bVar.getContext());
            view.setClickable(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bVar.f56331c, bVar.f56331c);
            if (bVar.f56335g == 1) {
                int i3 = bVar.f56331c / 2;
                layoutParams.bottomMargin = i3;
                layoutParams.topMargin = i3;
            } else {
                int i4 = bVar.f56331c / 2;
                layoutParams.rightMargin = i4;
                layoutParams.leftMargin = i4;
            }
            bVar.f56330b.addView(view, layoutParams);
            if (bVar.f56330b.getChildCount() == bVar.f56332d) {
                view.setBackground(b.a(bVar.f56332d));
                MethodCollector.o(13473);
                return;
            }
            view.setBackground(b.a(bVar.f56333e));
        }
        MethodCollector.o(13473);
    }

    public static float a(float f2, float f3, float f4) {
        return Math.min(f4, Math.max(f3, f2));
    }
}
