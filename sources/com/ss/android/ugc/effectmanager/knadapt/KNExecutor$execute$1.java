package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;

final class KNExecutor$execute$1 implements Runnable {
    final /* synthetic */ Runnable $command;

    static {
        Covode.recordClassIndex(95545);
    }

    KNExecutor$execute$1(Runnable runnable) {
        this.$command = runnable;
    }

    public final void run() {
        Runnable runnable = this.$command;
        if (runnable != null) {
            runnable.run();
        }
    }
}
