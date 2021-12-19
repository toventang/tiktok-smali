package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.SITICalculator;

final /* synthetic */ class LiveStream$$Lambda$0 implements SITICalculator.ISITIEventObserver {
    private final LiveStream arg$1;

    static {
        Covode.recordClassIndex(99874);
    }

    LiveStream$$Lambda$0(LiveStream liveStream) {
        this.arg$1 = liveStream;
    }

    @Override // com.ss.avframework.engine.SITICalculator.ISITIEventObserver
    public final void onBitrateChanged(int i2, String str) {
        this.arg$1.lambda$new$0$LiveStream(i2, str);
    }
}
