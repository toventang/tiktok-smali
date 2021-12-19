package com.ss.android.ugc.aweme.report;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.b.l;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f120579a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(78511);
    }

    public static final HashMap<String, String> a(Aweme aweme, String str) {
        Long groupId;
        String valueOf;
        String str2 = "";
        l.d(aweme, str2);
        l.d(str, str2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str);
        hashMap.put("author_id", aweme.getAuthorUid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!(awemeRawAd == null || (groupId = awemeRawAd.getGroupId()) == null || (valueOf = String.valueOf(groupId.longValue())) == null)) {
            str2 = valueOf;
        }
        hashMap.put("group_id", str2);
        return hashMap;
    }

    public static final Uri.Builder a(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        return a(new Uri.Builder(), aweme, str, str2);
    }

    public static final Uri.Builder a(Aweme aweme, String str, long j2, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("room_id", String.valueOf(j2));
        return a(builder, aweme, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri.Builder a(android.net.Uri.Builder r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r3 = ""
            h.f.b.l.d(r4, r3)
            h.f.b.l.d(r5, r3)
            h.f.b.l.d(r6, r3)
            h.f.b.l.d(r7, r3)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getLogExtra()
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 != 0) goto L_0x0028
            h.f.b.l.b()
        L_0x0028:
            h.f.b.l.b(r0, r3)
            java.lang.String r1 = r0.getLogExtra()
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            java.lang.String r0 = "log_extra"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = r0.getCreativeIdStr()
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            java.lang.String r0 = "cid"
            r2.put(r0, r1)
            com.google.gson.f r0 = new com.google.gson.f
            r0.<init>()
            java.lang.String r0 = r0.b(r2)
            h.f.b.l.b(r0, r3)
            android.net.Uri$Builder r0 = a(r4, r5, r6, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.report.b.a(android.net.Uri$Builder, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    public static final Uri.Builder a(Uri.Builder builder, Aweme aweme, String str, String str2, String str3) {
        Long l2;
        int reportAdType;
        l.d(builder, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        e.a.f91018a.a("ies_ad_info_key_" + AppLog.getServerDeviceId(), (Object) str3);
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("report_type", str2).appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid());
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("user_id", g2.getCurUserId());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l2 = awemeRawAd.getGroupId();
        } else {
            l2 = null;
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("group_id", String.valueOf(l2)).appendQueryParameter("report_from", str).appendQueryParameter("app_language", SettingServiceImpl.v().h()).appendQueryParameter("app_name", d.b()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", d.f()).appendQueryParameter("install_id", AppLog.getInstallId());
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (!(awemeRawAd2 == null || (reportAdType = awemeRawAd2.getReportAdType()) == 0)) {
            builder.appendQueryParameter("report_ad_type", String.valueOf(reportAdType));
        }
        l.b(appendQueryParameter3, "");
        return appendQueryParameter3;
    }
}
