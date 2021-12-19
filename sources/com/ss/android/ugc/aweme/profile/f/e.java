package com.ss.android.ugc.aweme.profile.f;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(75154);
    }

    private static String a(int i2) {
        if (i2 == 0) {
            return "aweme/v1/aweme/post";
        }
        if (i2 == 1) {
            return "aweme/v1/aweme/favorite";
        }
        return "urlTagByType/".concat(String.valueOf(i2));
    }

    static final /* synthetic */ Object a(int i2, String str) {
        try {
            d a2 = new d().a("request_type", i2).a("to_user_id", str);
            r.a("aweme_profile_list_request_data", a2.f66730a);
            a.b(4, "request:" + a(i2), a2.f66730a.toString());
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(int i2, String str, FeedItemList feedItemList) {
        i.b(new i(i2, str, feedItemList), r.a());
    }

    static final /* synthetic */ Object b(int i2, boolean z, int i3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i2);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i3);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        n.a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }

    static final /* synthetic */ Object b(int i2, String str, FeedItemList feedItemList) {
        String str2;
        LogPbBean logPbBean;
        try {
            d a2 = new d().a("request_type", i2).a("to_user_id", str);
            if (feedItemList == null || feedItemList.getItems() == null) {
                d a3 = a2.a("is_empty", "true");
                if (feedItemList != null) {
                    str2 = feedItemList.getRequestId();
                } else {
                    str2 = "";
                }
                d a4 = a3.a("request_id", str2);
                if (feedItemList != null) {
                    logPbBean = feedItemList.logPb;
                } else {
                    logPbBean = null;
                }
                a4.a("log_pb", logPbBean);
            } else {
                a2.a("size", feedItemList.getItems().size()).a("log_pb", feedItemList.logPb).a("request_id", feedItemList.getRequestId());
            }
            r.a("aweme_profile_list_response_data", a2.f66730a);
            if (feedItemList != null) {
                a.b(4, "response:" + a(i2), a2.f66730a.toString());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void a(int i2, boolean z, int i3) {
        i.b(new h(i2, z, i3), r.a());
    }

    static final /* synthetic */ Object b(int i2, boolean z, Exception exc) {
        String exc2;
        String exc3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i2);
            jSONObject.put("loadMore", z);
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                exc3 = ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse();
            } else {
                exc3 = exc.toString();
            }
            jSONObject.put("errorMsg", exc3);
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        n.a("aweme_favorite_list_data_log", jSONObject2);
        String str = "response:fail:" + a(i2);
        d a2 = new d().a("loadMore", Boolean.valueOf(z));
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            exc2 = ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse();
        } else {
            exc2 = exc.toString();
        }
        a.b(4, str, a2.a("errorMsg", exc2).f66730a.toString());
        return null;
    }

    public static void a(int i2, boolean z, Exception exc) {
        i.b(new g(i2, z, exc), r.a());
    }

    public static void a(int i2, boolean z, int i3, long j2, long j3, int i4) {
        i.b(new f(i2, z, i3, j2, j3, i4), r.a());
    }

    static final /* synthetic */ Object a(int i2, int i3, boolean z, int i4, long j2, long j3, int i5) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("status_code", i2);
            jSONObject.put("pageType", i3);
            jSONObject.put("loadMore", z);
            jSONObject.put("hasMore", String.valueOf(i4));
            jSONObject.put("maxCursor", String.valueOf(j2));
            jSONObject.put("minCursor", String.valueOf(j3));
            jSONObject.put("listCount", String.valueOf(i5));
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        n.a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }
}
