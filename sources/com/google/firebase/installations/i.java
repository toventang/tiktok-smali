package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.d;

public final class i extends d {
    private final a status;

    static {
        Covode.recordClassIndex(33860);
    }

    public final a getStatus() {
        return this.status;
    }

    public enum a {
        BAD_CONFIG;

        static {
            Covode.recordClassIndex(33861);
        }
    }

    public i(a aVar) {
        this.status = aVar;
    }

    public i(String str, a aVar) {
        super(str);
        this.status = aVar;
    }

    public i(String str, a aVar, Throwable th) {
        super(str, th);
        this.status = aVar;
    }
}
