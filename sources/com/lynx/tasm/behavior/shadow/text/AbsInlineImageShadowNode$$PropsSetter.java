package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class AbsInlineImageShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34975);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void a(ShadowNode shadowNode, String str, v vVar) {
        AbsInlineImageShadowNode absInlineImageShadowNode = (AbsInlineImageShadowNode) shadowNode;
        str.hashCode();
        if (str.equals("src")) {
            absInlineImageShadowNode.setSource(vVar.c(str));
        } else if (!str.equals("mode")) {
            super.a(shadowNode, str, vVar);
        } else {
            absInlineImageShadowNode.setMode(vVar.c(str));
        }
    }
}
