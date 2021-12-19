package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SearchStateViewModel$$Lambda$5 implements Runnable {
    private final SearchStateViewModel arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(50968);
    }

    SearchStateViewModel$$Lambda$5(SearchStateViewModel searchStateViewModel, boolean z) {
        this.arg$1 = searchStateViewModel;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$setShowingFilters$5$SearchStateViewModel(this.arg$2);
    }
}
