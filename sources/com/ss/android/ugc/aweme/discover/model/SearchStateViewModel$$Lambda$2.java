package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SearchStateViewModel$$Lambda$2 implements Runnable {
    private final SearchStateViewModel arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(50965);
    }

    SearchStateViewModel$$Lambda$2(SearchStateViewModel searchStateViewModel, boolean z) {
        this.arg$1 = searchStateViewModel;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$setSearchPageVisible$2$SearchStateViewModel(this.arg$2);
    }
}
