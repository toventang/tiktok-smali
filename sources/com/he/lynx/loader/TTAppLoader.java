package com.he.lynx.loader;

import android.content.ContextWrapper;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class TTAppLoader {
    private long _ptr;
    public final Loader impl;

    static {
        Covode.recordClassIndex(34217);
    }

    private static native void nativeCleanup();

    public static native void nativeReject(long j2, String str);

    public static native void nativeResolve(long j2, ByteBuffer byteBuffer);

    public static native void nativeResolveBytes(long j2, byte[] bArr, int i2, int i3);

    public static native void nativeResolveFile(long j2, String str);

    public final native void setup(String str, int i2);

    public final void cleanup() {
        MethodCollector.i(5496);
        this._ptr = 0;
        nativeCleanup();
        MethodCollector.o(5496);
    }

    public TTAppLoader(Loader loader) {
        this.impl = loader;
    }

    private byte[] reflectedLoadSync(String str) {
        return this.impl.loadSync(str);
    }

    public final Uri loadMedia(String str) {
        return this.impl.loadMedia(str);
    }

    private String reflectedLoadMedia(String str) {
        Uri loadMedia = this.impl.loadMedia(str);
        if (loadMedia == null) {
            return null;
        }
        return loadMedia.toString();
    }

    public final void setup(ContextWrapper contextWrapper) {
        MethodCollector.i(5494);
        setup(null, 0);
        MethodCollector.o(5494);
    }

    static final class ResolverImpl implements Resolver {
        final long id;
        final String path;
        boolean resolved;

        static {
            Covode.recordClassIndex(34218);
        }

        @Override // com.he.lynx.loader.Resolver
        public final void reject(IOException iOException) {
            MethodCollector.i(5453);
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeReject(this.id, iOException.getMessage());
                MethodCollector.o(5453);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.o(5453);
            throw runtimeException;
        }

        @Override // com.he.lynx.loader.Resolver
        public final void resolve(File file) {
            MethodCollector.i(5451);
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveFile(this.id, file.getPath());
                MethodCollector.o(5451);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.o(5451);
            throw runtimeException;
        }

        @Override // com.he.lynx.loader.Resolver
        public final void resolve(ByteBuffer byteBuffer) {
            MethodCollector.i(5448);
            if (!this.resolved) {
                this.resolved = true;
                if (byteBuffer.isDirect()) {
                    TTAppLoader.nativeResolve(this.id, byteBuffer);
                    MethodCollector.o(5448);
                    return;
                }
                byte[] array = byteBuffer.array();
                TTAppLoader.nativeResolveBytes(this.id, array, 0, array.length);
                MethodCollector.o(5448);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.o(5448);
            throw runtimeException;
        }

        ResolverImpl(String str, long j2) {
            this.path = str;
            this.id = j2;
        }

        @Override // com.he.lynx.loader.Resolver
        public final void resolve(byte[] bArr, int i2, int i3) {
            MethodCollector.i(5446);
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveBytes(this.id, bArr, i2, i3);
                MethodCollector.o(5446);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.o(5446);
            throw runtimeException;
        }
    }

    private void reflectedLoad(String str, long j2) {
        this.impl.load(str, new ResolverImpl(str, j2));
    }

    private void reflectedLoadUrl(String str, long j2) {
        this.impl.loadUrl(str, new ResolverImpl(str, j2));
    }

    private void reflectedPostUrl(String str, byte[] bArr, String str2, long j2) {
        try {
            this.impl.getClass().getDeclaredMethod(UGCMonitor.TYPE_POST, String.class, byte[].class, String.class, Resolver.class).invoke(this.impl, str, bArr, str2, new ResolverImpl(str, j2));
        } catch (ReflectiveOperationException e2) {
            e2.printStackTrace();
        }
    }
}
