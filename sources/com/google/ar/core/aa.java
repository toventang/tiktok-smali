package com.google.ar.core;

import a.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

final class aa extends a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArImage f53393a;

    /* renamed from: b  reason: collision with root package name */
    private final long f53394b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53395c;

    static {
        Covode.recordClassIndex(33051);
    }

    public final ByteBuffer getBuffer() {
        MethodCollector.i(11826);
        ArImage arImage = this.f53393a;
        ByteBuffer asReadOnlyBuffer = arImage.nativeGetBuffer(arImage.session.nativeWrapperHandle, this.f53394b, this.f53395c).asReadOnlyBuffer();
        MethodCollector.o(11826);
        return asReadOnlyBuffer;
    }

    public final int getPixelStride() {
        MethodCollector.i(11825);
        ArImage arImage = this.f53393a;
        int nativeGetPixelStride = arImage.nativeGetPixelStride(arImage.session.nativeWrapperHandle, this.f53394b, this.f53395c);
        if (nativeGetPixelStride != -1) {
            MethodCollector.o(11825);
            return nativeGetPixelStride;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
        MethodCollector.o(11825);
        throw fatalException;
    }

    public final int getRowStride() {
        MethodCollector.i(11661);
        ArImage arImage = this.f53393a;
        int nativeGetRowStride = arImage.nativeGetRowStride(arImage.session.nativeWrapperHandle, this.f53394b, this.f53395c);
        if (nativeGetRowStride != -1) {
            MethodCollector.o(11661);
            return nativeGetRowStride;
        }
        FatalException fatalException = new FatalException("Unknown error in ArImage.Plane.getRowStride().");
        MethodCollector.o(11661);
        throw fatalException;
    }

    public aa(ArImage arImage, long j2, int i2) {
        this.f53393a = arImage;
        this.f53394b = j2;
        this.f53395c = i2;
    }
}
