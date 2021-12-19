package com.ss.android.ugc.aweme.sharer;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i extends RuntimeException {
    public static final a Companion = new a((byte) 0);
    private final String message;

    static {
        Covode.recordClassIndex(81867);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81868);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        l.d(str, "");
        this.message = str;
    }
}
