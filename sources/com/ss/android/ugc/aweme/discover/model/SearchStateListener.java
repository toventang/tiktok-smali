package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

public interface SearchStateListener {
    static {
        Covode.recordClassIndex(50960);
    }

    void onContentVisible(boolean z);

    void onPageHidden();

    void onPageResume();
}
