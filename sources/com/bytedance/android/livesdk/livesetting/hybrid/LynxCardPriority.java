package com.bytedance.android.livesdk.livesetting.hybrid;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import h.a.i;

public final class LynxCardPriority {
    @Group(isDefault = true, value = "default")
    private static final String[] DEFAULT = {"shortTouchEcommerceUg", "shortTouchEcommerceVoucher", "shortTouchTreasureBox"};
    public static final LynxCardPriority INSTANCE = new LynxCardPriority();

    private LynxCardPriority() {
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    private final String[] getPriorityArray() {
        return SettingsManager.INSTANCE.getStringArrayValue(LynxCardPriority.class);
    }

    static {
        Covode.recordClassIndex(10704);
    }

    public final int getPriority(String str) {
        String[] priorityArray = getPriorityArray();
        if (TextUtils.isEmpty(str) || priorityArray.length == 0 || !i.a(priorityArray, str)) {
            return Integer.MAX_VALUE;
        }
        return i.b(priorityArray, str);
    }
}
