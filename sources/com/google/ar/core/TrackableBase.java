package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;

/* access modifiers changed from: package-private */
public class TrackableBase implements Trackable {
    long nativeHandle;
    protected final long nativeSymbolTableHandle;
    protected final Session session;

    static {
        Covode.recordClassIndex(33047);
    }

    TrackableBase(long j2, Session session2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2 == null ? 0 : session2.nativeSymbolTableHandle;
    }

    private native long nativeCreateAnchor(long j2, long j3, Pose pose);

    private native long[] nativeGetAnchors(long j2, long j3);

    private native int nativeGetTrackingState(long j2, long j3);

    private static native int nativeGetType(long j2, long j3);

    private static native void nativeReleaseTrackable(long j2, long j3);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(13018);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleaseTrackable(this.nativeSymbolTableHandle, j2);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.o(13018);
    }

    @Override // com.google.ar.core.Trackable
    public Collection<Anchor> getAnchors() {
        MethodCollector.i(13113);
        Session session2 = this.session;
        Collection<Anchor> convertNativeAnchorsToCollection = session2.convertNativeAnchorsToCollection(nativeGetAnchors(session2.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13113);
        return convertNativeAnchorsToCollection;
    }

    @Override // com.google.ar.core.Trackable
    public TrackingState getTrackingState() {
        MethodCollector.i(13111);
        TrackingState forNumber = TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13111);
        return forNumber;
    }

    @Override // com.google.ar.core.Trackable
    public Anchor createAnchor(Pose pose) {
        MethodCollector.i(13112);
        Anchor anchor = new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
        MethodCollector.o(13112);
        return anchor;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof TrackableBase) && ((TrackableBase) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    static int internalGetType(long j2, long j3) {
        MethodCollector.i(13197);
        int nativeGetType = nativeGetType(j2, j3);
        MethodCollector.o(13197);
        return nativeGetType;
    }

    static void internalReleaseNativeHandle(long j2, long j3) {
        MethodCollector.i(13196);
        nativeReleaseTrackable(j2, j3);
        MethodCollector.o(13196);
    }
}
