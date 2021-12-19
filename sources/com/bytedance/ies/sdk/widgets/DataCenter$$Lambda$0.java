package com.bytedance.ies.sdk.widgets;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class DataCenter$$Lambda$0 implements Runnable {
    private final DataCenter arg$1;
    private final Bundle arg$2;

    static {
        Covode.recordClassIndex(20704);
    }

    DataCenter$$Lambda$0(DataCenter dataCenter, Bundle bundle) {
        this.arg$1 = dataCenter;
        this.arg$2 = bundle;
    }

    public final void run() {
        this.arg$1.lambda$put$0$DataCenter(this.arg$2);
    }
}
