package com.vk.api.sdk.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends a {
    public static final a Companion = new a((byte) 0);
    public static final long serialVersionUID = 1632913732314330746L;

    static {
        Covode.recordClassIndex(103782);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        l.c(str, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Throwable th) {
        super(th);
        l.c(th, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th) {
        super(str, th);
        l.c(str, "");
        l.c(th, "");
    }
}
