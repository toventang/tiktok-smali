package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.v;

public class UIComponent extends UIView {

    /* renamed from: a  reason: collision with root package name */
    public String f56439a;

    static {
        Covode.recordClassIndex(35201);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.view.UIView
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 1176358053 && nextKey.equals("item-key")) {
                setItemKey(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
    }

    @m(a = "item-key")
    public void setItemKey(String str) {
        this.f56439a = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.view.UIView
    public final a a(Context context) {
        return new b(context);
    }

    public UIComponent(j jVar) {
        super(jVar);
        if (jVar.s) {
            this.mOverflow = 3;
        }
    }
}
