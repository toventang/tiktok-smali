package com.ss.android.ugc.aweme.filter.repository.internal.a;

import com.bytedance.covode.number.Covode;

final class b extends Exception {
    final Integer errorCode;
    final Long failDuration;

    static {
        Covode.recordClassIndex(60568);
    }

    public b(String str, Exception exc, Integer num, Long l2) {
        super(str, exc);
        this.errorCode = num;
        this.failDuration = l2;
    }
}
