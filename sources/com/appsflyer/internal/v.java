package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;

public final class v {
    static {
        Covode.recordClassIndex(2772);
    }

    v() {
    }

    /* access modifiers changed from: package-private */
    public static class a extends IllegalStateException {
        static {
            Covode.recordClassIndex(2773);
        }

        a(String str) {
            super(str);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static w m203(ContentResolver contentResolver) {
        String str;
        if (contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i2 == 0) {
            return new w(Settings.Secure.getString(contentResolver, "advertising_id"), false);
        }
        if (i2 == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new w(str, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r3.length() == 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[SYNTHETIC, Splitter:B:32:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m204(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.v.m204(android.content.Context, java.util.Map):void");
    }
}
