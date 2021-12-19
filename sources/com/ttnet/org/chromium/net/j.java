package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.RejectedExecutionException;

public final class j extends RejectedExecutionException {
    static {
        Covode.recordClassIndex(103543);
    }

    public j() {
        super("Inline execution is prohibited for this request");
    }
}
