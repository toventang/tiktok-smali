package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;

public class AbsoluteSizeSpan extends android.text.style.AbsoluteSizeSpan {
    static {
        Covode.recordClassIndex(34976);
    }

    public int hashCode() {
        return ((getDip() ? 1 : 0) * 31) + getSize();
    }

    public AbsoluteSizeSpan(int i2) {
        super(i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip() == getDip() && absoluteSizeSpan.getSize() == getSize()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
