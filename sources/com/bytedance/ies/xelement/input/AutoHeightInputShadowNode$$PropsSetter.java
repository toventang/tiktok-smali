package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class AutoHeightInputShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(22306);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter
    public final void a(ShadowNode shadowNode, String str, v vVar) {
        AutoHeightInputShadowNode autoHeightInputShadowNode = (AutoHeightInputShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals(b.f37373b)) {
            super.a(shadowNode, str, vVar);
        } else {
            autoHeightInputShadowNode.setFontTextSize(vVar.f(str));
        }
    }
}
