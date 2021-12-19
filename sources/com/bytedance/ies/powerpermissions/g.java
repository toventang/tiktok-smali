package com.bytedance.ies.powerpermissions;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.c.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f34460b = new a((byte) 0);

    static {
        Covode.recordClassIndex(20607);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20608);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpermissions.e
    public final void a(m mVar, String... strArr) {
        l.c(strArr, "");
        if (mVar != null) {
            PrivacyCert privacyCert = mVar.f34475e;
            if (privacyCert == null || a.C0569a.a(strArr, privacyCert) == null) {
                mVar.a();
            } else {
                mVar.b();
            }
        }
    }
}
