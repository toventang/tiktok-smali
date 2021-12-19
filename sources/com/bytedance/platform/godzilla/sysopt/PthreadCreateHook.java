package com.bytedance.platform.godzilla.sysopt;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class PthreadCreateHook {
    public static native void end();

    public static native void start(int i2);

    private PthreadCreateHook() {
    }

    static {
        Covode.recordClassIndex(25664);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("godzilla-sysopt", false, (Context) null);
        m.a(uptimeMillis, "godzilla-sysopt");
    }
}
