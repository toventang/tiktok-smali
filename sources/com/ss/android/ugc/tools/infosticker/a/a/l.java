package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;

public enum l {
    INFO_STICKER_STATE_UNKNOWN,
    INFO_STICKER_STATE_NOT_DOWNLOAD,
    INFO_STICKER_STATE_DOWNLOADING,
    INFO_STICKER_STATE_DOWNLOAD_SUCCESS,
    INFO_STICKER_STATE_DOWNLOAD_FAILED;

    static {
        Covode.recordClassIndex(98364);
    }
}
