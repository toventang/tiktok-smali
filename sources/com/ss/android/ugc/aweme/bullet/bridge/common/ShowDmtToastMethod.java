package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;

public final class ShowDmtToastMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69045b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69046c = "showDmtToast";

    static {
        Covode.recordClassIndex(42580);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42581);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69046c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowDmtToastMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r5, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            h.f.b.l.d(r6, r3)
            android.content.Context r2 = r4.e()
            java.lang.String r1 = "msg"
            boolean r0 = r5.has(r1)
            if (r0 != 0) goto L_0x001b
            r1 = 0
            java.lang.String r0 = "no params found"
            r6.a(r1, r0)
            return
        L_0x001b:
            java.lang.String r1 = r5.optString(r1)
            h.f.b.l.b(r1, r3)
            r0 = 0
            if (r2 == 0) goto L_0x0039
        L_0x0025:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x003a
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0039
            com.bytedance.tux.g.b r0 = new com.bytedance.tux.g.b
            r0.<init>(r2)
            com.bytedance.tux.g.b r0 = r0.a(r1)
            r0.b()
        L_0x0039:
            return
        L_0x003a:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0039
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            if (r2 == 0) goto L_0x0039
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
