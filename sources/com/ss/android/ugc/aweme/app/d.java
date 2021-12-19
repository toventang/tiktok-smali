package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bullet.utils.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f66680a = "webview";

    /* renamed from: b  reason: collision with root package name */
    public static final String f66681b = "open_url";

    /* renamed from: c  reason: collision with root package name */
    public static final String f66682c = "is_from_self";

    /* renamed from: d  reason: collision with root package name */
    public static final String f66683d = "com.ss.android.sdk.";

    /* renamed from: e  reason: collision with root package name */
    public static final a f66684e = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(41052);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String a(String str) {
            String str2;
            if (com.ss.android.newmedia.d.a(str)) {
                return c.b(str);
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("url");
            if (queryParameter != null) {
                str2 = c.b(queryParameter);
            } else {
                str2 = null;
            }
            return String.valueOf(c.a(parse, "url", str2));
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        public final boolean a(Context context, String str) {
            return a(context, str, (String) null, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:82:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean a(android.content.Context r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.d.a.a(android.content.Context, java.lang.String, java.lang.String, boolean):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:91:0x017b, code lost:
            if (r1.getFromNotificationIds().contains(r2) == false) goto L_0x017d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x022d  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x0261  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0270  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x019e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent a(android.content.Context r26, android.net.Uri r27, boolean r28, boolean r29) {
            /*
            // Method dump skipped, instructions count: 631
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.d.a.a(android.content.Context, android.net.Uri, boolean, boolean):android.content.Intent");
        }
    }

    static {
        Covode.recordClassIndex(41051);
    }
}
