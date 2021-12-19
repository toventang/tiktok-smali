package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;

public final class QaUtils {
    public static final QaUtils INSTANCE = new QaUtils();

    private QaUtils() {
    }

    static {
        Covode.recordClassIndex(84470);
    }

    public static final boolean isDataValid(QaStruct qaStruct) {
        if (qaStruct != null && !TextUtils.isEmpty(qaStruct.getQuestionContent())) {
            return true;
        }
        return false;
    }
}
