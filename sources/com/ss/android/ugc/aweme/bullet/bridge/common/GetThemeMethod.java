package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;

public final class GetThemeMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68983b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68984c = "getTheme";

    static {
        Covode.recordClassIndex(42532);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42533);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68984c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetThemeMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[Catch:{ Exception -> 0x0038 }] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r6, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r7) {
        /*
            r5 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r6, r1)
            h.f.b.l.d(r7, r1)
            android.content.Context r0 = r5.e()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0025
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0038 }
            h.f.b.l.b(r0, r1)     // Catch:{ Exception -> 0x0038 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x0038 }
            int r0 = r0.uiMode     // Catch:{ Exception -> 0x0038 }
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0038 }
            r1.<init>()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = "isDarkMode"
            if (r2 == 0) goto L_0x0030
            r4 = 1
        L_0x0030:
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0038 }
            r0 = 0
            r7.a(r1, r3, r0)     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0038:
            r2 = move-exception
            r1 = -1
            java.lang.String r0 = "Had trouble in getting current uiMode"
            r7.a(r1, r0)
            r2.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
