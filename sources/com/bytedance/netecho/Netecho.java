package com.bytedance.netecho;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.IcmpPacketResult;
import com.bytedance.netecho.result.TcpDetectResult;
import h.f.b.l;
import h.f.b.z;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class Netecho {
    public static final Netecho INSTANCE = new Netecho();
    private static final String LIB_NAME = LIB_NAME;
    private static final int STAGE_ATON = 1;
    private static final int STAGE_FINISH = 6;
    private static final int STAGE_RECV = 5;
    private static final int STAGE_SEND = 4;
    private static final int STAGE_SET_OPT = 3;
    private static final int STAGE_SOCKET = 2;
    private static final String TAG = TAG;

    private static final native IcmpDetectResult nativeDetectIcmp(String str, long j2, int i2);

    private static final native IcmpDetectResult nativeDetectIcmpV6(String str, int i2, long j2, int i3);

    private static final native TcpDetectResult nativeDetectTcp(String str, int i2, long j2);

    private static final native TcpDetectResult nativeDetectTcpV6(String str, int i2, long j2);

    private Netecho() {
    }

    static {
        Covode.recordClassIndex(25439);
        NetechoConfig.INSTANCE.getLoadLibrary().invoke(LIB_NAME);
    }

    public static final IcmpPacketResult[] createIcmpPacketResultsArray(int i2) {
        IcmpPacketResult[] icmpPacketResultArr = new IcmpPacketResult[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            icmpPacketResultArr[i3] = null;
        }
        return icmpPacketResultArr;
    }

    public final DnsResolveResult resolveDns(String str, long j2) {
        l.c(str, "");
        z.e eVar = new z.e();
        boolean z = true;
        eVar.element = (T) new CountDownLatch(1);
        z.e eVar2 = new z.e();
        eVar2.element = null;
        z.e eVar3 = new z.e();
        eVar3.element = null;
        new Thread(new Netecho$resolveDns$1(eVar2, str, eVar3, eVar)).start();
        eVar.element.await(j2, TimeUnit.MILLISECONDS);
        if (eVar2.element == null) {
            z = false;
        }
        return new DnsResolveResult(z, eVar2.element, eVar3.element);
    }

    public static final TcpDetectResult createTcpDetectResult(boolean z, int i2, int i3) {
        return new TcpDetectResult(z, i2, i3);
    }

    public final IcmpDetectResult detectIcmp(String str, long j2, int i2) {
        MethodCollector.i(4772);
        l.c(str, "");
        IcmpDetectResult nativeDetectIcmp = nativeDetectIcmp(str, j2, i2);
        MethodCollector.o(4772);
        return nativeDetectIcmp;
    }

    public final TcpDetectResult detectTcp(String str, int i2, long j2) {
        MethodCollector.i(165);
        l.c(str, "");
        TcpDetectResult nativeDetectTcp = nativeDetectTcp(str, i2, j2);
        MethodCollector.o(165);
        return nativeDetectTcp;
    }

    public final TcpDetectResult detectTcpV6(String str, int i2, long j2) {
        MethodCollector.i(170);
        l.c(str, "");
        TcpDetectResult nativeDetectTcpV6 = nativeDetectTcpV6(str, i2, j2);
        MethodCollector.o(170);
        return nativeDetectTcpV6;
    }

    public static final IcmpDetectResult createIcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i2, int i3) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i2, i3);
    }

    public final IcmpDetectResult detectIcmpV6(String str, int i2, long j2, int i3) {
        MethodCollector.i(168);
        l.c(str, "");
        IcmpDetectResult nativeDetectIcmpV6 = nativeDetectIcmpV6(str, i2, j2, i3);
        MethodCollector.o(168);
        return nativeDetectIcmpV6;
    }

    public static final void addIcmpPacketResultToArray(IcmpPacketResult[] icmpPacketResultArr, int i2, boolean z, int i3, float f2, int i4) {
        l.c(icmpPacketResultArr, "");
        icmpPacketResultArr[i2] = new IcmpPacketResult(z, i3, f2, i4);
    }
}
