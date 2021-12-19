package com.ss.android.medialib.presenter;

import com.bytedance.covode.number.Covode;

public interface IStickerRequestCallback {
    static {
        Covode.recordClassIndex(36931);
    }

    void onStickerRequested(long j2, boolean z);
}
