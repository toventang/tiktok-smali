package com.bytedance.apm.k.c;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private a f25096a;

    static {
        Covode.recordClassIndex(14651);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static e f25097a = new e((byte) 0);

        static {
            Covode.recordClassIndex(14652);
        }
    }

    private e() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25096a = new b();
        } else {
            this.f25096a = new c();
        }
    }

    /* synthetic */ e(byte b2) {
        this();
    }
}
