package com.bytedance.ies.xelement.text.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxTextShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(22521);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter
    public final void a(ShadowNode shadowNode, String str, v vVar) {
        LynxTextShadowNode lynxTextShadowNode = (LynxTextShadowNode) shadowNode;
        str.hashCode();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextShadowNode.setRichType(vVar.c(str));
                    return;
                }
                break;
            case 125841635:
                if (str.equals("ellipsize-mode")) {
                    lynxTextShadowNode.setEllipsizeMode(vVar.c(str));
                    return;
                }
                break;
            case 1629007544:
                if (str.equals("text-maxline")) {
                    lynxTextShadowNode.setTextMaxLine(vVar.c(str));
                    return;
                }
                break;
        }
        super.a(shadowNode, str, vVar);
    }
}
