package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

public final class FetchTextAudioResponse extends BaseNetResponse {
    private final TextAudioData data;

    static {
        Covode.recordClassIndex(96693);
    }

    public final TextAudioData getData() {
        return this.data;
    }
}
