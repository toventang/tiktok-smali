package com.bytedance.ies.xelement.pickview;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.behavior.v;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class LynxPickView extends UIView {

    /* renamed from: a  reason: collision with root package name */
    public String f37358a;

    /* renamed from: b  reason: collision with root package name */
    public String f37359b;

    /* renamed from: c  reason: collision with root package name */
    public String f37360c;

    static {
        Covode.recordClassIndex(22446);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.view.UIView
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != -208291852) {
                if (hashCode != 1256871824) {
                    if (hashCode == 2065426547 && nextKey.equals("indicator-style")) {
                        setIndicatorStyle(readableMap.getString(nextKey));
                    }
                } else if (nextKey.equals("mask-style")) {
                    setMaskStyle(readableMap.getString(nextKey));
                }
            } else if (nextKey.equals("visible-count")) {
                setVisibleCount(readableMap.getString(nextKey));
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        List list;
        List list2;
        List list3;
        String str = this.f37358a;
        if (!(str == null || (list3 = this.mChildren) == null)) {
            for (LynxPickerViewColumn lynxPickerViewColumn : n.a((Iterable<?>) list3, LynxPickerViewColumn.class)) {
                lynxPickerViewColumn.setIndicatorStyle(str);
            }
        }
        String str2 = this.f37359b;
        if (!(str2 == null || (list2 = this.mChildren) == null)) {
            for (LynxPickerViewColumn lynxPickerViewColumn2 : n.a((Iterable<?>) list2, LynxPickerViewColumn.class)) {
                lynxPickerViewColumn2.setMaskStyle(str2);
            }
        }
        String str3 = this.f37360c;
        if (!(str3 == null || (list = this.mChildren) == null)) {
            for (LynxPickerViewColumn lynxPickerViewColumn3 : n.a((Iterable<?>) list, LynxPickerViewColumn.class)) {
                lynxPickerViewColumn3.setVisibleCount(str3);
            }
        }
        super.measureChildren();
    }

    @m(a = "indicator-style")
    public final void setIndicatorStyle(String str) {
        l.c(str, "");
        this.f37358a = str;
    }

    @m(a = "mask-style")
    public final void setMaskStyle(String str) {
        l.c(str, "");
        this.f37359b = str;
    }

    @m(a = "visible-count")
    public final void setVisibleCount(String str) {
        l.c(str, "");
        this.f37360c = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxPickView(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }
}
