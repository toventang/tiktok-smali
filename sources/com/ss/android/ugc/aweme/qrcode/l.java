package com.ss.android.ugc.aweme.qrcode;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.co.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f119756a;

    static {
        Covode.recordClassIndex(77811);
    }

    private l() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static l f119757a = new l((byte) 0);

        static {
            Covode.recordClassIndex(77812);
        }
    }

    public final Boolean a() {
        if (this.f119756a == null) {
            this.f119756a = Boolean.valueOf(b.b().b(d.a(), "enable_home_scan_qrcode", false));
        }
        return this.f119756a;
    }

    /* synthetic */ l(byte b2) {
        this();
    }
}
