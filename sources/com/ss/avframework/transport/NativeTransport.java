package com.ss.avframework.transport;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.Transport;
import java.nio.Buffer;

/* access modifiers changed from: package-private */
public class NativeTransport extends Transport {
    static {
        Covode.recordClassIndex(100572);
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(14269);
        super.release();
        MethodCollector.o(14269);
    }

    private static boolean isNativeTransportInstence(Object obj) {
        return obj instanceof NativeTransport;
    }

    @Override // com.ss.avframework.engine.Transport
    public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.avframework.engine.Transport
    public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.avframework.engine.Transport
    public void sendPacket(Buffer buffer, int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
