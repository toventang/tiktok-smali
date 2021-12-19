package com.bytedance.xelement.experiment.richtext;

import android.content.Context;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import com.ss.android.newmedia.e.a.d;
import h.f.b.l;

public final class ExperimentRichTextUI extends LynxUI<d> {
    static {
        Covode.recordClassIndex(28228);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 3213227 && nextKey.equals("html")) {
                setSpan(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExperimentRichTextUI(j jVar) {
        super(jVar);
        l.d(jVar, "");
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ d createView(Context context) {
        if (context == null) {
            l.b();
        }
        d dVar = new d(context);
        dVar.setVerticalScrollBarEnabled(false);
        dVar.setHorizontalScrollBarEnabled(false);
        dVar.setOnTouchListener(a.f46163a);
        return dVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setFontSize(float f2) {
        super.setFontSize(f2);
        WebSettings settings = ((d) this.mView).getSettings();
        if (settings != null) {
            settings.setDefaultFontSize((int) f2);
        }
        ((d) this.mView).reload();
        invalidate();
    }

    @m(a = "html")
    public final void setSpan(String str) {
        if (str == null) {
            str = "";
        }
        ((d) this.mView).loadData(str, "text/html; charset=utf-8", "UTF-8");
        invalidate();
    }
}
