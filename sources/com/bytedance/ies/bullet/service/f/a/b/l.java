package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.m.p;

public enum l {
    AUTO("auto", 0),
    BOTTOM("bottom", 1),
    RIGHT("right", 2);
    
    public static final a Companion = new a((byte) 0);
    private final String VALUE;
    private final int VALUE_INT;

    public static final class a {
        static {
            Covode.recordClassIndex(19453);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static l a(String str) {
            h.f.b.l.c(str, "");
            l[] values = l.values();
            for (l lVar : values) {
                if (h.f.b.l.a((Object) str, (Object) lVar.getVALUE())) {
                    return lVar;
                }
            }
            Integer e2 = p.e(str);
            if (e2 != null) {
                int intValue = e2.intValue();
                l[] values2 = l.values();
                for (l lVar2 : values2) {
                    if (intValue == lVar2.getVALUE_INT()) {
                        return lVar2;
                    }
                }
            }
            return null;
        }
    }

    public final String getVALUE() {
        return this.VALUE;
    }

    public final int getVALUE_INT() {
        return this.VALUE_INT;
    }

    static {
        Covode.recordClassIndex(19452);
    }

    private l(String str, int i2) {
        this.VALUE = str;
        this.VALUE_INT = i2;
    }
}
