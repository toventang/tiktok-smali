package com.bytedance.ies.xbridge.model.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import h.a.z;
import h.f.b.l;
import java.util.List;

public abstract class a {
    public static final C0864a Companion = new C0864a((byte) 0);

    static {
        Covode.recordClassIndex(21727);
    }

    /* renamed from: com.bytedance.ies.xbridge.model.params.a$a  reason: collision with other inner class name */
    public static final class C0864a {
        static {
            Covode.recordClassIndex(21728);
        }

        private C0864a() {
        }

        public /* synthetic */ C0864a(byte b2) {
            this();
        }

        public static /* synthetic */ Long a(n nVar, String str) {
            l.c(nVar, "");
            l.c(str, "");
            int i2 = b.f36296a[nVar.i(str).a().ordinal()];
            if (i2 == 1) {
                return Long.valueOf((long) nVar.e(str));
            }
            if (i2 != 2) {
                return null;
            }
            return Long.valueOf((long) nVar.d(str));
        }

        public static int a(n nVar, String str, int i2) {
            l.c(nVar, "");
            l.c(str, "");
            if (nVar.a(str)) {
                if (nVar.i(str).a() == o.Int) {
                    return i.a(nVar, str, i2);
                }
                if (nVar.i(str).a() == o.Number) {
                    return (int) i.a(nVar, str, (double) i2);
                }
            }
            return i2;
        }
    }

    public List<String> provideParamList() {
        return z.INSTANCE;
    }
}
