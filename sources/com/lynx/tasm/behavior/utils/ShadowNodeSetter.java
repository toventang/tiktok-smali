package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.v;

public interface ShadowNodeSetter<T extends ShadowNode> extends Settable {
    static {
        Covode.recordClassIndex(35221);
    }

    void a(ShadowNode shadowNode, String str, v vVar);
}
