package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class da {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, cz> f142806a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f142807b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(93421);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static cz b(String str) {
            l.d(str, "");
            return da.f142806a.get(str);
        }

        public static cz a(String str) {
            l.d(str, "");
            cz czVar = da.f142806a.get(str);
            if (czVar != null) {
                return czVar;
            }
            gd gdVar = new gd(str);
            da.f142806a.put(str, gdVar);
            return gdVar;
        }
    }

    static {
        Covode.recordClassIndex(93420);
    }
}
