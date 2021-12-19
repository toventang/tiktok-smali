package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.nio.ByteBuffer;

public final class i implements r, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f48091a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48092b;

    /* renamed from: c  reason: collision with root package name */
    private final long f48093c = ((long) System.identityHashCode(this));

    static {
        Covode.recordClassIndex(29055);
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final int getSize() {
        return this.f48092b;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final long getUniqueId() {
        return this.f48093c;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final synchronized ByteBuffer getByteBuffer() {
        ByteBuffer byteBuffer;
        MethodCollector.i(14635);
        byteBuffer = this.f48091a;
        MethodCollector.o(14635);
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.facebook.imagepipeline.memory.r
    public final synchronized void close() {
        MethodCollector.i(14613);
        this.f48091a = null;
        MethodCollector.o(14613);
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final synchronized boolean isClosed() {
        MethodCollector.i(14614);
        if (this.f48091a == null) {
            MethodCollector.o(14614);
            return true;
        }
        MethodCollector.o(14614);
        return false;
    }

    public i(int i2) {
        this.f48091a = ByteBuffer.allocateDirect(i2);
        this.f48092b = i2;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final synchronized byte read(int i2) {
        boolean z;
        boolean z2;
        byte b2;
        MethodCollector.i(14623);
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        com.facebook.common.d.i.b(z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.facebook.common.d.i.a(z2);
        if (i2 >= this.f48092b) {
            z3 = false;
        }
        com.facebook.common.d.i.a(z3);
        b2 = this.f48091a.get(i2);
        MethodCollector.o(14623);
        return b2;
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final synchronized int write(int i2, byte[] bArr, int i3, int i4) {
        boolean z;
        int a2;
        MethodCollector.i(14621);
        com.facebook.common.d.i.a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        com.facebook.common.d.i.b(z);
        a2 = t.a(i2, i4, this.f48092b);
        t.a(i2, bArr.length, i3, a2, this.f48092b);
        this.f48091a.position(i2);
        this.f48091a.put(bArr, i3, a2);
        MethodCollector.o(14621);
        return a2;
    }

    private void a(int i2, r rVar, int i3, int i4) {
        if (rVar instanceof i) {
            com.facebook.common.d.i.b(!isClosed());
            com.facebook.common.d.i.b(!rVar.isClosed());
            t.a(i2, rVar.getSize(), i3, i4, this.f48092b);
            this.f48091a.position(i2);
            rVar.getByteBuffer().position(i3);
            byte[] bArr = new byte[i4];
            this.f48091a.get(bArr, 0, i4);
            rVar.getByteBuffer().put(bArr, 0, i4);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final void copy(int i2, r rVar, int i3, int i4) {
        MethodCollector.i(14634);
        com.facebook.common.d.i.a(rVar);
        if (rVar.getUniqueId() == getUniqueId()) {
            Long.toHexString(getUniqueId());
            Long.toHexString(rVar.getUniqueId());
            com.facebook.common.d.i.a(false);
        }
        if (rVar.getUniqueId() < getUniqueId()) {
            synchronized (rVar) {
                try {
                    synchronized (this) {
                        try {
                            a(i2, rVar, i3, i4);
                        } finally {
                            MethodCollector.o(14634);
                        }
                    }
                } finally {
                    MethodCollector.o(14634);
                }
            }
            return;
        }
        synchronized (this) {
            try {
                synchronized (rVar) {
                    try {
                        a(i2, rVar, i3, i4);
                    } finally {
                        MethodCollector.o(14634);
                    }
                }
            } finally {
                MethodCollector.o(14634);
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.r
    public final synchronized int read(int i2, byte[] bArr, int i3, int i4) {
        boolean z;
        int a2;
        MethodCollector.i(14622);
        com.facebook.common.d.i.a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        com.facebook.common.d.i.b(z);
        a2 = t.a(i2, i4, this.f48092b);
        t.a(i2, bArr.length, i3, a2, this.f48092b);
        this.f48091a.position(i2);
        this.f48091a.get(bArr, i3, a2);
        MethodCollector.o(14622);
        return a2;
    }
}
