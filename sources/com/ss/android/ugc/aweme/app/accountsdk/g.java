package com.ss.android.ugc.aweme.app.accountsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

public class g implements IAccountService.f {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f66548a = false;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f66549b = false;

    /* renamed from: c  reason: collision with root package name */
    Activity f66550c = null;

    /* renamed from: d  reason: collision with root package name */
    private Handler f66551d = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(40906);
    }

    public g() {
    }

    public g(Activity activity) {
        this.f66550c = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r6 != 10) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r7 == 4) goto L_0x0052;
     */
    @Override // com.ss.android.ugc.aweme.IAccountService.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, int r7) {
        /*
            r5 = this;
            r4 = 1
            r0 = 9
            if (r6 != r0) goto L_0x0017
            if (r7 != r4) goto L_0x005f
            com.ss.android.ugc.aweme.video.i r0 = com.ss.android.ugc.aweme.video.v.O()
            r0.B()
        L_0x000e:
            com.ss.android.ugc.aweme.login.a.b r0 = new com.ss.android.ugc.aweme.login.a.b
            r0.<init>(r4)
            com.ss.android.ugc.d.a.c.a(r0)
        L_0x0016:
            return
        L_0x0017:
            r1 = 4
            if (r6 != r4) goto L_0x0047
            r2 = 500(0x1f4, double:2.47E-321)
            if (r7 != r4) goto L_0x0032
            com.ss.android.ugc.aweme.video.i r0 = com.ss.android.ugc.aweme.video.v.O()
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x000e
            android.os.Handler r1 = r5.f66551d
            java.lang.Runnable r0 = com.ss.android.ugc.aweme.app.accountsdk.h.f66552a
            r1.postDelayed(r0, r2)
            r5.f66548a = r4
            goto L_0x000e
        L_0x0032:
            if (r7 != r1) goto L_0x0050
            boolean r0 = r5.f66548a
            if (r0 != 0) goto L_0x003c
            boolean r0 = r5.f66549b
            if (r0 == 0) goto L_0x0052
        L_0x003c:
            android.os.Handler r1 = r5.f66551d
            com.ss.android.ugc.aweme.app.accountsdk.i r0 = new com.ss.android.ugc.aweme.app.accountsdk.i
            r0.<init>(r5)
            r1.postDelayed(r0, r2)
            goto L_0x0052
        L_0x0047:
            if (r6 == r4) goto L_0x0050
            r0 = 7
            if (r6 == r0) goto L_0x0050
            r0 = 10
            if (r6 != r0) goto L_0x005f
        L_0x0050:
            if (r7 != r1) goto L_0x005f
        L_0x0052:
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            java.lang.Runnable r2 = com.ss.android.ugc.aweme.app.accountsdk.j.f66554a
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            goto L_0x0016
        L_0x005f:
            if (r7 != r4) goto L_0x0016
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.accountsdk.g.a(int, int):void");
    }
}
