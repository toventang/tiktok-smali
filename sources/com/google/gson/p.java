package com.google.gson;

import com.bytedance.covode.number.Covode;

public class p extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    static {
        Covode.recordClassIndex(34061);
    }

    public p(String str) {
        super(str);
    }

    public p(Throwable th) {
        super(th);
    }

    public p(String str, Throwable th) {
        super(str, th);
    }
}
