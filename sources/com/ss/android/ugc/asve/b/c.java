package com.ss.android.ugc.asve.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.n;

public enum c {
    AS_CAMERA_LENS_BACK,
    AS_CAMERA_LENS_FRONT,
    AS_CAMERA_LENS_WIDE;
    
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(38073);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38074);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final c fromOrdinal(int i2) {
        if (i2 == 0) {
            return AS_CAMERA_LENS_BACK;
        }
        if (i2 == 1) {
            return AS_CAMERA_LENS_FRONT;
        }
        if (i2 != 2) {
            return AS_CAMERA_LENS_BACK;
        }
        return AS_CAMERA_LENS_WIDE;
    }

    public static final int toIntValue(c cVar) {
        l.d(cVar, "");
        int i2 = d.f61931a[cVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        throw new n();
    }
}
