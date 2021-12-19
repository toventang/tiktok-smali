package com.bytedance.realx;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.List;

public class RTCCapabilities {
    private List<String> supportedVideoCodecs;

    static {
        Covode.recordClassIndex(25924);
    }

    private static native String[] nativeGetSupportedVideoCodecs(long j2);

    public List<String> getSupportedVideoCodecs() {
        return this.supportedVideoCodecs;
    }

    public RTCCapabilities(List<String> list) {
        this.supportedVideoCodecs = list;
    }

    public RTCCapabilities(long j2) {
        MethodCollector.i(9382);
        this.supportedVideoCodecs = Arrays.asList(nativeGetSupportedVideoCodecs(j2));
        MethodCollector.o(9382);
    }
}
