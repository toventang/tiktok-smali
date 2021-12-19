package com.ss.android.ugc.aweme.search.theme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.CardGradientBgData;
import com.ss.android.ugc.aweme.utils.ay;

public final class d {
    static {
        Covode.recordClassIndex(79273);
    }

    public static final c a(CardGradientBgData cardGradientBgData) {
        String str;
        int i2;
        Integer darkModeItemSize;
        Integer num = null;
        if (cardGradientBgData != null) {
            str = cardGradientBgData.getDarkModeBgColor();
        } else {
            str = null;
        }
        Integer a2 = ay.a(str);
        if (a2 == null) {
            return null;
        }
        int intValue = a2.intValue();
        if (cardGradientBgData == null || (darkModeItemSize = cardGradientBgData.getDarkModeItemSize()) == null) {
            i2 = 0;
        } else {
            i2 = darkModeItemSize.intValue();
        }
        if (i2 > 0) {
            num = Integer.valueOf(i2 - 1);
        }
        return new c("dark", intValue, num, 8);
    }
}
