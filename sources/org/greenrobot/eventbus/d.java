package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

public final class d extends RuntimeException {
    private static final long serialVersionUID = -2912559384646531479L;

    static {
        Covode.recordClassIndex(106473);
    }

    public d(String str) {
        super(str);
    }

    public d(Throwable th) {
        super(th);
    }

    public d(String str, Throwable th) {
        super(str, th);
    }
}
