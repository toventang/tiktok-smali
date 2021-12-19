package com.lynx.tasm.ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class FrescoInlineImageShadowNode$$PropsSetter extends AbsInlineImageShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(35410);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter
    public void a(ShadowNode shadowNode, String str, v vVar) {
        FrescoInlineImageShadowNode frescoInlineImageShadowNode = (FrescoInlineImageShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("skip-redirection")) {
            super.a(shadowNode, str, vVar);
        } else {
            frescoInlineImageShadowNode.setSkipRedirection(vVar.a(str, false));
        }
    }
}
