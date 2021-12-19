package com.gyf.barlibrary;

import com.bytedance.covode.number.Covode;

public interface OnKeyboardListener {
    static {
        Covode.recordClassIndex(34170);
    }

    void onKeyboardChange(boolean z, int i2);
}
