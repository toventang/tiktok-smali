package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.n;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Map;

public class LynxSwiperView extends UISimpleView<a> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36710f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f36711a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36712b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36713c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36714d;

    /* renamed from: e  reason: collision with root package name */
    public int f36715e;

    static {
        Covode.recordClassIndex(22049);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            int i2 = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
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
                case -1597449863:
                    if (nextKey.equals("start-margin")) {
                        setStartMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -1596393144:
                    if (nextKey.equals("indicator-dots")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setIndicator(z2);
                        continue;
                    }
                    break;
                case -1498085729:
                    if (nextKey.equals("circular")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setCircular(z6);
                        continue;
                    }
                    break;
                case -1235498272:
                    if (nextKey.equals("end-margin")) {
                        setEndMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -1029251878:
                    if (nextKey.equals("indicator-active-color")) {
                        setIndicatorActiveColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -313198140:
                    if (nextKey.equals("hardware_texture")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setRenderHardwareTexture(z5);
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
                case 364166425:
                    if (nextKey.equals("touchable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setTouchable(z4);
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
                case 914875020:
                    if (nextKey.equals("item-width")) {
                        setItemWidth(readableMap.getDynamic(nextKey));
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
                case 1255595234:
                    if (nextKey.equals("hideshadow")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setHideShadow(z);
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1599847372:
                    if (nextKey.equals("smooth-scroll")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setSmoothScroll(z);
                        continue;
                    }
                    break;
                case 1616798838:
                    if (nextKey.equals("shadow-color")) {
                        setShadowColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1665556140:
                    if (nextKey.equals("page-margin")) {
                        setPageMargin(readableMap.getDynamic(nextKey));
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

    public static final class a {
        static {
            Covode.recordClassIndex(22052);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i3 = this.mPaddingRight + this.mBorderRightWidth;
        ((a) this.mView).setPadding(i2, this.mPaddingTop + this.mBorderTopWidth, i3, this.mPaddingBottom + this.mBorderBottomWidth);
        ((a) this.mView).m(getWidth());
        ((a) this.mView).a();
    }

    public static final class b implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxSwiperView f36716a;

        static {
            Covode.recordClassIndex(22053);
        }

        b(LynxSwiperView lynxSwiperView) {
            this.f36716a = lynxSwiperView;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f36716a.f36715e = i2;
            if (this.f36716a.f36711a) {
                j jVar = this.f36716a.mContext;
                l.a((Object) jVar, "");
                c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f36716a.getSign(), "change");
                cVar2.a("current", Integer.valueOf(i2));
                cVar.a(cVar2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            if (i2 != 0) {
                this.f36716a.recognizeGesturere();
            }
            if (this.f36716a.f36713c && i2 == 1) {
                j jVar = this.f36716a.mContext;
                l.a((Object) jVar, "");
                c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f36716a.getSign(), "scrollstart");
                cVar2.a("current", Integer.valueOf(this.f36716a.f36715e));
                cVar.a(cVar2);
            }
            if (this.f36716a.f36714d && i2 == 0) {
                j jVar2 = this.f36716a.mContext;
                l.a((Object) jVar2, "");
                c cVar3 = jVar2.f55897e;
                com.lynx.tasm.c.c cVar4 = new com.lynx.tasm.c.c(this.f36716a.getSign(), "scrollend");
                cVar4.a("current", Integer.valueOf(this.f36716a.f36715e));
                cVar3.a(cVar4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (this.f36716a.f36712b) {
                j jVar = this.f36716a.mContext;
                l.a((Object) jVar, "");
                c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f36716a.getSign(), "transition");
                cVar2.a("current", Integer.valueOf(i2));
                cVar2.a("positionOffset", Float.valueOf(f2));
                cVar2.a("dx", Float.valueOf(com.lynx.tasm.utils.j.c((float) i3)));
                cVar.a(cVar2);
            }
        }
    }

    @m(a = "autoplay", f = false)
    public final void setAutoPlay(boolean z) {
        ((a) this.mView).c(z);
    }

    @m(a = "circular", f = false)
    public final void setCircular(boolean z) {
        ((a) this.mView).a(z);
    }

    @m(a = "current", e = 0)
    public final void setCurrentIndex(int i2) {
        ((a) this.mView).d(i2);
    }

    @m(a = "duration", e = 500)
    public final void setDuration(int i2) {
        ((a) this.mView).e(i2);
    }

    @m(a = "hideshadow", f = true)
    public final void setHideShadow(boolean z) {
        ((a) this.mView).b(z);
    }

    @m(a = "indicator-dots", f = false)
    public final void setIndicator(boolean z) {
        ((a) this.mView).d(z);
    }

    @m(a = "interval", e = 5000)
    public final void setInterval(int i2) {
        ((a) this.mView).f(i2);
    }

    @m(a = "smooth-scroll", f = true)
    public final void setSmoothScroll(boolean z) {
        ((a) this.mView).f(z);
    }

    @m(a = "touchable", f = false)
    public final void setTouchable(boolean z) {
        ((a) this.mView).e(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxSwiperView(Context context) {
        super(context);
        l.c(context, "");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChildV2(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        removeChild(lynxBaseUI);
    }

    @m(a = "mode")
    public final void setMode(String str) {
        l.c(str, "");
        ((a) this.mView).a(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOverflow(int i2) {
        super.setOverflow(i2);
        ((a) this.mView).setOverflow(i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        l.c(context, "");
        a aVar = new a(context);
        aVar.setTwoItemCircularSwipe(false);
        aVar.setOnPageChangeListener(new b(this));
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            ((a) this.mView).b((LynxUI) lynxBaseUI);
        }
    }

    @m(a = "end-margin")
    public final void setEndMargin(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ((a) this.mView).l(a(aVar));
    }

    @m(a = "indicator-active-color")
    public final void setIndicatorActiveColor(String str) {
        l.c(str, "");
        try {
            ((a) this.mView).a(ColorUtils.a(str));
        } catch (Exception unused) {
        }
    }

    @m(a = "indicator-color")
    public final void setIndicatorColor(String str) {
        l.c(str, "");
        try {
            ((a) this.mView).b(ColorUtils.a(str));
        } catch (Exception unused) {
        }
    }

    @m(a = "item-width")
    public final void setItemWidth(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ((a) this.mView).j(a(aVar));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOverflowFiber(int i2) {
        int i3;
        super.setOverflowFiber(i2);
        if (i2 == 3) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ((a) this.mView).setOverflow(i3);
    }

    @m(a = "hardware_texture")
    public final void setRenderHardwareTexture(boolean z) {
        if (z) {
            ((a) this.mView).setLayerTextureType(2);
        } else {
            ((a) this.mView).setLayerTextureType(0);
        }
    }

    @m(a = "shadow-color")
    public final void setShadowColor(String str) {
        l.c(str, "");
        try {
            ((a) this.mView).c(ColorUtils.a(str));
        } catch (Exception unused) {
        }
    }

    @m(a = "start-margin")
    public final void setStartMargin(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        ((a) this.mView).k(a(aVar));
    }

    @m(a = "current-item-id")
    public final void setCurrentItemId(String str) {
        l.c(str, "");
        List list = this.mChildren;
        l.a((Object) list, "");
        for (Object obj : list) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
            l.a((Object) lynxBaseUI, "");
            if (l.a((Object) lynxBaseUI.mName, (Object) str)) {
                if (obj != null) {
                    ((a) this.mView).d(this.mChildren.indexOf(obj));
                    return;
                }
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f36711a = map.containsKey("change");
            this.f36712b = map.containsKey("transition");
            this.f36713c = map.containsKey("scrollstart");
            this.f36714d = map.containsKey("scrollend");
        }
    }

    private static int a(com.lynx.react.bridge.a aVar) {
        Integer valueOf;
        int intValue;
        l.c(aVar, "");
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if ((p.c(e2, "px", false) || p.c(e2, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) n.a(e2, 10.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.a().widthPixels && valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    @m(a = "next-margin")
    public final void setNextMargin(com.lynx.react.bridge.a aVar) {
        Integer valueOf;
        int intValue;
        l.c(aVar, "");
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if ((p.c(e2, "px", false) || p.c(e2, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) n.a(e2, -1.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.a().widthPixels && valueOf != null) {
                ((a) this.mView).i(valueOf.intValue());
            }
        }
    }

    @m(a = "page-margin")
    public final void setPageMargin(com.lynx.react.bridge.a aVar) {
        Integer valueOf;
        int intValue;
        l.c(aVar, "");
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if ((p.c(e2, "px", false) || p.c(e2, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) n.a(e2, 10.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.a().widthPixels && valueOf != null) {
                ((a) this.mView).g(valueOf.intValue());
            }
        }
    }

    @m(a = "previous-margin")
    public final void setPreviousMargin(com.lynx.react.bridge.a aVar) {
        Integer valueOf;
        int intValue;
        l.c(aVar, "");
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            l.a((Object) e2, "");
            if ((p.c(e2, "px", false) || p.c(e2, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) n.a(e2, -1.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.a().widthPixels && valueOf != null) {
                ((a) this.mView).h(valueOf.intValue());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateAttributes(v vVar) {
        l.c(vVar, "");
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey != null) {
                try {
                    switch (nextKey.hashCode()) {
                        case -1992012396:
                            if (nextKey.equals("duration")) {
                                setDuration(readableMap.getInt(nextKey, 500));
                                break;
                            } else {
                                continue;
                            }
                        case -1597449863:
                            if (nextKey.equals("start-margin")) {
                                com.lynx.react.bridge.a dynamic = readableMap.getDynamic(nextKey);
                                l.a((Object) dynamic, "");
                                setStartMargin(dynamic);
                                break;
                            } else {
                                continue;
                            }
                        case -1596393144:
                            if (nextKey.equals("indicator-dots")) {
                                setIndicator(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case -1498085729:
                            if (nextKey.equals("circular")) {
                                setCircular(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case -1235498272:
                            if (nextKey.equals("end-margin")) {
                                com.lynx.react.bridge.a dynamic2 = readableMap.getDynamic(nextKey);
                                l.a((Object) dynamic2, "");
                                setEndMargin(dynamic2);
                                break;
                            } else {
                                continue;
                            }
                        case -1029251878:
                            if (nextKey.equals("indicator-active-color")) {
                                String string = readableMap.getString(nextKey);
                                l.a((Object) string, "");
                                setIndicatorActiveColor(string);
                                break;
                            } else {
                                continue;
                            }
                        case -111166008:
                            if (nextKey.equals("next-margin")) {
                                com.lynx.react.bridge.a dynamic3 = readableMap.getDynamic(nextKey);
                                l.a((Object) dynamic3, "");
                                setNextMargin(dynamic3);
                                break;
                            } else {
                                continue;
                            }
                        case 3357091:
                            if (nextKey.equals("mode")) {
                                String string2 = readableMap.getString(nextKey);
                                l.a((Object) string2, "");
                                setMode(string2);
                                break;
                            } else {
                                continue;
                            }
                        case 24002884:
                            if (nextKey.equals("previous-margin")) {
                                com.lynx.react.bridge.a dynamic4 = readableMap.getDynamic(nextKey);
                                l.a((Object) dynamic4, "");
                                setPreviousMargin(dynamic4);
                                break;
                            } else {
                                continue;
                            }
                        case 364166425:
                            if (nextKey.equals("touchable")) {
                                setTouchable(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case 570418373:
                            if (nextKey.equals("interval")) {
                                setInterval(readableMap.getInt(nextKey, 5000));
                                break;
                            } else {
                                continue;
                            }
                        case 914875020:
                            if (nextKey.equals("item-width")) {
                                com.lynx.react.bridge.a dynamic5 = readableMap.getDynamic(nextKey);
                                l.a((Object) dynamic5, "");
                                setItemWidth(dynamic5);
                                break;
                            } else {
                                continue;
                            }
                        case 1126940025:
                            if (nextKey.equals("current")) {
                                setCurrentIndex(readableMap.getInt(nextKey, 0));
                                break;
                            } else {
                                continue;
                            }
                        case 1127093697:
                            if (nextKey.equals("current-item-id")) {
                                String string3 = readableMap.getString(nextKey);
                                l.a((Object) string3, "");
                                setCurrentItemId(string3);
                                break;
                            } else {
                                continue;
                            }
                        case 1255595234:
                            if (nextKey.equals("hideshadow")) {
                                setHideShadow(readableMap.getBoolean(nextKey, true));
                                break;
                            } else {
                                continue;
                            }
                        case 1439562083:
                            if (nextKey.equals("autoplay")) {
                                setAutoPlay(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case 1599847372:
                            if (nextKey.equals("smooth-scroll")) {
                                setSmoothScroll(readableMap.getBoolean(nextKey, true));
                                break;
                            } else {
                                continue;
                            }
                        case 1616798838:
                            if (nextKey.equals("shadow-color")) {
                                String string4 = readableMap.getString(nextKey);
                                l.a((Object) string4, "");
                                setShadowColor(string4);
                                break;
                            } else {
                                continue;
                            }
                        case 1665556140:
                            if (nextKey.equals("page-margin")) {
                                com.lynx.react.bridge.a dynamic6 = readableMap.getDynamic(nextKey);
                                l.a((Object) dynamic6, "");
                                setPageMargin(dynamic6);
                                break;
                            } else {
                                continue;
                            }
                        case 2050488869:
                            if (nextKey.equals("indicator-color")) {
                                String string5 = readableMap.getString(nextKey);
                                l.a((Object) string5, "");
                                setIndicatorColor(string5);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    throw new RuntimeException("setProperty error: " + nextKey + '\n' + e2);
                }
            }
        }
        super.updateAttributes(vVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChildV2(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        insertChild(lynxBaseUI, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i2, lynxBaseUI);
            ((a) this.mView).a((LynxUI) lynxBaseUI);
            lynxBaseUI.setParent(this);
        }
    }
}
