package com.ss.videoarch.strategy.inferenceEngine.networkStrategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.videoarch.strategy.NativeObject;

public class NetworkProber extends NativeObject {

    /* renamed from: f  reason: collision with root package name */
    private static volatile NetworkProber f154516f;

    /* renamed from: a  reason: collision with root package name */
    public final int f154517a = 2;

    /* renamed from: b  reason: collision with root package name */
    private final String f154518b = "probe_udp";

    /* renamed from: c  reason: collision with root package name */
    private final String f154519c = "probe_quic";

    /* renamed from: d  reason: collision with root package name */
    private final String f154520d = "udp";

    /* renamed from: e  reason: collision with root package name */
    private final String f154521e = "tcp";

    static {
        Covode.recordClassIndex(102948);
    }

    private native int nativeNetworkReachableProbe(String str, String str2, int i2);

    private native long nativeUdpActionByCommand(int i2, String str, int i3, String str2);

    public static NetworkProber a() {
        MethodCollector.i(7700);
        if (f154516f == null) {
            synchronized (NetworkProber.class) {
                try {
                    if (f154516f == null) {
                        f154516f = new NetworkProber();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7700);
                    throw th;
                }
            }
        }
        NetworkProber networkProber = f154516f;
        MethodCollector.o(7700);
        return networkProber;
    }

    public final long a(int i2, String str, int i3, String str2) {
        long nativeNetworkReachableProbe;
        MethodCollector.i(7759);
        if (i2 == 0) {
            nativeNetworkReachableProbe = (long) nativeNetworkReachableProbe(str, "tcp", i3);
        } else if (i2 == 1 || i2 == 2) {
            long nativeUdpActionByCommand = nativeUdpActionByCommand(i2, str, i3, str2);
            MethodCollector.o(7759);
            return nativeUdpActionByCommand;
        } else {
            nativeNetworkReachableProbe = -1;
        }
        MethodCollector.o(7759);
        return nativeNetworkReachableProbe;
    }
}
