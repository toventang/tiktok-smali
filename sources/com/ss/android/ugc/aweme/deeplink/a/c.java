package com.ss.android.ugc.aweme.deeplink.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.deeplink.q;
import com.ss.android.ugc.aweme.qrcode.k;
import java.util.Collection;
import java.util.List;

public final class c extends a {
    static {
        Covode.recordClassIndex(49330);
    }

    private static int c(Uri uri) {
        uri.getHost();
        String b2 = v.b(uri.toString(), "schema_type");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return Integer.parseInt(b2);
            } catch (NumberFormatException unused) {
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (b.a((Collection) pathSegments) || pathSegments.size() < 3 || !TextUtils.equals("share", pathSegments.get(0))) {
            return 0;
        }
        pathSegments.get(2);
        return k.f119754a.a(pathSegments.get(1));
    }

    @Override // com.ss.android.ugc.aweme.deeplink.a.a
    public final Uri a(Uri uri) {
        Uri uri2 = null;
        if (uri.toString().contains("microapp") || uri.toString().contains("microgame")) {
            String b2 = q.a.b(uri.toString());
            if (TextUtils.isEmpty(b2) || TextUtils.equals(uri.toString(), b2)) {
                try {
                    uri2 = b(uri);
                    return uri2;
                } catch (Exception unused) {
                    return uri2;
                }
            } else {
                Uri parse = Uri.parse(b2);
                if (!uri.getBooleanQueryParameter("backurl", false)) {
                    return parse;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter("backurl", uri.getQueryParameter("backurl"));
                return buildUpon.build();
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("redirect_url"))) {
            return b(uri);
        } else {
            try {
                uri2 = Uri.parse(uri.getQueryParameter("redirect_url"));
                return uri2;
            } catch (Exception e2) {
                e2.printStackTrace();
                return uri2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011b, code lost:
        if (c(r14) == 16) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri b(android.net.Uri r14) {
        /*
        // Method dump skipped, instructions count: 515
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.a.c.b(android.net.Uri):android.net.Uri");
    }

    private static String a(Uri uri, String str) {
        String path = uri.getPath();
        int indexOf = path.indexOf(str) + str.length();
        return path.substring(indexOf, path.indexOf("/", indexOf));
    }
}
