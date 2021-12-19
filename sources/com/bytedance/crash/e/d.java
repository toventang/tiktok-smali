package com.bytedance.crash.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.runtime.a.e;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import java.io.File;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27537a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f27538b;

    static {
        Covode.recordClassIndex(16178);
    }

    public d(Context context, boolean z) {
        this.f27537a = context;
        this.f27538b = z;
    }

    @Override // com.bytedance.crash.e.c
    public final void a(long j2, Thread thread, Throwable th, String str, String str2, boolean z) {
        File file = new File(r.a(this.f27537a), str);
        file.mkdirs();
        int d2 = j.d(file);
        e.a().a(CrashType.JAVA, null, new e(ab.c(th), th, j2, str2, z, thread, str, file, this.f27538b), true);
        if (d2 > 0) {
            NativeTools.a().b(d2);
        }
    }
}
