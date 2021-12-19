package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.a;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.e;
import com.lynx.tasm.behavior.shadow.f;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.utils.n;
import h.f.b.l;

public class AutoHeightInputShadowNode extends TextShadowNode {
    static {
        Covode.recordClassIndex(22305);
    }

    @m(a = b.f37373b)
    public final void setFontTextSize(a aVar) {
        if (aVar == null) {
            setFontSize(n.a("14px", 0.0f, 0.0f));
            return;
        }
        ReadableType h2 = aVar.h();
        if (h2 != null) {
            int i2 = a.f37124a[h2.ordinal()];
            if (i2 == 1) {
                setFontSize((float) aVar.c());
            } else if (i2 == 2) {
                setFontSize(n.a(aVar.e(), 0.0f, 0.0f));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.d, com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final long a(LayoutNode layoutNode, float f2, e eVar, float f3, e eVar2) {
        l.c(layoutNode, "");
        l.c(eVar, "");
        l.c(eVar2, "");
        LynxBaseUI a2 = h().a(this.f55957h);
        if (!(a2 instanceof LynxTextAreaView)) {
            a2 = null;
        }
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) a2;
        if (lynxTextAreaView == null) {
            return f.a();
        }
        return f.a(f2, (float) Math.max(lynxTextAreaView.o, lynxTextAreaView.D));
    }
}
