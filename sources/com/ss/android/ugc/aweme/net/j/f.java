package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f112410a = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final f f112411b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static Long f112412c;

    /* renamed from: d  reason: collision with root package name */
    private static e f112413d;

    private f() {
    }

    static {
        Covode.recordClassIndex(72250);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r3 - r0) > 60000) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.net.j.e a() {
        /*
            com.ss.android.ugc.aweme.net.j.e r0 = com.ss.android.ugc.aweme.net.j.f.f112413d     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x001b
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003c }
            java.lang.Long r0 = com.ss.android.ugc.aweme.net.j.f.f112412c     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0011
            long r0 = r0.longValue()     // Catch:{ all -> 0x003c }
            goto L_0x0013
        L_0x0011:
            r0 = 0
        L_0x0013:
            long r3 = r3 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0035
        L_0x001b:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.a()     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "network_monitor_manager_config"
            java.lang.Class<com.ss.android.ugc.aweme.net.j.e> r0 = com.ss.android.ugc.aweme.net.j.e.class
            java.lang.Object r0 = r2.a(r1, r0)     // Catch:{ all -> 0x003c }
            com.ss.android.ugc.aweme.net.j.e r0 = (com.ss.android.ugc.aweme.net.j.e) r0     // Catch:{ all -> 0x003c }
            com.ss.android.ugc.aweme.net.j.f.f112413d = r0     // Catch:{ all -> 0x003c }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x003c }
            com.ss.android.ugc.aweme.net.j.f.f112412c = r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            com.ss.android.ugc.aweme.net.j.e r0 = com.ss.android.ugc.aweme.net.j.f.f112413d     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0042
            com.ss.android.ugc.aweme.net.j.e r0 = com.ss.android.ugc.aweme.net.j.f.f112410a     // Catch:{ all -> 0x003c }
            goto L_0x0042
        L_0x003c:
            com.ss.android.ugc.aweme.net.j.e r0 = com.ss.android.ugc.aweme.net.j.f.f112413d
            if (r0 != 0) goto L_0x0042
            com.ss.android.ugc.aweme.net.j.e r0 = com.ss.android.ugc.aweme.net.j.f.f112410a
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.j.f.a():com.ss.android.ugc.aweme.net.j.e");
    }
}
