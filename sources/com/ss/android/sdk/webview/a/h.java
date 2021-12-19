package com.ss.android.sdk.webview.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f60178a;

    static {
        Covode.recordClassIndex(37171);
    }

    public h(WeakReference<Context> weakReference) {
        this.f60178a = weakReference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r6 != null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(org.json.JSONObject r9) {
        /*
            r8 = this;
            r6 = 0
            if (r9 == 0) goto L_0x005a
            java.lang.String r0 = "pkg_name"
            java.lang.String r5 = r9.optString(r0)
            java.lang.String r0 = "pkg_class"
            java.lang.String r7 = r9.optString(r0)
        L_0x000f:
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.f60178a
            android.content.Context r4 = com.ss.android.sdk.webview.d.a(r0)
            r3 = 0
            if (r4 == 0) goto L_0x001e
            boolean r0 = com.bytedance.common.utility.m.a(r5)
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            return r3
        L_0x001f:
            java.lang.String r0 = r4.getPackageName()
            boolean r2 = r5.equals(r0)
            boolean r0 = com.bytedance.common.utility.m.a(r7)
            if (r0 != 0) goto L_0x0045
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r5, r7)
            r1.setComponent(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            boolean r0 = com.ss.android.common.util.f.a(r4, r1)
            if (r0 != 0) goto L_0x004b
        L_0x0045:
            r0 = 1
            if (r6 != 0) goto L_0x0053
            if (r2 == 0) goto L_0x004d
            return r0
        L_0x004b:
            r6 = r1
            goto L_0x0045
        L_0x004d:
            android.content.Intent r6 = com.ss.android.common.util.f.a(r4, r5)
            if (r6 == 0) goto L_0x001e
        L_0x0053:
            com.ss.android.ugc.tiktok.security.a.a.a(r6, r4)     // Catch:{ Exception -> 0x001e }
            r4.startActivity(r6)     // Catch:{ Exception -> 0x001e }
            goto L_0x005d
        L_0x005a:
            r5 = r6
            r7 = r6
            goto L_0x000f
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.a.h.a(org.json.JSONObject):boolean");
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(com.bytedance.ies.web.a.h hVar, JSONObject jSONObject) {
        if (a(hVar.f35533d)) {
            jSONObject.put("code", 1);
        } else {
            jSONObject.put("code", 0);
        }
    }
}
