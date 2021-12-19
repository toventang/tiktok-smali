package com.lynx.tasm.behavior.ui.scroll;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.a;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;

public abstract class AbsLynxUIScroll<T extends ViewGroup> extends UISimpleView<T> {
    static {
        Covode.recordClassIndex(35135);
    }

    public void a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    public void a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i2) {
    }

    public abstract void a(boolean z);

    public abstract void b(boolean z);

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            int i5 = 0;
            boolean z2 = false;
            int i6 = 0;
            switch (nextKey.hashCode()) {
                case -2032847360:
                    if (nextKey.equals("scroll-to-index")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        scrollToIndex(i2);
                        continue;
                    }
                    break;
                case -1571036001:
                    if (nextKey.equals("lower-threshold")) {
                        if (!readableMap.isNull(nextKey)) {
                            i6 = readableMap.getInt(nextKey, 0);
                        }
                        setLowerThreshole(i6);
                        continue;
                    }
                    break;
                case -402166408:
                    if (nextKey.equals("scroll-x")) {
                        setScrollX(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -402166407:
                    if (nextKey.equals("scroll-y")) {
                        setScrollY(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -169901481:
                    if (nextKey.equals("enable-scroll")) {
                        boolean z3 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, true);
                        }
                        setEnableScroll(z3);
                        continue;
                    }
                    break;
                case 65137827:
                    if (nextKey.equals("scroll-tap")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setScrollTap(z2);
                        continue;
                    }
                    break;
                case 65138261:
                    if (nextKey.equals("scroll-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setScrollTop(i5);
                        continue;
                    }
                    break;
                case 660290816:
                    if (nextKey.equals("upper-threshold")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setUpperThreshole(i4);
                        continue;
                    }
                    break;
                case 1751260029:
                    if (nextKey.equals("scroll-bar-enable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setScrollBarEnable(z);
                        continue;
                    }
                    break;
                case 2019037959:
                    if (nextKey.equals("scroll-left")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setScrollLeft(i3);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @m(a = "scroll-to-index", e = 0)
    public abstract void scrollToIndex(int i2);

    @m(a = "enable-scroll", f = true)
    public void setEnableScroll(boolean z) {
    }

    @m(a = "lower-threshold", e = 0)
    public abstract void setLowerThreshole(int i2);

    @m(a = "scroll-bar-enable", f = false)
    public abstract void setScrollBarEnable(boolean z);

    @m(a = "scroll-left", e = 0)
    public abstract void setScrollLeft(int i2);

    @m(a = "scroll-tap", f = false)
    public abstract void setScrollTap(boolean z);

    @m(a = "scroll-top", e = 0)
    public abstract void setScrollTop(int i2);

    @m(a = "upper-threshold", e = 0)
    public abstract void setUpperThreshole(int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56268a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 35138(0x8942, float:4.9239E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll.AnonymousClass1.f56268a = r2
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll.AnonymousClass1.f56268a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll.AnonymousClass1.<clinit>():void");
        }
    }

    public AbsLynxUIScroll(j jVar) {
        super(jVar);
    }

    @m(a = "scroll-x")
    public void setScrollX(a aVar) {
        if (aVar == null) {
            b(false);
            return;
        }
        int i2 = AnonymousClass1.f56268a[aVar.h().ordinal()];
        if (i2 == 1) {
            b(aVar.b());
        } else if (i2 == 2) {
            b("true".equals(aVar.e()));
        }
    }

    @m(a = "scroll-y")
    public void setScrollY(a aVar) {
        if (aVar == null) {
            a(true);
            return;
        }
        int i2 = AnonymousClass1.f56268a[aVar.h().ordinal()];
        if (i2 == 1) {
            a(aVar.b());
        } else if (i2 == 2) {
            a("true".equals(aVar.e()));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateAttributes(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (nextKey.hashCode()) {
                    case -1571036001:
                        if (!nextKey.equals("lower-threshold")) {
                            break;
                        } else {
                            setLowerThreshole(readableMap.getInt(nextKey, 0));
                            break;
                        }
                    case -402166408:
                        if (!nextKey.equals("scroll-x")) {
                            break;
                        } else {
                            setScrollX(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case -402166407:
                        if (!nextKey.equals("scroll-y")) {
                            break;
                        } else {
                            setScrollY(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case -169901481:
                        if (!nextKey.equals("enable-scroll")) {
                            break;
                        } else {
                            setEnableScroll(readableMap.getBoolean(nextKey, true));
                            break;
                        }
                    case 65137827:
                        if (!nextKey.equals("scroll-tap")) {
                            break;
                        } else {
                            setScrollTap(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 65138261:
                        if (!nextKey.equals("scroll-top")) {
                            break;
                        } else {
                            setScrollTop(readableMap.getInt(nextKey, 0));
                            break;
                        }
                    case 660290816:
                        if (!nextKey.equals("upper-threshold")) {
                            break;
                        } else {
                            setUpperThreshole(readableMap.getInt(nextKey, 0));
                            break;
                        }
                    case 1751260029:
                        if (!nextKey.equals("scroll-bar-enable")) {
                            break;
                        } else {
                            setScrollBarEnable(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 2019037959:
                        if (!nextKey.equals("scroll-left")) {
                            break;
                        } else {
                            setScrollLeft(readableMap.getInt(nextKey, 0));
                            break;
                        }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e2.toString());
            }
        }
        super.updateAttributes(vVar);
    }
}
