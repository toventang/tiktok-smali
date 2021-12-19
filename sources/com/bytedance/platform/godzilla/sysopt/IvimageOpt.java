package com.bytedance.platform.godzilla.sysopt;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public final class IvimageOpt {
    public static native void end();

    public static native void start();

    private IvimageOpt() {
    }

    static {
        Covode.recordClassIndex(25663);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("godzilla-sysopt", false, (Context) null);
        m.a(uptimeMillis, "godzilla-sysopt");
    }
}
