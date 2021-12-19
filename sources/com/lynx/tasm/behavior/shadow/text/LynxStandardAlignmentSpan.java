package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.style.AlignmentSpan;
import com.bytedance.covode.number.Covode;

public class LynxStandardAlignmentSpan extends AlignmentSpan.Standard {
    static {
        Covode.recordClassIndex(34984);
    }

    public int hashCode() {
        int hashCode;
        int spanTypeId = getSpanTypeId() * 31;
        if (getAlignment() == null) {
            hashCode = 0;
        } else {
            hashCode = getAlignment().hashCode();
        }
        return spanTypeId + hashCode;
    }

    public LynxStandardAlignmentSpan(Layout.Alignment alignment) {
        super(alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LynxStandardAlignmentSpan lynxStandardAlignmentSpan = (LynxStandardAlignmentSpan) obj;
        if (getAlignment() == lynxStandardAlignmentSpan.getAlignment() && getSpanTypeId() == lynxStandardAlignmentSpan.getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
