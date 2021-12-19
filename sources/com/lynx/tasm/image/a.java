package com.lynx.tasm.image;

import android.util.DisplayMetrics;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.image.b;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.n;

/* access modifiers changed from: package-private */
public final class a {
    static {
        Covode.recordClassIndex(35327);
    }

    public static b.a a(String str, LynxBaseUI lynxBaseUI) {
        int round;
        if (str == null) {
            return null;
        }
        String[] split = str.split(" +");
        if (split.length != 4) {
            return null;
        }
        try {
            UIBody uIBody = lynxBaseUI.mContext.f55901i;
            float f2 = lynxBaseUI.mFontSize;
            DisplayMetrics displayMetrics = lynxBaseUI.mContext.p;
            int round2 = Math.round(n.a(split[0], uIBody.mFontSize, f2, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, displayMetrics));
            int round3 = Math.round(n.a(split[1], uIBody.mFontSize, f2, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, displayMetrics));
            int a2 = ColorUtils.a(split[3]);
            if (a2 != 0 && (round = Math.round(n.a(split[2], uIBody.mFontSize, f2, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, displayMetrics))) > 0) {
                return new b.a(round2, round3, a2, round);
            }
            return null;
        } catch (Exception e2) {
            LLog.d("Drop Shadow", str + Log.getStackTraceString(e2));
            return null;
        }
    }
}
