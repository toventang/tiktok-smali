package com.bytedance.ies.xelement.text.inlinetext;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxInlineTextShadowNode$$PropsSetter extends InlineTextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(22516);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter
    public final void a(ShadowNode shadowNode, String str, v vVar) {
        LynxInlineTextShadowNode lynxInlineTextShadowNode = (LynxInlineTextShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("no-trim")) {
            super.a(shadowNode, str, vVar);
        } else {
            lynxInlineTextShadowNode.setNoTrim(vVar.a(str, true));
        }
    }
}
