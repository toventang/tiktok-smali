package com.bytedance.android.livesdk.tunnel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21747a = new a((byte) 0);

    static {
        Covode.recordClassIndex(12818);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12819);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static <T extends TunnelViewModel> T a(Class<T> cls, e eVar) {
            l.d(cls, "");
            if (eVar == null) {
                l.b();
            }
            ac a2 = ae.a(eVar, (ad.b) null).a(cls);
            l.b(a2, "");
            return (T) ((TunnelViewModel) a2);
        }
    }
}
