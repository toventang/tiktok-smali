package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imageutils.b;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class NativeMemoryChunk implements r, Closeable {
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    public static int com_facebook_imagepipeline_memory_NativeMemoryChunk_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    private static native long nativeAllocate(int i2);

    private static native void nativeCopyFromByteArray(long j2, byte[] bArr, int i2, int i3);

    private static native void nativeCopyToByteArray(long j2, byte[] bArr, int i2, int i3);

    private static native void nativeFree(long j2);

    private static native void nativeMemcpy(long j2, long j3, int i2);

    private static native byte nativeReadByte(long j2);

    @Override // com.facebook.imagepipeline.memory.r
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public int getSize() {
        return this.mSize;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    static {
        Covode.recordClassIndex(29035);
        b.a("imagepipeline");
    }

    @Override // com.facebook.imagepipeline.memory.r
    public synchronized boolean isClosed() {
        boolean z;
        MethodCollector.i(14490);
        z = this.mIsClosed;
        MethodCollector.o(14490);
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.facebook.imagepipeline.memory.r
    public synchronized void close() {
        MethodCollector.i(14489);
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
        MethodCollector.o(14489);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!isClosed()) {
            com_facebook_imagepipeline_memory_NativeMemoryChunk_com_ss_android_ugc_aweme_lancet_LogLancet_w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public NativeMemoryChunk(int i2) {
        boolean z;
        MethodCollector.i(14488);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        this.mSize = i2;
        this.mNativePtr = nativeAllocate(i2);
        this.mIsClosed = false;
        MethodCollector.o(14488);
    }

    @Override // com.facebook.imagepipeline.memory.r
    public synchronized byte read(int i2) {
        boolean z;
        boolean z2;
        byte nativeReadByte;
        MethodCollector.i(14509);
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
        if (i2 >= this.mSize) {
            z3 = false;
        }
        i.a(z3);
        nativeReadByte = nativeReadByte(this.mNativePtr + ((long) i2));
        MethodCollector.o(14509);
        return nativeReadByte;
    }

    private void doCopy(int i2, r rVar, int i3, int i4) {
        MethodCollector.i(14530);
        if (rVar instanceof NativeMemoryChunk) {
            i.b(!isClosed());
            i.b(!rVar.isClosed());
            t.a(i2, rVar.getSize(), i3, i4, this.mSize);
            nativeMemcpy(rVar.getNativePtr() + ((long) i3), this.mNativePtr + ((long) i2), i4);
            MethodCollector.o(14530);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        MethodCollector.o(14530);
        throw illegalArgumentException;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public synchronized int write(int i2, byte[] bArr, int i3, int i4) {
        boolean z;
        int a2;
        MethodCollector.i(14507);
        i.a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        a2 = t.a(i2, i4, this.mSize);
        t.a(i2, bArr.length, i3, a2, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i2), bArr, i3, a2);
        MethodCollector.o(14507);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public synchronized int read(int i2, byte[] bArr, int i3, int i4) {
        boolean z;
        int a2;
        MethodCollector.i(14508);
        i.a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        a2 = t.a(i2, i4, this.mSize);
        t.a(i2, bArr.length, i3, a2, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i2), bArr, i3, a2);
        MethodCollector.o(14508);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public void copy(int i2, r rVar, int i3, int i4) {
        MethodCollector.i(14522);
        i.a(rVar);
        if (rVar.getUniqueId() == getUniqueId()) {
            com_facebook_imagepipeline_memory_NativeMemoryChunk_com_ss_android_ugc_aweme_lancet_LogLancet_w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(rVar)) + " which share the same address " + Long.toHexString(this.mNativePtr));
            i.a(false);
        }
        if (rVar.getUniqueId() < getUniqueId()) {
            synchronized (rVar) {
                try {
                    synchronized (this) {
                        try {
                            doCopy(i2, rVar, i3, i4);
                        } finally {
                            MethodCollector.o(14522);
                        }
                    }
                } finally {
                    MethodCollector.o(14522);
                }
            }
            return;
        }
        synchronized (this) {
            try {
                synchronized (rVar) {
                    try {
                        doCopy(i2, rVar, i3, i4);
                    } finally {
                        MethodCollector.o(14522);
                    }
                }
            } finally {
                MethodCollector.o(14522);
            }
        }
    }
}
