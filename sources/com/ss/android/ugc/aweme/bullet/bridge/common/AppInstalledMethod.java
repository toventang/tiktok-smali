package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;

public final class AppInstalledMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68947b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68948c = "isAppInstalled";

    static {
        Covode.recordClassIndex(42499);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42500);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68948c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppInstalledMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r2 != true) goto L_0x002e;
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r7, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r7, r0)
            h.f.b.l.d(r8, r0)
            java.lang.String r0 = "pkg_name"
            java.lang.String r5 = r7.optString(r0)
            java.lang.String r0 = "open_url"
            java.lang.String r4 = r7.optString(r0)
            com.bytedance.ies.bullet.c.e.a.b r1 = r6.f32005a
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r3 = r1.c(r0)
            android.content.Context r3 = (android.content.Context) r3
            r2 = -1
            if (r3 == 0) goto L_0x0046
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x002e
            boolean r2 = com.ss.android.common.util.f.b(r3, r5)
            r0 = 1
            if (r2 == r0) goto L_0x0046
        L_0x002e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            android.net.Uri r0 = android.net.Uri.parse(r4)
            r1.setData(r0)
            boolean r2 = com.ss.android.common.util.f.a(r3, r1)
        L_0x0046:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "installed"
            r1.put(r0, r2)
            r8.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
