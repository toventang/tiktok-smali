package com.bytedance.android.livesdkapi.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public interface e extends d {
    static {
        Covode.recordClassIndex(13901);
    }

    void a();

    void a(int i2, int i3);

    void setDataChannel(DataChannel dataChannel);

    void setScaleType(int i2);
}
