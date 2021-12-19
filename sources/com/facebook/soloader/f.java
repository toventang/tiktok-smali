package com.facebook.soloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

public final class f implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final FileOutputStream f49211a;

    /* renamed from: b  reason: collision with root package name */
    private final FileLock f49212b;

    static {
        Covode.recordClassIndex(30765);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            FileLock fileLock = this.f49212b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f49211a.close();
        }
    }

    f(File file) {
        MethodCollector.i(5837);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f49211a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f49212b = lock;
            MethodCollector.o(5837);
        } catch (Throwable th) {
            this.f49211a.close();
            MethodCollector.o(5837);
            throw th;
        }
    }
}
