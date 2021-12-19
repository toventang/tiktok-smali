package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SearchStateViewModel$$Lambda$0 implements Runnable {
    private final SearchStateViewModel arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(50963);
    }

    SearchStateViewModel$$Lambda$0(SearchStateViewModel searchStateViewModel, int i2) {
        this.arg$1 = searchStateViewModel;
        this.arg$2 = i2;
    }

    public final void run() {
        this.arg$1.lambda$setSearchState$0$SearchStateViewModel(this.arg$2);
    }
}
