package com.ss.android.ugc.asve.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.n;

public enum g {
    AS_ENCODE_PROFILE_UNKNOWN,
    AS_ENCODE_PROFILE_BASELINE,
    AS_ENCODE_PROFILE_MAIN,
    AS_ENCODE_PROFILE_HIGH;
    
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(38078);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38079);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final g fromOrdinal(int i2) {
        if (i2 == 0) {
            return AS_ENCODE_PROFILE_UNKNOWN;
        }
        if (i2 == 1) {
            return AS_ENCODE_PROFILE_BASELINE;
        }
        if (i2 == 2) {
            return AS_ENCODE_PROFILE_MAIN;
        }
        if (i2 != 3) {
            return AS_ENCODE_PROFILE_UNKNOWN;
        }
        return AS_ENCODE_PROFILE_HIGH;
    }

    public static final int toIntValue(g gVar) {
        l.d(gVar, "");
        int i2 = h.f61935a[gVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new n();
    }
}
