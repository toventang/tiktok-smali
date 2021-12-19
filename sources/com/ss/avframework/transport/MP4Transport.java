package com.ss.avframework.transport;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.Transport;
import java.nio.Buffer;

public class MP4Transport extends NativeTransport {
    static {
        Covode.recordClassIndex(100571);
    }

    private native void nativeCreateNative(boolean z, boolean z2);

    /* access modifiers changed from: protected */
    public native void nativeStartRecord();

    /* access modifiers changed from: protected */
    public native void nativeStopRecord();

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.NativeObject
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i2) {
        super.sendPacket(buffer, i2);
    }

    public MP4Transport(boolean z, boolean z2) {
        MethodCollector.i(13837);
        nativeCreateNative(z, z2);
        MethodCollector.o(13837);
    }
}
