package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.v;

public class InlineTextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34983);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void a(ShadowNode shadowNode, String str, v vVar) {
        InlineTextShadowNode inlineTextShadowNode = (InlineTextShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("background-color")) {
            super.a(shadowNode, str, vVar);
        } else {
            inlineTextShadowNode.setBackgroundColor(vVar.a(str, 0));
        }
    }
}
