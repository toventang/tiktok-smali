package com.bytedance.liko.c;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import h.a.z;
import java.io.File;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40084a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(24699);
    }

    public static final List<String> a() {
        try {
            return com.bytedance.liko.c.a.a.a(new File("/proc/" + Process.myPid() + "/fd"));
        } catch (Throwable unused) {
            return z.INSTANCE;
        }
    }
}
