package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.util.UUID;

public class ExternalDataTrack {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33017);
    }

    protected ExternalDataTrack() {
    }

    private static native long nativeCreateExternalDataTrack(long j2);

    private static native void nativeDestroyExternalDataTrack(long j2, long j3);

    private native void nativeSetMimeType(long j2, long j3, String str);

    private native void nativeSetTrackId(long j2, long j3, byte[] bArr);

    private native void nativeSetTrackMetadata(long j2, long j3, byte[] bArr);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(14407);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyExternalDataTrack(this.nativeSymbolTableHandle, j2);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.o(14407);
    }

    public ExternalDataTrack setMimeType(String str) {
        MethodCollector.i(14440);
        nativeSetMimeType(this.session.nativeWrapperHandle, this.nativeHandle, str);
        MethodCollector.o(14440);
        return this;
    }

    public ExternalDataTrack setTrackMetadata(ByteBuffer byteBuffer) {
        MethodCollector.i(14425);
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeSetTrackMetadata(this.session.nativeWrapperHandle, this.nativeHandle, bArr);
        MethodCollector.o(14425);
        return this;
    }

    public ExternalDataTrack(Session session2, UUID uuid) {
        MethodCollector.i(14406);
        this.session = session2;
        this.nativeHandle = nativeCreateExternalDataTrack(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        nativeSetTrackId(session2.nativeWrapperHandle, this.nativeHandle, wrap.array());
        MethodCollector.o(14406);
    }
}
