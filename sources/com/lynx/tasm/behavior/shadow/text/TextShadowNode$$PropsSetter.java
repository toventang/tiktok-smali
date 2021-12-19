package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.v;

public class TextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34991);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void a(ShadowNode shadowNode, String str, v vVar) {
        TextShadowNode textShadowNode = (TextShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("tail-color-convert")) {
            super.a(shadowNode, str, vVar);
        } else {
            textShadowNode.setEnableTailColorConvert(vVar.a(str, false));
        }
    }
}
