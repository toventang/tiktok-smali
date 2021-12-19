package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.TEBundle;

public class LiveStreamOption {
    private TEBundle mOpt;

    static {
        Covode.recordClassIndex(99941);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        release();
    }

    public TEBundle getOpt() {
        return this.mOpt;
    }

    public synchronized void release() {
        MethodCollector.i(12134);
        TEBundle tEBundle = this.mOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mOpt = null;
        }
        MethodCollector.o(12134);
    }

    public LiveStreamOption(TEBundle tEBundle) {
        this.mOpt = tEBundle;
    }
}
