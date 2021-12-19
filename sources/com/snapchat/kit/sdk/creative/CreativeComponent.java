package com.snapchat.kit.sdk.creative;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.creative.api.a;
import com.snapchat.kit.sdk.creative.c.b;

public interface CreativeComponent {
    static {
        Covode.recordClassIndex(35815);
    }

    a getApi();

    b getMediaFactory();
}
