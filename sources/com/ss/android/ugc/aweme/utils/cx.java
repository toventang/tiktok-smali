package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Collection;

public final class cx {
    static {
        Covode.recordClassIndex(93409);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || !aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getDesc())) {
            return false;
        }
        if (b.a((Collection) aweme.getTextExtra())) {
            return true;
        }
        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
            if (textExtraStruct.getType() == 4) {
                return false;
            }
        }
        return true;
    }
}
