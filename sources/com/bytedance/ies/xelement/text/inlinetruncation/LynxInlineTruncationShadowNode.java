package com.bytedance.ies.xelement.text.inlinetruncation;

import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import java.util.ArrayList;
import java.util.List;

public final class LynxInlineTruncationShadowNode extends TextShadowNode {
    static {
        Covode.recordClassIndex(22518);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void a(SpannableStringBuilder spannableStringBuilder, List<BaseTextShadowNode.b> list) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        super.a(spannableStringBuilder2, arrayList);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                arrayList.get(size).a(spannableStringBuilder2);
            } else {
                this.t = spannableStringBuilder2;
                return;
            }
        }
    }
}
