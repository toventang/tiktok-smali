package com.bytedance.bpea.entry.auth.privacy;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PrivacyCertAuthEntry {
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(15716);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(15717);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final void checkSDKCert(PrivacyCert privacyCert, String[] strArr, String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        a.C0572a.a(privacyCert, strArr, str, str2);
    }
}
