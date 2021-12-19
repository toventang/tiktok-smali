package com.bytedance.bae.router;

import com.bytedance.covode.number.Covode;

public abstract class BaseAudioRoutingController implements IAudioRoutingController {
    private RoutingInfo mRoutingInfo = new RoutingInfo();

    static {
        Covode.recordClassIndex(15368);
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public RoutingInfo getRoutingInfo() {
        return this.mRoutingInfo;
    }
}
