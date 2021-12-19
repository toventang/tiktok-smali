package com.tencent.wcdb.support;

import com.bytedance.covode.number.Covode;

public class OperationCanceledException extends RuntimeException {
    static {
        Covode.recordClassIndex(103083);
    }

    public OperationCanceledException() {
        this(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OperationCanceledException(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
