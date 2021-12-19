package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.IDualGameEngine;

final /* synthetic */ class LiveStream$$Lambda$14 implements IDualGameEngine.IDualGameNotifierToLiveCore {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(99880);
    }

    LiveStream$$Lambda$14(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    @Override // com.ss.avframework.livestreamv2.IDualGameEngine.IDualGameNotifierToLiveCore
    public final void onDualGameStatusChange(boolean z) {
        this.arg$1.switchVideoSinkForDualGame(z);
    }
}
