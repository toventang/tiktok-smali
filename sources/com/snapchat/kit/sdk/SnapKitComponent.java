package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;

public interface SnapKitComponent extends SnapKitProvidingComponent {
    static {
        Covode.recordClassIndex(35544);
    }

    void inject(a aVar);

    void inject(d dVar);
}
