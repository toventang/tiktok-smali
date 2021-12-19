package com.ss.avframework.transport;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.Transport;
import com.ss.avframework.statics.StaticsReport;
import java.nio.Buffer;

public class RTMPTransport extends NativeTransport {
    static {
        Covode.recordClassIndex(100573);
    }

    private native void nativeCreateNative(boolean z, boolean z2);

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeReleaseNative();

    private native boolean nativeSetupUrl(String str);

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

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface, com.ss.avframework.engine.Transport
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.i(13517);
        super.getStaticsReport(staticsReport);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(staticsReport);
        MethodCollector.o(13517);
        return nativeGetStaticsReport;
    }

    @Override // com.ss.avframework.engine.Transport
    public boolean setupUrl(String str) {
        boolean z;
        MethodCollector.i(13426);
        if (str != null) {
            z = nativeSetupUrl(str);
        } else {
            z = false;
        }
        MethodCollector.o(13426);
        return z;
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i2) {
        super.sendPacket(buffer, i2);
    }

    public RTMPTransport(boolean z, boolean z2) {
        MethodCollector.i(13425);
        nativeCreateNative(z, z2);
        MethodCollector.o(13425);
    }
}
