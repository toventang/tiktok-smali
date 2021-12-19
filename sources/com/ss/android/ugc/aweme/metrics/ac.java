package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static String f109468a = "";

    static {
        Covode.recordClassIndex(70098);
    }

    public static String c(String str) {
        return ac.a.f91473a.a(a(str, 0));
    }

    private static Object d(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return ac.a.f91473a.a(str);
        }
    }

    public static String e(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    public static String i(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAuthorUid();
        }
        return "";
    }

    public static String a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getUid();
    }

    public static String b(Aweme aweme) {
        if (aweme == null || aweme.getRequestId() == null) {
            return "";
        }
        return aweme.getRequestId();
    }

    public static String f(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "1";
        }
        return "0";
    }

    public static String g(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return UGCMonitor.TYPE_PHOTO;
        }
        if (aweme.isLive()) {
            return "live";
        }
        return "video";
    }

    public static boolean h(Aweme aweme) {
        IAccountUserService e2 = AccountService.a().e();
        if (aweme == null || !TextUtils.equals(aweme.getAuthorUid(), e2.getCurUserId())) {
            return false;
        }
        return true;
    }

    public static String k(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return UGCMonitor.TYPE_REPOST;
        }
        return "item";
    }

    public static String m(Aweme aweme) {
        if (aweme == null || aweme.getRelationRecommendInfo() == null) {
            return "";
        }
        return String.valueOf(aweme.getRelationRecommendInfo().getRecommendType());
    }

    public static String n(Aweme aweme) {
        if (aweme == null || aweme.getRelationRecommendInfo() == null) {
            return "";
        }
        return String.valueOf(aweme.getRelationRecommendInfo().getRelationTextKey());
    }

    public static JSONObject b(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    Object obj = map.get(str);
                    if (!TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, obj);
                    } else if (obj instanceof String) {
                        jSONObject.put(str, d((String) obj));
                    }
                } catch (JSONException e2) {
                    a.a((Throwable) e2);
                }
            }
        }
        return jSONObject;
    }

    public static Long c(Aweme aweme) {
        long j2 = 0;
        if (aweme == null) {
            return 0L;
        }
        if (aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) {
            return 0L;
        }
        if (aweme.getMusic() != null) {
            j2 = aweme.getMusic().getId();
        }
        return Long.valueOf(j2);
    }

    public static String d(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if ((aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) || aweme.getMusic() == null) {
            return "";
        }
        return new StringBuilder().append(aweme.getMusic().getId()).toString();
    }

    public static String j(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getDistributeType() == 1) {
            return "short";
        }
        if (aweme.getDistributeType() == 2) {
            return "long_direct";
        }
        if (aweme.getDistributeType() == 3) {
            return "long_with_short";
        }
        return "";
    }

    public static String l(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return aweme.getAuthorUid();
        }
        if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return aweme.getRepostFromUserId();
        }
        return aweme.getAuthorUid();
    }

    public static JSONObject a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    String str2 = map.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, d(str2));
                    } else {
                        jSONObject.put(str, str2);
                    }
                } catch (JSONException e2) {
                    a.a((Throwable) e2);
                }
            }
        }
        return jSONObject;
    }

    public static boolean b(String str) {
        if (TextUtils.equals("homepage_follow", str) || TextUtils.equals("homepage_friends", str)) {
            return true;
        }
        return false;
    }

    public static boolean a(String str) {
        if ("homepage_hot".equals(str) || "homepage_follow".equals(str) || "rec_follow".equals(str) || "homepage_fresh".equals(str) || "general_search".equals(str) || "search_result".equals(str) || "search_sug".equals(str) || "homepage_channel".equals(str) || "others_homepage".equals(str) || "find_friends".equals(str) || "challenge".equalsIgnoreCase(str) || "hot_search_video_board".equals(str) || "homepage_country".equals(str) || "homepage_friends".equals(str) || "personal_homepage".equals(str) || "playlist".equals(str) || "homepage_fresh_feed".equalsIgnoreCase(str) || "like_list".equals(str) || "homepage_familiar".equals(str) || TextUtils.equals("discovery_category", str) || "compilation_detail".equals(str)) {
            return true;
        }
        return false;
    }

    public static String a(Aweme aweme, int i2) {
        if (aweme == null) {
            return "";
        }
        return a(aweme.getAid(), i2);
    }

    public static String b(Aweme aweme, int i2) {
        return RequestIdService.a().b(aweme, i2).optString("order");
    }

    public static String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return RequestIdService.a().a(str + i2).f67646a;
    }
}
