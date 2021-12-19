package com.google.firebase;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public class d extends Exception {
    static {
        Covode.recordClassIndex(33744);
    }

    public d() {
    }

    public d(String str) {
        super(r.a(str, (Object) "Detail message must not be empty"));
    }

    public d(String str, Throwable th) {
        super(r.a(str, (Object) "Detail message must not be empty"), th);
    }
}
