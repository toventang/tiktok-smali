package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

final class g implements ReadableByteChannel {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f155688a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f155689b = new AtomicBoolean(true);

    static {
        Covode.recordClassIndex(103494);
    }

    public final boolean isOpen() {
        return this.f155689b.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f155689b.compareAndSet(true, false)) {
            this.f155688a.close();
        }
    }

    private g(InputStream inputStream) {
        this.f155688a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new g(inputStream);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int read;
        MethodCollector.i(12607);
        if (byteBuffer.hasArray()) {
            read = this.f155688a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
                byteBuffer.position(byteBuffer.position() + read);
            }
        } else {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.f155688a.available(), 4096), byteBuffer.remaining()))];
            read = this.f155688a.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
        }
        MethodCollector.o(12607);
        return read;
    }
}
