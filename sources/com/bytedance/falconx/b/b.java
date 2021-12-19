package com.bytedance.falconx.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.g.c;
import com.bytedance.geckox.i.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private c f28779a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f28780b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(16921);
    }

    @Override // com.bytedance.falconx.b.c
    public final String a() {
        return this.f28779a.f29895b;
    }

    @Override // com.bytedance.falconx.b.c
    public final Map<String, Long> b() {
        return this.f28779a.a();
    }

    @Override // com.bytedance.falconx.b.c
    public final InputStream a(String str) {
        MethodCollector.i(4673);
        if (!this.f28780b.get()) {
            a.a("GeckoResLoader ready to load, file:", str);
            c cVar = this.f28779a;
            if (cVar.f29894a.get()) {
                RuntimeException runtimeException = new RuntimeException("released");
                MethodCollector.o(4673);
                throw runtimeException;
            } else if (!TextUtils.isEmpty(str)) {
                com.bytedance.geckox.g.a a2 = cVar.a(str.trim());
                com.bytedance.geckox.g.b a3 = a2.a(a2.f29886a);
                String substring = str.substring(a2.f29886a.length() + 1);
                File file = a3.f29893a;
                File file2 = new File(file, "res" + File.separator + substring);
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    FileInputStream fileInputStream = new FileInputStream(file2.getCanonicalFile());
                    MethodCollector.o(4673);
                    return fileInputStream;
                }
                IOException iOException = new IOException("file not found");
                MethodCollector.o(4673);
                throw iOException;
            } else {
                RuntimeException runtimeException2 = new RuntimeException("relativePath empty");
                MethodCollector.o(4673);
                throw runtimeException2;
            }
        } else {
            RuntimeException runtimeException3 = new RuntimeException("released!");
            MethodCollector.o(4673);
            throw runtimeException3;
        }
    }

    public b(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        } else if (!TextUtils.isEmpty(str)) {
            this.f28779a = new c(context, str, file);
        } else {
            throw new RuntimeException("access key empty");
        }
    }
}
