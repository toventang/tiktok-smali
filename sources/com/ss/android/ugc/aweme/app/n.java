package com.ss.android.ugc.aweme.app;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.facebook.j.a.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.o;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends o {

    /* renamed from: a  reason: collision with root package name */
    public static final NetworkUtils.g f66843a = new NetworkUtils.g() {
        /* class com.ss.android.ugc.aweme.app.n.AnonymousClass3 */

        /* renamed from: a  reason: collision with root package name */
        public boolean f66846a;

        static {
            Covode.recordClassIndex(41167);
        }

        @Override // com.ss.android.common.util.NetworkUtils.g
        public final void a(final long j2, final long j3, final String str, final String str2, final NetworkUtils.f fVar) {
            try {
                n.f68164d.submit(new Runnable() {
                    /* class com.ss.android.ugc.aweme.app.n.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(41168);
                    }

                    public final void run() {
                        NetworkUtils.f fVar;
                        String[] strArr = new String[1];
                        if (m.a(strArr[0]) && (fVar = fVar) != null) {
                            strArr[0] = fVar.f59380a;
                        }
                        String str = null;
                        if (!TextUtils.isEmpty(str)) {
                            str = Uri.parse(str).getQueryParameter("retry_type");
                        }
                        if (!AnonymousClass3.this.f66846a && !TextUtils.isEmpty(str) && str.contains("aweme/v1/feed/?type=0")) {
                            AnonymousClass3.this.f66846a = true;
                        }
                        n.a(j2, j3, str, strArr[0], str2, 200, new c().a("retry_type", str).a("First_Request", String.valueOf(AnonymousClass3.this.f66846a)).a());
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.ss.android.common.util.NetworkUtils.g
        public final void a(final long j2, final long j3, final String str, final String str2, final NetworkUtils.f fVar, final Throwable th) {
            try {
                n.f68164d.submit(new Runnable() {
                    /* class com.ss.android.ugc.aweme.app.n.AnonymousClass3.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(41169);
                    }

                    public final void run() {
                        String str;
                        NetworkUtils.f fVar;
                        if (!TextUtils.isEmpty(str)) {
                            str = Uri.parse(str).getQueryParameter("retry_type");
                            if (TextUtils.equals("no_retry", str)) {
                                return;
                            }
                        } else {
                            str = null;
                        }
                        String[] strArr = new String[1];
                        int a2 = n.a(th, strArr);
                        if (m.a(strArr[0]) && (fVar = fVar) != null) {
                            strArr[0] = fVar.f59380a;
                        }
                        if (!AnonymousClass3.this.f66846a && !TextUtils.isEmpty(str) && str.contains("aweme/v1/feed/?type=0")) {
                            AnonymousClass3.this.f66846a = true;
                        }
                        JSONObject a3 = new c().a("First_Request", String.valueOf(AnonymousClass3.this.f66846a)).a("traceCode", str2).a("errorDesc", n.a(th)).a("netWorkQuality", b.a.f48731a.a().toString()).a("netWorkSpeeds", new StringBuilder().append((int) b.a.f48731a.b()).toString()).a("responseCode", String.valueOf(str2)).a("retryType", str).a();
                        n.b(j2, j3, str, strArr[0], str2, a2, a3);
                        n.a(j2, j3, str, strArr[0], str2, a2, a3);
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    };

    static {
        Covode.recordClassIndex(41164);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.Throwable r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0028 }
            r2.<init>()     // Catch:{ all -> 0x0028 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0028 }
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            r4.printStackTrace(r1)     // Catch:{ all -> 0x0029 }
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0023
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0029 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0023
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0029 }
        L_0x0023:
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0029 }
            goto L_0x002b
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 == 0) goto L_0x002e
        L_0x002b:
            r1.close()
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.n.a(java.lang.Throwable):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0161 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.Throwable r8, java.lang.String[] r9) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.n.a(java.lang.Throwable, java.lang.String[]):int");
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.apm.b.a(str, jSONObject);
    }
}
