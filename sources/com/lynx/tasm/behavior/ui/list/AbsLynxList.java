package com.lynx.tasm.behavior.ui.list;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.a;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.g;

public abstract class AbsLynxList<T extends ViewGroup> extends UISimpleView<T> {

    /* renamed from: a  reason: collision with root package name */
    g f56155a;

    /* renamed from: b  reason: collision with root package name */
    LynxBaseUI f56156b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f56157c = new int[2];

    /* renamed from: d  reason: collision with root package name */
    private int[] f56158d = new int[2];

    static {
        Covode.recordClassIndex(35100);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -1571036001:
                    if (nextKey.equals("lower-threshold")) {
                        setLowerThreshold(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -1554128936:
                    if (nextKey.equals("column-count")) {
                        int i2 = 1;
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 1);
                        }
                        setColumnCount(i2);
                        continue;
                    }
                    break;
                case -1270238455:
                    if (nextKey.equals("list-type")) {
                        setListType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -892259863:
                    if (nextKey.equals("sticky")) {
                        setEnableSticky(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -592430592:
                    if (nextKey.equals("paging-enabled")) {
                        setEnablePagerSnap(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -505303290:
                    if (nextKey.equals("needs-visible-cells")) {
                        boolean z = false;
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setNeedVisibleCells(z);
                        continue;
                    }
                    break;
                case -411446853:
                    if (nextKey.equals("initial-scroll-index")) {
                        setInitialScrollIndex(readableMap.getDynamic(nextKey));
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
                        setScrollEnable(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -137292606:
                    if (nextKey.equals("upper-threshold-item-count")) {
                        setUpperThresholdItemCount(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 10993126:
                    if (nextKey.equals("over-scroll")) {
                        setOverScroll(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 660290816:
                    if (nextKey.equals("upper-threshold")) {
                        setUpperThreshold(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 693516932:
                    if (nextKey.equals("cache-queue-ratio")) {
                        setCacheQueueRatio(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 875338749:
                    if (nextKey.equals("scroll-event-throttle")) {
                        setScrollEventThrottle(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1191691203:
                    if (nextKey.equals("lower-threshold-item-count")) {
                        setLowerThresholdItemCount(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1861761406:
                    if (nextKey.equals("scroll-state-change-event-throttle")) {
                        setScrollStateChangeEventThrottle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1883148160:
                    if (nextKey.equals("update-animation")) {
                        setUpdateAnimation(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void onInsertChild(LynxBaseUI lynxBaseUI, int i2) {
    }

    @m(a = "cache-queue-ratio", b = "1")
    public abstract void setCacheQueueRatio(a aVar);

    @m(a = "column-count", e = 1)
    public abstract void setColumnCount(int i2);

    @m(a = "paging-enabled", b = "false")
    public abstract void setEnablePagerSnap(a aVar);

    @m(a = "sticky")
    public abstract void setEnableSticky(a aVar);

    @m(a = "initial-scroll-index", b = "0")
    public abstract void setInitialScrollIndex(a aVar);

    @m(a = "list-type", b = "single")
    public abstract void setListType(String str);

    @m(a = "lower-threshold", e = 50)
    public abstract void setLowerThreshold(a aVar);

    @m(a = "lower-threshold-item-count", e = 0)
    public void setLowerThresholdItemCount(a aVar) {
    }

    @m(a = "needs-visible-cells", f = false)
    public abstract void setNeedVisibleCells(boolean z);

    @m(a = "enable-scroll", b = "true")
    public abstract void setScrollEnable(a aVar);

    @m(a = "scroll-event-throttle", b = "200")
    public abstract void setScrollEventThrottle(a aVar);

    @m(a = "scroll-state-change-event-throttle", b = "10")
    public abstract void setScrollStateChangeEventThrottle(String str);

    @m(a = "scroll-x", b = "false")
    public abstract void setScrollX(a aVar);

    @m(a = "scroll-y", b = "true")
    public abstract void setScrollY(a aVar);

    @m(a = "update-animation", b = "none")
    public abstract void setUpdateAnimation(String str);

    @m(a = "upper-threshold", e = 50)
    public abstract void setUpperThreshold(a aVar);

    @m(a = "upper-threshold-item-count", e = 0)
    public void setUpperThresholdItemCount(a aVar) {
    }

    public final JavaOnlyMap a() {
        g gVar = this.f56155a;
        int sign = getSign();
        if (gVar.f56620a == null) {
            return null;
        }
        TemplateAssembler templateAssembler = gVar.f56620a;
        if (!templateAssembler.f55577g) {
            return templateAssembler.nativeGetListPlatformInfo(templateAssembler.f55571a, sign);
        }
        LLog.a(6, "TemplateAssembler", "getListPlatformInfo while tasm is destoryed: listSign ".concat(String.valueOf(sign)));
        return null;
    }

    public AbsLynxList(j jVar) {
        super(jVar);
        this.f56155a = jVar.f55899g;
        this.f56156b = null;
    }

    public final void b(LynxUI lynxUI) {
        g gVar = this.f56155a;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        if (gVar.f56620a != null) {
            TemplateAssembler templateAssembler = gVar.f56620a;
            if (templateAssembler.f55577g) {
                LLog.a(6, "TemplateAssembler", "recycleChild: listSign " + sign + ", childSign " + sign2);
            } else {
                templateAssembler.nativeRecycleChild(templateAssembler.f55571a, sign, sign2);
            }
        }
    }

    @m(a = "over-scroll", b = "true")
    public void setOverScroll(a aVar) {
        boolean b2;
        ReadableType h2 = aVar.h();
        if (h2 == ReadableType.String) {
            b2 = "true".equals(aVar.e());
        } else {
            if (h2 == ReadableType.Boolean) {
                b2 = aVar.b();
            }
            ((ViewGroup) this.mView).setOverScrollMode(0);
        }
        if (!b2) {
            ((ViewGroup) this.mView).setOverScrollMode(2);
            return;
        }
        ((ViewGroup) this.mView).setOverScrollMode(0);
    }

    public final void a(LynxUI lynxUI) {
        g gVar = this.f56155a;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        if (gVar.f56620a != null) {
            TemplateAssembler templateAssembler = gVar.f56620a;
            if (templateAssembler.f55577g) {
                LLog.a(6, "TemplateAssembler", "removeChild: listSign " + sign + ", childSign " + sign2);
            } else {
                templateAssembler.nativeRemoveChild(templateAssembler.f55571a, sign, sign2);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChildV2(LynxBaseUI lynxBaseUI, int i2) {
        insertChild(lynxBaseUI, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        this.f56156b = lynxBaseUI;
        lynxBaseUI.setParent(this);
        this.mChildren.add(this.mChildren.size(), lynxBaseUI);
        onInsertChild(lynxBaseUI, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChildFiber(LynxBaseUI lynxBaseUI, int i2) {
        this.f56156b = lynxBaseUI;
        lynxBaseUI.setParent(this);
        this.mChildren.add(this.mChildren.size(), lynxBaseUI);
        onInsertChild(lynxBaseUI, i2);
    }

    public final LynxUI a(int i2, long j2) {
        LynxBaseUI a2;
        g gVar = this.f56155a;
        int sign = getSign();
        if (gVar.f56620a == null) {
            return null;
        }
        TemplateAssembler templateAssembler = gVar.f56620a;
        if (templateAssembler.f55577g) {
            LLog.a(6, "TemplateAssembler", "obtainChild: listSign " + sign + ", index " + i2);
            return null;
        }
        int nativeObtainChild = templateAssembler.nativeObtainChild(templateAssembler.f55571a, sign, i2, j2);
        if (nativeObtainChild <= 0 || (a2 = this.mContext.a(nativeObtainChild)) == null || !(a2 instanceof UIComponent)) {
            return null;
        }
        return (LynxUI) a2;
    }

    public final void a(LynxUI lynxUI, int i2, long j2) {
        g gVar = this.f56155a;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        if (gVar.f56620a != null) {
            TemplateAssembler templateAssembler = gVar.f56620a;
            if (templateAssembler.f55577g) {
                LLog.a(6, "TemplateAssembler", "renderChild: listSign " + sign + ", oldSign " + sign2 + ", newIndex " + i2);
            } else {
                templateAssembler.nativeUpdateChild(templateAssembler.f55571a, sign, sign2, i2, j2);
            }
        }
    }
}
