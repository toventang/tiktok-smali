package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;

public class BackgroundColorSpan extends android.text.style.BackgroundColorSpan {
    static {
        Covode.recordClassIndex(34977);
    }

    public int hashCode() {
        return getBackgroundColor() + 31;
    }

    public BackgroundColorSpan(int i2) {
        super(i2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BackgroundColorSpan) || getBackgroundColor() != ((BackgroundColorSpan) obj).getBackgroundColor()) {
            return false;
        }
        return true;
    }
}
