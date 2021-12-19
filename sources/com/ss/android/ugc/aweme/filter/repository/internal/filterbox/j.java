package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;

enum j {
    INSERT(1),
    REMOVE(0);
    
    final int value;

    static {
        Covode.recordClassIndex(60600);
    }

    private j(int i2) {
        this.value = i2;
    }
}
