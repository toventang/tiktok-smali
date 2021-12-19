package com.lynx.tasm.behavior.shadow.text;

import android.text.style.UnderlineSpan;
import com.bytedance.covode.number.Covode;

public class LynxUnderlineSpan extends UnderlineSpan {
    static {
        Covode.recordClassIndex(34986);
    }

    public int hashCode() {
        return getSpanTypeId() * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getSpanTypeId() == ((LynxUnderlineSpan) obj).getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
