package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public enum s {
    IMMERSIVE(1),
    GRADUAL_CHANGE(2),
    NORMAL(3);
    
    public static final a Companion = new a((byte) 0);
    private final int VALUE;

    public static final class a {
        static {
            Covode.recordClassIndex(19462);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static s a(int i2) {
            s[] values = s.values();
            for (s sVar : values) {
                if (i2 == sVar.getVALUE()) {
                    return sVar;
                }
            }
            return null;
        }

        public static s a(String str) {
            l.c(str, "");
            Integer e2 = p.e(str);
            if (e2 != null) {
                return a(e2.intValue());
            }
            return null;
        }
    }

    public final int getVALUE() {
        return this.VALUE;
    }

    static {
        Covode.recordClassIndex(19461);
    }

    private s(int i2) {
        this.VALUE = i2;
    }
}
