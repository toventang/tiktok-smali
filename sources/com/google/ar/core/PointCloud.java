package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class PointCloud implements Closeable {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33035);
    }

    protected PointCloud() {
    }

    private native ByteBuffer nativeGetData(long j2, long j3);

    private native ByteBuffer nativeGetIds(long j2, long j3);

    private native long nativeGetTimestamp(long j2, long j3);

    private native void nativeReleasePointCloud(long j2, long j3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        MethodCollector.i(10889);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleasePointCloud(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(10889);
    }

    public void release() {
        MethodCollector.i(10888);
        nativeReleasePointCloud(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0;
        MethodCollector.o(10888);
    }

    public IntBuffer getIds() {
        MethodCollector.i(11059);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            IntBuffer asIntBuffer = Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j2)).asIntBuffer();
            MethodCollector.o(11059);
            return asIntBuffer;
        }
        DeadlineExceededException deadlineExceededException = new DeadlineExceededException();
        MethodCollector.o(11059);
        throw deadlineExceededException;
    }

    public FloatBuffer getPoints() {
        MethodCollector.i(10890);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            FloatBuffer asFloatBuffer = Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j2)).asFloatBuffer();
            MethodCollector.o(10890);
            return asFloatBuffer;
        }
        DeadlineExceededException deadlineExceededException = new DeadlineExceededException();
        MethodCollector.o(10890);
        throw deadlineExceededException;
    }

    public long getTimestamp() {
        MethodCollector.i(11371);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, j2);
            MethodCollector.o(11371);
            return nativeGetTimestamp;
        }
        DeadlineExceededException deadlineExceededException = new DeadlineExceededException();
        MethodCollector.o(11371);
        throw deadlineExceededException;
    }

    PointCloud(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
