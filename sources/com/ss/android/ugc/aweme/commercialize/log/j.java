package com.ss.android.ugc.aweme.commercialize.log;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.google.gson.f;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.ss.android.ugc.aweme.commercialize.log.af;
import com.ss.android.ugc.aweme.commercialize.log.e;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.aj;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.splash.d;
import com.ss.android.ugc.aweme.commercialize.util.g;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f74820a = Arrays.asList("pause", "resume", "skip", "click", "buffer_start", "buffer_end", "slide", "splash_click", "otherclick");

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f74821b = Collections.singletonList("draw_ad");

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f74822c = Arrays.asList("click", "otherclick", "music_click");

    /* renamed from: d  reason: collision with root package name */
    private static af f74823d;

    public static boolean b(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            o j2 = q.a(jSONObject.getString("log_extra")).j();
            JSONObject jSONObject2 = new JSONObject();
            if (j2.c("rit") != null) {
                jSONObject2.put("ctr_rit", j2.c("rit").c());
            }
            return jSONObject2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        String aT = b.aT(aweme);
        int i2 = 1;
        if (b.B(aweme)) {
            HashMap hashMap2 = new HashMap();
            if (!d.f75286d) {
                i2 = 2;
            }
            hashMap2.put("awemelaunch", String.valueOf(i2));
            ISplashAdService h2 = SplashAdServiceImpl.h();
            if (h2 != null) {
                hashMap2.put("ad_sequence", Integer.valueOf(h2.a()));
            }
            hashMap.put("ad_extra_data", new f().b(hashMap2));
            a.C0791a a2 = a.a("draw_ad", "show", aweme.getAwemeRawAd()).a("awemelaunch", String.valueOf(i2)).a(hashMap2);
            if (aweme.getAwemeRawAd().isReshowAd()) {
                a2.a("is_reshow", 1);
            }
            if (!TextUtils.isEmpty(aT)) {
                try {
                    a2.b("study_id", Integer.valueOf(Integer.parseInt(aT)));
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                }
            }
            a2.c();
        } else if (aweme.isAd()) {
            a.C0791a a3 = a.a("draw_ad", "show", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme));
            if (aweme.getAwemeRawAd().isReshowAd()) {
                a3.a("is_reshow", 1);
            }
            if (AdShowTimeGapManager.a() && !aweme.getAwemeRawAd().isReshowAd()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = AdShowTimeGapManager.f74420d;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = currentTimeMillis - j2;
                }
                a3.a("showtime_gap", Long.valueOf(j3));
                a3.a("adgap", Integer.valueOf(AdShowTimeGapManager.a(aweme.getAid())));
            }
            if (!TextUtils.isEmpty(aT)) {
                try {
                    a3.b("study_id", Integer.valueOf(Integer.parseInt(aT)));
                } catch (NumberFormatException e3) {
                    e3.printStackTrace();
                }
            }
            a3.c();
        }
        JSONObject a4 = a(context, aweme, false, (Map<String, String>) hashMap);
        if (!TextUtils.isEmpty(aT)) {
            try {
                a4.put("study_id", Integer.parseInt(aT));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        b(context, "show", aweme, a4);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            aj.a("show", awemeRawAd.getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new k(aweme));
        }
        bs.a(aweme);
        n.a("ctr_monitor", "ctr_show", a(a(context, aweme, false, (Map<String, String>) null)));
    }

    public static void a(Context context, Aweme aweme, JSONObject jSONObject) {
        b(context, "show_failed", aweme, b(context, aweme, jSONObject));
    }

    public static void a(Context context, Aweme aweme, int i2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("filter_reason", Integer.valueOf(i2));
        hashMap.put("ad_extra_data", new f().b(hashMap2));
        b(context, "item_repeat", aweme, a(context, aweme, false, (Map<String, String>) hashMap));
    }

    public static void a(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, "landing_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, Aweme aweme, long j2, int i2) {
        a(context, aweme, j2, i2, "break");
    }

    public static void a(Context context, com.ss.android.ugc.aweme.commercialize.utils.b bVar) {
        if (context != null && bVar != null) {
            String str = bVar.f75624b;
            Aweme aweme = bVar.f75623a;
            String str2 = bVar.f75625c;
            JSONObject a2 = a(context, aweme, str, str2);
            HashMap hashMap = new HashMap();
            hashMap.put("fail_reason", bVar.f75626d);
            hashMap.put("card_type", bVar.f75627e);
            hashMap.put("status", bVar.f75628f);
            hashMap.put("is_preload", Boolean.valueOf(bVar.f75629g));
            hashMap.put("anchor_id", bVar.f75630h);
            hashMap.put("room_id", Long.valueOf(bVar.f75631i));
            a(a2, hashMap);
            b(context, str, aweme, a2);
            if (aweme != null && aweme.isAd()) {
                a.a("draw_ad", str, aweme.getAwemeRawAd()).b("refer", str2).a("fail_reason", bVar.f75626d).a("card_type", bVar.f75627e).a("status", bVar.f75628f).a("is_preload", Boolean.valueOf(bVar.f75629g)).a("anchor_id", bVar.f75630h).a("room_id", Long.valueOf(bVar.f75631i)).c();
            }
            if (TextUtils.equals(bVar.f75624b, "click") && TextUtils.equals(bVar.f75625c, "card")) {
                com.ss.android.ugc.aweme.crossplatform.business.a.a.a("draw_ad", "card");
            }
        }
    }

    private static void a(JSONObject jSONObject, Map<String, Object> map) {
        if (jSONObject != null && map.size() != 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if ((!(value instanceof String) || !TextUtils.isEmpty((String) value)) && (!(value instanceof Long) || ((Long) value).longValue() != 0)) {
                        optJSONObject.put(entry.getKey(), value);
                    }
                }
                if (optJSONObject.length() > 0) {
                    jSONObject.put("ad_extra_data", optJSONObject);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(Context context, Aweme aweme, String str, Map<String, Object> map) {
        JSONObject a2 = a(context, aweme, false, map == null ? null : a(map));
        if (str != null) {
            try {
                a2.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        b(context, "click_source", aweme, a2);
    }

    public static void a(Context context, AwemeRawAd awemeRawAd, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new f().b(hashMap2));
        a(context, "open_url_app", awemeRawAd, a(context, awemeRawAd, false, (Map<String, String>) hashMap));
    }

    public static void a(Context context, AwemeRawAd awemeRawAd, String str, String str2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("fail_reason", str2);
        }
        hashMap.put("ad_extra_data", new f().b(hashMap2));
        a(context, "deeplink_failed", awemeRawAd, a(context, awemeRawAd, false, (Map<String, String>) hashMap));
    }

    public static void a(Context context, Aweme aweme, Map<String, String> map) {
        HashMap hashMap;
        if (map.size() != 0) {
            hashMap = new HashMap();
            hashMap.put("ad_extra_data", new f().b(map));
        } else {
            hashMap = null;
        }
        c(context, "othershow", aweme, a(context, aweme, false, (Map<String, String>) hashMap));
    }

    public static void a(Context context, Aweme aweme, FollowStatus followStatus) {
        HashMap hashMap = new HashMap();
        if (b.Y(aweme)) {
            int i2 = 1;
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus == null || !followStatus.isCheating()) ? 0 : 1));
            if (followStatus != null) {
                i2 = followStatus.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i2));
        }
        hashMap.put("anchor_id", b(aweme));
        hashMap.put("room_id", a(aweme));
        b(context, "follow", aweme, a(context, aweme, false, a(hashMap)));
    }

    public static void a(Context context, Aweme aweme, long j2) {
        aweme.isAd();
        if (b.B(aweme)) {
            if (b() && z(context, aweme)) {
                b(context, "first_view", aweme, b(context, aweme, a(j2)));
                a.a("draw_ad", "first_view", aweme.getAwemeRawAd()).a("launchduration", Long.valueOf(j2)).c();
                com.ss.android.ugc.aweme.commercialize.util.b.a(j2, 1, System.currentTimeMillis());
                aweme.getAwemeRawAd().getCreativeId();
            }
        } else if (b()) {
            b(context, "splash_ad", "first_view", a(j2), "-1", 0);
            a.a("splash_ad", "first_view", "-1", null, "0").a("launchduration", Long.valueOf(j2)).c();
        }
    }

    public static JSONObject a(Context context, Aweme aweme, boolean z, Map<String, String> map) {
        if (!z(context, aweme)) {
            return new JSONObject();
        }
        return a(context, aweme.getAwemeRawAd(), z, map);
    }

    private static JSONObject a(Context context, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            a(context, jSONObject, awemeRawAd.getLogExtra());
        } catch (JSONException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
        return jSONObject;
    }

    public static JSONObject a(Context context, AwemeRawAd awemeRawAd, boolean z, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            a(context, jSONObject, awemeRawAd.getLogExtra());
            if (z) {
                jSONObject.put("has_v3", "1");
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
        return jSONObject;
    }

    private static JSONObject a(Context context, ac acVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            a(context, jSONObject, acVar.logExtra);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
                jSONObject.put("item_id", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(Context context, JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String b2 = b(context);
        if (!m.a(b2)) {
            jSONObject.put("nt", b2);
        }
        return jSONObject;
    }

    public static void b(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, "draw_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, str, str2, jSONObject, aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (b(context, awemeRawAd)) {
            a(context, "draw_ad", str, jSONObject, awemeRawAd);
        }
    }

    public static void b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (b(context, awemeRawAd)) {
            a(context, "comment_end_ad", str, jSONObject, awemeRawAd);
        }
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        String str3 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            str3 = TextUtils.equals(str3, "background_ad") ? "background_ads" : "topic_ads";
        }
        if (TextUtils.equals("click", str2)) {
            bs.a(awemeRawAd);
        }
        if (b.b(awemeRawAd)) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        a(context, str3, str2, jSONObject, b(awemeRawAd), a(awemeRawAd));
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        if ((TextUtils.equals(str, "draw_ad") && f74820a.contains(str2)) || (com.ss.android.ugc.aweme.commercialize.d.a.f73755b.contains(str2) && com.ss.android.ugc.aweme.commercialize.d.a.f73754a.contains(str))) {
            long c2 = com.ss.android.ugc.aweme.commerce.a.a.d().c();
            int i2 = com.ss.android.ugc.aweme.commerce.a.a.d().f73306f + 1;
            if (c2 < 0) {
                c2 = com.ss.android.ugc.aweme.commerce.a.a.d().f73308h;
            }
            if (c2 >= 0) {
                try {
                    String optString = jSONObject.optString("ad_extra_data");
                    JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                    jSONObject2.put("duration", c2);
                    jSONObject2.put("play_order", i2);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        if (com.ss.android.ugc.aweme.commerce.a.a.d().f73309i != null && com.ss.android.ugc.aweme.commerce.a.a.d().a() != null && f74821b.contains(str) && f74822c.contains(str2)) {
            com.ss.android.ugc.aweme.commerce.a.a.d().b(com.ss.android.ugc.aweme.commerce.a.a.d().f73309i, context, com.ss.android.ugc.aweme.commerce.a.a.d().a());
        }
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j2) {
        af afVar = f74823d;
        if (afVar == null || !afVar.a(new af.a(context, str, str2, str3, j2, jSONObject))) {
            b(context, str, str2, jSONObject, str3, j2);
        }
    }

    private static void b(Context context, String str, String str2, JSONObject jSONObject, String str3, long j2) {
        a(str, str2, jSONObject);
        String a2 = com.bytedance.ies.abmock.b.a().a(true, "enable_send_staging_adlog", "v3");
        if (TextUtils.equals(a2, "v1") || TextUtils.equals(str2, "click")) {
            a(context, str, str2);
        }
        if (!TextUtils.equals(str2, "click")) {
            if (!TextUtils.equals(a2, "v3")) {
                if (TextUtils.equals(a2, "all")) {
                    try {
                        jSONObject.put("_ad_staging_flag", "1");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        ITalentAdRevenueShareService e3 = TalentAdRevenueShareServiceImpl.e();
        if (e3 != null) {
            e3.a(str3, jSONObject);
        }
        if (TextUtils.equals("click", str2)) {
            g.a(str3);
            a(str, str3, j2, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        r.a(str, str2, str3, j2, jSONObject);
    }

    public static void a(String str, String str2, long j2, JSONObject jSONObject) {
        long j3;
        try {
            j3 = Long.parseLong(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            j3 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        e.a aVar = new e.a();
        aVar.f74795c = str;
        aVar.f74794b = "realtime_click";
        aVar.f74796d = j3;
        aVar.f74797e = j2;
        aVar.f74793a = "event_v3";
        aVar.f74798f = jSONObject2;
        aVar.a().a();
        n.a("ctr_monitor", "ctr_click", a(jSONObject));
    }

    public static void a(Context context, ac acVar, Aweme aweme, boolean z) {
        a("link_click", context, acVar, aweme, z, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r13, android.content.Context r14, com.ss.android.ugc.aweme.commercialize.model.ac r15, com.ss.android.ugc.aweme.feed.model.Aweme r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.log.j.a(java.lang.String, android.content.Context, com.ss.android.ugc.aweme.commercialize.model.ac, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r12, com.ss.android.ugc.aweme.commercialize.link.a.a r13) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.log.j.a(android.content.Context, com.ss.android.ugc.aweme.commercialize.link.a.a):void");
    }

    public static void a(Context context, Aweme aweme, String str) {
        JSONObject a2 = a(context, aweme, true, (Map<String, String>) null);
        if (str != null) {
            try {
                a2.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", b(aweme));
        hashMap.put("room_id", a(aweme));
        try {
            a2.put("ad_extra_data", new f().b(hashMap));
        } catch (JSONException unused2) {
        }
        b(context, "click", aweme, a2);
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new y(awemeRawAd));
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a.a("draw_ad", str);
    }

    public static void a(Context context, AwemeRawAd awemeRawAd) {
        b(context, "othershow", awemeRawAd, a(context, awemeRawAd, false, (Map<String, String>) null));
    }

    private static boolean b() {
        if (d.f75285c) {
            return false;
        }
        d.f75285c = true;
        return true;
    }

    public static JSONObject a(Context context, Aweme aweme, String str, String str2) {
        JSONObject a2 = a(context, aweme, false, (Map<String, String>) null);
        try {
            if (!TextUtils.isEmpty(str2)) {
                a2.put("refer", str2);
            }
        } catch (JSONException unused) {
        }
        return a2;
    }

    public static void a(String str, Context context, ac acVar, Aweme aweme, boolean z) {
        a(str, context, acVar, aweme, z, true);
    }

    static {
        Covode.recordClassIndex(46117);
    }

    public static Map<String, Object> a() {
        long c2 = com.ss.android.ugc.aweme.commerce.a.a.d().c();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(c2));
        hashMap.put("play_order", Integer.valueOf(com.ss.android.ugc.aweme.commerce.a.a.d().f73306f + 1));
        return hashMap;
    }

    public static long a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    public static String b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    private static String b(Context context) {
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.j.f107227f) && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107227f;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        com.ss.android.ugc.aweme.lancet.j.f107227f = networkAccessType;
        return networkAccessType;
    }

    public static long d(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return a(awemeRawAd);
        }
        return 0;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static HashMap<String, String> c(Aweme aweme) {
        if (aweme.getPromotion() == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("commodity_id", aweme.getPromotion().getPromotionId());
        hashMap2.put("commodity_type", Integer.valueOf(aweme.getPromotion().getPromotionSource()));
        hashMap.put("ad_extra_data", new f().b(hashMap2));
        return hashMap;
    }

    public static String b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    public static String a(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    public static Map<String, String> a(int i2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_order", Integer.valueOf(i2));
        hashMap.put("ad_extra_data", new f().b(hashMap2));
        return hashMap;
    }

    public static Map<String, String> a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new f().b(map));
        return hashMap;
    }

    private static JSONObject a(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("launchduration", Long.valueOf(j2));
            jSONObject.put("ad_extra_data", new f().b(hashMap));
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static void h(Context context, Aweme aweme) {
        c(context, aweme, "");
    }

    public static void c(Context context, Aweme aweme) {
        b(context, "open_url_app", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void e(Context context, Aweme aweme) {
        b(context, "deeplink_failed", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void f(Context context, Aweme aweme) {
        b(context, "open_url_h5", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void i(Context context, Aweme aweme) {
        b(context, "like", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void j(Context context, Aweme aweme) {
        b(context, "like_cancel", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void k(Context context, Aweme aweme) {
        b(context, "open_url_window_show", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void m(Context context, Aweme aweme) {
        c(context, "click_button", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void n(Context context, Aweme aweme) {
        b(context, "live_show_failed", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void o(Context context, Aweme aweme) {
        b(context, "challenge_click", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void q(Context context, Aweme aweme) {
        b(context, "click_redpacket", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void r(Context context, Aweme aweme) {
        d(context, "click_button", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void s(Context context, Aweme aweme) {
        d(context, "click_call", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void t(Context context, Aweme aweme) {
        d(context, "click_form", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void u(Context context, Aweme aweme) {
        d(context, "load_fail", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void v(Context context, Aweme aweme) {
        d(context, "click_redpacket", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void x(Context context, Aweme aweme) {
        e(context, "click_cancel", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void y(Context context, Aweme aweme) {
        e(context, "load_fail", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static boolean z(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    public static int a(long j2, int i2) {
        if (i2 <= 0 || j2 <= 0) {
            return 0;
        }
        return Math.min((int) ((j2 * 100) / ((long) i2)), 100);
    }

    public static void g(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "lynx");
        b(context, "open_url_h5", aweme, a(context, aweme, false, a(hashMap)));
    }

    public static void d(Context context, Aweme aweme) {
        if (z(context, aweme)) {
            b(context, "deeplink_success", aweme, a(context, aweme, false, (Map<String, String>) null));
            new aj.a().a("draw_ad").a(System.currentTimeMillis() - 5000).a(aweme.getAwemeRawAd()).a();
        }
    }

    public static void p(Context context, Aweme aweme) {
        JSONObject a2 = a(context, aweme, false, (Map<String, String>) null);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", b(aweme));
            hashMap.put("room_id", a(aweme));
            a2.put("ad_extra_data", new f().b(hashMap));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b(context, "share", aweme, a2);
    }

    public static void w(Context context, Aweme aweme) {
        f.b a2 = f.a();
        a2.f74804a = "homepage_ad";
        a2.f74805b = "resume";
        a2.b(aweme).a(context);
        if (aweme != null) {
            a.a("homepage_ad", "resume", aweme.getAwemeRawAd()).c();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11901);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11901);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void l(Context context, Aweme aweme) {
        c(context, "replay", aweme, a(context, aweme, "raw ad background replay", "button"));
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new ab(aweme));
            a.a("background_ad", "replay", aweme.getAwemeRawAd()).b("refer", "button").c();
        }
    }

    public static void b(Context context, Aweme aweme) {
        f(context, "receive", aweme, a(context, aweme, false, (Map<String, String>) null));
    }

    public static void b(Context context, Aweme aweme, int i2) {
        e(context, aweme, i2);
        g.a(aweme);
    }

    public static void d(Context context, Aweme aweme, int i2) {
        b(context, "unmute", aweme, g(context, aweme, i2));
    }

    public static void c(Context context, Aweme aweme, int i2) {
        b(context, "mute", aweme, f(context, aweme, i2));
    }

    public static JSONObject b(Context context, Aweme aweme, JSONObject jSONObject) {
        if (!z(context, aweme)) {
            return jSONObject;
        }
        return a(context, aweme.getAwemeRawAd(), jSONObject);
    }

    private static JSONObject f(Context context, Aweme aweme, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("playervol", Float.valueOf(0.0f));
        hashMap.put("play_order", Integer.valueOf(i2));
        return a(context, aweme, false, a(hashMap));
    }

    public static void c(Context context, Aweme aweme, String str) {
        JSONObject a2 = a(context, aweme, false, (Map<String, String>) null);
        if (!TextUtils.isEmpty(str)) {
            try {
                a2.put("refer", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", b(aweme));
        hashMap.put("room_id", a(aweme));
        try {
            a2.put("ad_extra_data", new com.google.gson.f().b(hashMap));
        } catch (JSONException unused) {
        }
        b(context, "slide", aweme, a2);
        if (aweme != null) {
            a.a("draw_ad", "slide", aweme.getAwemeRawAd()).a("refer", str).a("room_id", a(aweme)).a("anchor_id", b(aweme)).c();
        }
        if (b.Y(aweme)) {
            b(context, "click", aweme, a(context, aweme, false, (Map<String, String>) null));
        }
    }

    public static void d(Context context, Aweme aweme, String str) {
        JSONObject a2 = a(context, aweme, true, (Map<String, String>) null);
        try {
            if (!TextUtils.isEmpty(str)) {
                a2.put("refer", str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", b(aweme));
            hashMap.put("room_id", a(aweme));
            a2.put("ad_extra_data", new com.google.gson.f().b(hashMap));
        } catch (JSONException unused) {
        }
        d(context, "click", aweme, a2);
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new n(awemeRawAd));
        }
    }

    private static JSONObject g(Context context, Aweme aweme, int i2) {
        int i3;
        AudioManager audioManager = (AudioManager) a(a(context), DataType.AUDIO);
        HashMap hashMap = new HashMap();
        int i4 = -1;
        if (audioManager != null) {
            i3 = audioManager.getStreamVolume(3);
            i4 = audioManager.getStreamMaxVolume(3);
        } else {
            i3 = -1;
        }
        float f2 = 0.0f;
        if (i3 > 0 && i4 > 0) {
            f2 = ((float) i3) / ((float) i4);
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f2 * 1000.0f))) * 0.001f));
        hashMap.put("play_order", Integer.valueOf(i2));
        return a(context, aweme, false, a(hashMap));
    }

    private static void e(Context context, Aweme aweme, int i2) {
        float f2 = 0.0f;
        if (context != null) {
            if (((Boolean) com.ss.android.ugc.aweme.experiment.d.f89759b.getValue()).booleanValue()) {
                f2 = (float) com.ss.android.ugc.aweme.m.a.a(3);
            } else {
                AudioManager audioManager = (AudioManager) a(a(context), DataType.AUDIO);
                if (audioManager != null) {
                    int streamVolume = audioManager.getStreamVolume(3);
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (streamVolume > 0 && streamMaxVolume > 0) {
                        f2 = ((float) streamVolume) / ((float) streamMaxVolume);
                    }
                }
                f2 = ((float) ((int) (f2 * 1000.0f))) * 0.001f;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("play_order", Integer.valueOf(i2));
        hashMap.put("playervol", Float.valueOf(f2));
        b(context, "play", aweme, a(context, aweme, false, a(hashMap)));
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new l(aweme));
            a.a("draw_ad", "play", awemeRawAd).a("play_order", Integer.valueOf(i2)).a("playervol", Float.valueOf(f2)).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
        }
    }

    public static void b(Context context, Aweme aweme, String str) {
        JSONObject a2 = a(context, aweme, false, (Map<String, String>) null);
        if (!TextUtils.isEmpty(str)) {
            try {
                a2.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        b(context, "otherclick", aweme, a2);
    }

    public static void b(Context context, Aweme aweme, Map<String, String> map) {
        JSONObject a2 = a(context, aweme, true, map);
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", b(aweme));
        hashMap.put("room_id", a(aweme));
        try {
            a2.put("ad_extra_data", new com.google.gson.f().b(hashMap));
        } catch (JSONException unused) {
        }
        c(context, "click", aweme, a2);
        if (b.s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new ac(awemeRawAd));
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a.a("background_ad", map.get("refer"));
    }

    public static void b(Context context, AwemeRawAd awemeRawAd, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("fail_reason", "app_uninstalled");
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new com.google.gson.f().b(hashMap2));
        a(context, "deeplink_failed", awemeRawAd, a(context, awemeRawAd, false, (Map<String, String>) hashMap));
    }

    private static void e(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, "feed_form", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    private static void f(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, "receive_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    public static void c(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, "background_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    public static void d(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (z(context, aweme)) {
            a(context, "homepage_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    private static void a(Context context, Aweme aweme, long j2, int i2, String str) {
        b(context, aweme, j2, i2, str);
    }

    private static void b(Context context, Aweme aweme, long j2, int i2, String str) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("play_order", Integer.valueOf(i2));
            hashMap.put("anchor_id", b(aweme));
            hashMap.put("room_id", a(aweme));
            if (aweme.getAwemeRawAd().isReshowAd()) {
                hashMap.put("is_reshow", 1);
            }
            if (g.e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(g.d(aweme) ? 1 : 0));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", j2);
                int i3 = 0;
                if (aweme.getVideo() != null) {
                    i3 = aweme.getVideo().getVideoLength();
                }
                jSONObject.put("video_length", i3);
                if (TextUtils.equals(str, "play_break")) {
                    jSONObject.put("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId());
                }
                int a2 = a(j2, i3);
                jSONObject.put("percent", a2);
                String str2 = null;
                a.C0791a b2 = a.a("draw_ad", str, aweme.getAwemeRawAd()).b("duration", Long.valueOf(j2)).b("percent", Integer.valueOf(a2)).b("break_reason", null).b("video_length", Integer.valueOf(i3));
                if (TextUtils.equals(str, "play_break")) {
                    str2 = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                }
                b2.b("user_id", str2).a(hashMap).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            g.a(aweme, j2);
            b(context, str, aweme, jSONObject);
            bs.a("pause", aweme, "play_break");
        }
    }
}
