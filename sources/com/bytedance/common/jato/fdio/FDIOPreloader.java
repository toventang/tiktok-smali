package com.bytedance.common.jato.fdio;

import android.content.Context;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class FDIOPreloader implements b {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f26851a = Jato.getWorkExecutorService();

    /* renamed from: b  reason: collision with root package name */
    private Context f26852b = Jato.getContext();

    static {
        Covode.recordClassIndex(15836);
    }

    private static native void nativeStartPreload(String str, boolean z);

    @Override // com.bytedance.common.jato.fdio.b
    public final void a(boolean z) {
    }

    @Override // com.bytedance.common.jato.fdio.b
    public final void a(String str, boolean z) {
        MethodCollector.i(7318);
        if (str.isEmpty() || this.f26852b == null || this.f26851a == null) {
            MethodCollector.o(7318);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Context context = this.f26852b;
        if (d.f107194b == null || !d.f107197e) {
            d.f107194b = context.getCacheDir();
        }
        File file = new File(sb.append(d.f107194b.getAbsolutePath()).append(File.separator).append("jato_fdio").append(File.separator).append(str).toString());
        if (file.exists()) {
            nativeStartPreload(file.getAbsolutePath(), z);
        }
        MethodCollector.o(7318);
    }
}
