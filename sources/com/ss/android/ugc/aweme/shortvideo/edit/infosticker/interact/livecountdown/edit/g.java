package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(83571);
    }

    public static final String a(int i2) {
        if (i2 <= 9) {
            return "0".concat(String.valueOf(i2));
        }
        return String.valueOf(i2);
    }

    public static final boolean a(View view, int i2, int i3) {
        l.d(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 < i4 || i2 > i4 + width || i3 < i5 || i3 > i5 + height) {
            return false;
        }
        return true;
    }
}
