package com.ss.android.ugc.aweme.utils;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerTrackingRequestListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f143179a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f143180b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f143181c = true;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f143182d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final r f143183e = new r();

    /* renamed from: f  reason: collision with root package name */
    private static final Keva f143184f = Keva.getRepo("tpc_consent");

    /* renamed from: g  reason: collision with root package name */
    private static boolean f143185g;

    public static final class a implements AppsFlyerTrackingRequestListener {
        static {
            Covode.recordClassIndex(93722);
        }

        @Override // com.appsflyer.AppsFlyerTrackingRequestListener
        public final void onTrackingRequestFailure(String str) {
        }

        a() {
        }

        @Override // com.appsflyer.AppsFlyerTrackingRequestListener
        public final void onTrackingRequestSuccess() {
            AppsFlyerLib.getInstance().setDeviceTrackingDisabled(r.f143181c);
        }
    }

    private r() {
    }

    static {
        Covode.recordClassIndex(93721);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r0 == false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void a() {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.r.a():void");
    }
}
