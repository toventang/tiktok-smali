package com.google.ar.core;

import a.a.b;
import android.graphics.Rect;
import android.media.Image;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

public class ArImage extends b {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    public final Session session;

    static {
        Covode.recordClassIndex(32990);
    }

    private native void nativeClose(long j2, long j3);

    private native int nativeGetFormat(long j2, long j3);

    private native int nativeGetHeight(long j2, long j3);

    private native int nativeGetNumberOfPlanes(long j2, long j3);

    private native long nativeGetTimestamp(long j2, long j3);

    private native int nativeGetWidth(long j2, long j3);

    static native void nativeLoadSymbols();

    public native ByteBuffer nativeGetBuffer(long j2, long j3, int i2);

    public native int nativeGetPixelStride(long j2, long j3, int i2);

    public native int nativeGetRowStride(long j2, long j3, int i2);

    public Rect getCropRect() {
        throw new UnsupportedOperationException("Crop rect is unknown in this image.");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        MethodCollector.i(14419);
        nativeClose(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0;
        MethodCollector.o(14419);
    }

    public int getFormat() {
        MethodCollector.i(14420);
        int nativeGetFormat = nativeGetFormat(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetFormat != -1) {
            MethodCollector.o(14420);
            return nativeGetFormat;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getFormat().");
        MethodCollector.o(14420);
        throw fatalException;
    }

    public int getHeight() {
        MethodCollector.i(14451);
        int nativeGetHeight = nativeGetHeight(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetHeight != -1) {
            MethodCollector.o(14451);
            return nativeGetHeight;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getHeight().");
        MethodCollector.o(14451);
        throw fatalException;
    }

    public Image.Plane[] getPlanes() {
        MethodCollector.i(14467);
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetNumberOfPlanes != -1) {
            aa[] aaVarArr = new aa[nativeGetNumberOfPlanes];
            for (int i2 = 0; i2 < nativeGetNumberOfPlanes; i2++) {
                aaVarArr[i2] = new aa(this, this.nativeHandle, i2);
            }
            MethodCollector.o(14467);
            return aaVarArr;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getPlanes().");
        MethodCollector.o(14467);
        throw fatalException;
    }

    public long getTimestamp() {
        MethodCollector.i(14421);
        long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetTimestamp != -1) {
            MethodCollector.o(14421);
            return nativeGetTimestamp;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getTimestamp().");
        MethodCollector.o(14421);
        throw fatalException;
    }

    public int getWidth() {
        MethodCollector.i(14435);
        int nativeGetWidth = nativeGetWidth(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetWidth != -1) {
            MethodCollector.o(14435);
            return nativeGetWidth;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.getWidth().");
        MethodCollector.o(14435);
        throw fatalException;
    }

    public void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    public void setTimestamp(long j2) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    ArImage(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
