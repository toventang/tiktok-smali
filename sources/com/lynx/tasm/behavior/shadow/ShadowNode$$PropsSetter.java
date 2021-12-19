package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;
import com.lynx.tasm.behavior.v;

public class ShadowNode$$PropsSetter implements ShadowNodeSetter<ShadowNode> {
    static {
        Covode.recordClassIndex(34960);
    }

    @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void a(ShadowNode shadowNode, String str, v vVar) {
        str.hashCode();
        if (str.equals("vertical-align")) {
            shadowNode.setVerticalAlign(vVar.d(str));
        } else if (str.equals("ignore-focus")) {
            shadowNode.setIgnoreFocus(vVar.a(str, false));
        }
    }
}
