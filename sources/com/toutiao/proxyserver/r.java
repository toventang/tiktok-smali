package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;

public class r extends b {

    /* renamed from: k  reason: collision with root package name */
    final File f154949k;

    static {
        Covode.recordClassIndex(103182);
    }

    @Override // com.toutiao.proxyserver.b
    public File a(String str) {
        return f(str);
    }

    @Override // com.toutiao.proxyserver.b
    public final File e(String str) {
        return f(str);
    }

    public final File f(String str) {
        return new File(this.f154949k, str);
    }

    public r(File file) {
        String str;
        if (file == null) {
            str = "dir null";
        } else if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        } else {
            this.f154949k = file;
            return;
        }
        throw new IOException("dir error! ".concat(String.valueOf(str)));
    }
}
