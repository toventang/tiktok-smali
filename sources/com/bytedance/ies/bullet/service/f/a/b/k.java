package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public enum k {
    NONE("none", 0),
    REPORT("report", 1),
    SHARE("share", 2);
    
    public static final a Companion = new a((byte) 0);
    private final String VALUE;
    private final int VALUE_INT;

    public static final class a {
        static {
            Covode.recordClassIndex(19451);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static k a(String str) {
            l.c(str, "");
            k[] values = k.values();
            for (k kVar : values) {
                if (l.a((Object) str, (Object) kVar.getVALUE())) {
                    return kVar;
                }
            }
            Integer e2 = p.e(str);
            if (e2 != null) {
                int intValue = e2.intValue();
                k[] values2 = k.values();
                for (k kVar2 : values2) {
                    if (intValue == kVar2.getVALUE_INT()) {
                        return kVar2;
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
        Covode.recordClassIndex(19450);
    }

    private k(String str, int i2) {
        this.VALUE = str;
        this.VALUE_INT = i2;
    }
}
