package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class FilterManager$$Lambda$2 implements Runnable {
    private final FilterManager arg$1;

    static {
        Covode.recordClassIndex(100311);
    }

    FilterManager$$Lambda$2(FilterManager filterManager) {
        this.arg$1 = filterManager;
    }

    public final void run() {
        this.arg$1.lambda$releaseContetDetector$2$FilterManager();
    }
}
