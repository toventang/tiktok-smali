package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109194a = new a((byte) 0);

    static {
        Covode.recordClassIndex(69927);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69928);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(String str) {
            if (str == null) {
                try {
                    l.b();
                } catch (Exception unused) {
                    return "";
                }
            }
            String a2 = bc.a(Integer.valueOf(str));
            l.b(a2, "");
            return a2;
        }
    }
}
