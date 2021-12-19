package com.ss.android.ugc.aweme.filter.d.a;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.internal.m;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.io.File;

public final class f implements m {
    static {
        Covode.recordClassIndex(60532);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.m
    public final void a(File file) {
        l.d(file, "");
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.m
    public final void a(int i2, File file, Exception exc) {
        l.d(file, "");
        g.a().I().a("filter unzip error" + i2 + " filterZipFile path ->" + file.getPath() + " filterZipFile path exit ->" + file.exists());
        g.a().I().a(Log.getStackTraceString(exc));
    }
}
