package com.bytedance.android.e.a.a;

import com.a;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class g {
    static {
        Covode.recordClassIndex(3333);
    }

    public static long b(f fVar) {
        return fVar.f();
    }

    public static boolean a(f fVar) {
        int e2 = fVar.e();
        if (e2 == 0) {
            return false;
        }
        if (e2 == 1) {
            return true;
        }
        throw new IOException(a.a("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(e2)}));
    }

    public static void c(f fVar) {
        int i2 = fVar.f6861a;
        if (i2 == 0) {
            fVar.f();
        } else if (i2 == 1) {
            fVar.h();
        } else if (i2 == 2) {
            fVar.c();
        } else if (i2 == 5) {
            fVar.g();
        } else {
            throw new IllegalStateException("Unexpected field encoding found!");
        }
    }
}
