package com.bytedance.frameworks.baselib.network.http.d.a.a.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f29109a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static final String f29110b = d.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static String f29111c = "2001:4860:4860::8888";

    static {
        Covode.recordClassIndex(17041);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (0 == 0) goto L_0x0041;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            r4 = 0
            r0 = 0
            java.net.DatagramSocket r3 = new java.net.DatagramSocket     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r3.<init>()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.d.a.a.a.d.f29111c     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            r0 = 53
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            r3.connect(r2)     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            java.net.InetAddress r1 = r3.getLocalAddress()     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            boolean r0 = r1 instanceof java.net.Inet6Address     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            if (r0 == 0) goto L_0x003e
            boolean r0 = r1.isLinkLocalAddress()     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            r2 = r0 ^ 1
            java.lang.String r1 = r1.getHostAddress()     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            java.lang.String r0 = "2001:0000"
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException -> 0x0038, all -> 0x002e }
            if (r0 == 0) goto L_0x003d
            goto L_0x003e
        L_0x002e:
            r0 = move-exception
            r3.close()
            goto L_0x0034
        L_0x0033:
            r0 = move-exception
        L_0x0034:
            throw r0
        L_0x0035:
            if (r0 == 0) goto L_0x0041
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            r0.close()
            goto L_0x0041
        L_0x003d:
            r4 = r2
        L_0x003e:
            r3.close()
        L_0x0041:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.a.a.d.a():boolean");
    }
}
