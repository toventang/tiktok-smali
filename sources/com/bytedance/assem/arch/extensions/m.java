package com.bytedance.assem.arch.extensions;

import android.os.Build;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {
    static {
        Covode.recordClassIndex(14926);
    }

    private static boolean a(e eVar) {
        l.c(eVar, "");
        if (eVar.isFinishing()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (eVar.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static final boolean a(e eVar, androidx.lifecycle.m mVar) {
        l.c(eVar, "");
        l.c(mVar, "");
        if (!a(eVar)) {
            return false;
        }
        i lifecycle = mVar.getLifecycle();
        l.a((Object) lifecycle, "");
        if (lifecycle.a() == i.b.DESTROYED) {
            return false;
        }
        return true;
    }
}
