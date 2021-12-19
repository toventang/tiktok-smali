package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class RawTextShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34988);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void a(ShadowNode shadowNode, String str, v vVar) {
        RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) shadowNode;
        str.hashCode();
        if (str.equals("pseudo")) {
            rawTextShadowNode.setPsuedo(vVar.a(str, false));
        } else if (!str.equals("text")) {
            super.a(shadowNode, str, vVar);
        } else {
            rawTextShadowNode.setText(vVar.f(str));
        }
    }
}
