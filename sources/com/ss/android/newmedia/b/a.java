package com.ss.android.newmedia.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.o;
import java.net.URISyntaxException;

public final class a {
    static {
        Covode.recordClassIndex(37041);
    }

    private static String a() {
        return "snssdk" + d.n;
    }

    public static String a(String str) {
        if (m.a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a2 = a();
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                return str.replace(scheme, a2);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static boolean a(Context context, String str) {
        Intent intent;
        PackageManager packageManager;
        try {
            intent = Intent.parseUri(str, 1);
        } catch (URISyntaxException unused) {
            intent = null;
        }
        if (!(intent == null || (packageManager = o.a(context).getPackageManager()) == null || intent.resolveActivity(packageManager) == null)) {
            intent.addFlags(268435456);
            if (intent.getComponent() == null || !context.getPackageName().equals(intent.getComponent().getPackageName())) {
                a(context, intent);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1.equals(r5) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.b.a.b(android.content.Context, java.lang.String):boolean");
    }
}
