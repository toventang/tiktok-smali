package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Objects;

public final class k implements f {
    static {
        Covode.recordClassIndex(7559);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        if (!TextUtils.equals("webcast_lynxview", uri.getHost()) || TextUtils.equals("1", uri.getQueryParameter("use_new_container"))) {
            return false;
        }
        return true;
    }

    private static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        Uri parse = Uri.parse(queryParameter);
        String queryParameter2 = uri.getQueryParameter("status_bar_height");
        if (!TextUtils.isEmpty(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    private static String a(Uri uri, String str) {
        try {
            return String.valueOf(Objects.requireNonNull(uri.getQueryParameter(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    @Override // com.bytedance.android.livesdk.actionhandler.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handle(android.content.Context r20, android.net.Uri r21) {
        /*
        // Method dump skipped, instructions count: 866
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.actionhandler.k.handle(android.content.Context, android.net.Uri):boolean");
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }

    private static int a(Uri uri, String str, int i2) {
        try {
            return Integer.parseInt((String) Objects.requireNonNull(uri.getQueryParameter(str)));
        } catch (Exception unused) {
            return i2;
        }
    }

    private static String a(Uri uri, String str, String str2) {
        try {
            return String.valueOf(Objects.requireNonNull(uri.getQueryParameter(str)));
        } catch (Exception unused) {
            return str2;
        }
    }
}
