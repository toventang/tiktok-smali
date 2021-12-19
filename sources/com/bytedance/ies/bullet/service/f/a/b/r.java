package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public enum r {
    AUTO("auto"),
    LIGHT("light"),
    DARK("dark");
    
    public static final a Companion = new a((byte) 0);
    private final String VALUE;

    public static final class a {
        static {
            Covode.recordClassIndex(19460);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static r a(String str) {
            l.c(str, "");
            r[] values = r.values();
            for (r rVar : values) {
                if (l.a((Object) str, (Object) rVar.getVALUE())) {
                    return rVar;
                }
            }
            return r.AUTO;
        }
    }

    public final String getVALUE() {
        return this.VALUE;
    }

    static {
        Covode.recordClassIndex(19459);
    }

    private r(String str) {
        this.VALUE = str;
    }
}
