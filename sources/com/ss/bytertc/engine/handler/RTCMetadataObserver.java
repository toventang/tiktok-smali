package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import java.lang.ref.WeakReference;

public class RTCMetadataObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(100959);
    }

    public RTCMetadataObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public byte[] onReadyToSendMetadata(long j2) {
        IMetadataObserver metadataObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl == null || (metadataObserver = rTCEngineImpl.getMetadataObserver()) == null) {
            return null;
        }
        return metadataObserver.onReadyToSendMetadata(j2);
    }

    /* access modifiers changed from: package-private */
    public void onMetadataReceived(byte[] bArr, String str, long j2) {
        IMetadataObserver metadataObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (metadataObserver = rTCEngineImpl.getMetadataObserver()) != null) {
            metadataObserver.onMetadataReceived(bArr, str, j2);
        }
    }
}
