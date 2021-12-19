package com.ss.android.ugc.aweme.account.p.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class d implements com.bytedance.ies.web.a.d {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f65265a;

    /* renamed from: b  reason: collision with root package name */
    public final a f65266b;

    static {
        Covode.recordClassIndex(40135);
    }

    public d(WeakReference<Context> weakReference, a aVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        this.f65265a = weakReference;
        this.f65266b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    @Override // com.bytedance.ies.web.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.a.h r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.f65265a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r4 = "interstitial_token"
            if (r6 == 0) goto L_0x0051
            org.json.JSONObject r0 = r6.f35533d
            if (r0 == 0) goto L_0x0051
            java.lang.String r3 = r0.optString(r4)
            if (r3 != 0) goto L_0x004f
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept.a(r0)
            android.content.Intent r2 = new android.content.Intent
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.f65265a
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity> r0 = com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity.class
            r2.<init>(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "mandatory_page"
            r2.putExtra(r1, r0)
            r1 = 1
            java.lang.String r0 = "is_from_un_login_user"
            r2.putExtra(r0, r1)
            r2.putExtra(r4, r3)
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.f65265a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0046
            h.f.b.l.b()
        L_0x0046:
            android.content.Context r0 = (android.content.Context) r0
            com.ss.android.ugc.tiktok.security.a.a.a(r2, r0)
            r0.startActivity(r2)
            return
        L_0x004f:
            r0 = r3
            goto L_0x0019
        L_0x0051:
            r3 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.p.a.d.call(com.bytedance.ies.web.a.h, org.json.JSONObject):void");
    }
}
