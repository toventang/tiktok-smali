package com.bytedance.android.live.core.performance;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9252a;

    /* renamed from: b  reason: collision with root package name */
    private static String f9253b = "ttlive_feed_base_performance_monitor_all";

    /* renamed from: c  reason: collision with root package name */
    private static String f9254c = "ttlive_create_room_base_performance_monitor_all";

    /* renamed from: d  reason: collision with root package name */
    private static String f9255d = "ttlive_enter_room_base_performance_monitor_all";

    /* renamed from: e  reason: collision with root package name */
    private static String f9256e = "ttlive_pk_watch_room_base_performance_monitor_all";

    /* renamed from: f  reason: collision with root package name */
    private static ConcurrentHashMap<String, Long> f9257f = new ConcurrentHashMap<>(200);

    /* renamed from: g  reason: collision with root package name */
    private static ConcurrentHashMap<String, Long> f9258g = new ConcurrentHashMap<>(200);

    static {
        Covode.recordClassIndex(4728);
    }

    public enum a {
        LiveFeedInit,
        LiveFeedPreview,
        LiveFeedScroll,
        StartLivePlay,
        ScrollWatchLivePlay,
        CreateStartLivePreview,
        CreateLive,
        ShowBInteractionFirstWidget,
        ShowVideoGift,
        ShowBarrage,
        ShowCInteractionFirstWidget,
        LivePk;

        static {
            Covode.recordClassIndex(4729);
        }
    }

    public static void c(a aVar) {
        if (f9252a) {
            a(aVar, (HashMap<String, String>) null);
        }
    }

    public static void b(a aVar) {
        if (f9252a) {
            f9257f.put(aVar.name(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public static void a(a aVar) {
        if (aVar != null) {
            if (f9257f.containsKey(aVar.name())) {
                f9257f.remove(aVar.name());
            }
            if (f9258g.containsKey(aVar.name())) {
                f9258g.remove(aVar.name());
            }
        }
    }

    private static String a(String str) {
        String str2 = f9253b;
        if (TextUtils.equals(str, a.LiveFeedInit.name()) || TextUtils.equals(str, a.LiveFeedPreview.name()) || TextUtils.equals(str, a.LiveFeedScroll.name())) {
            return f9253b;
        }
        if (TextUtils.equals(str, a.CreateStartLivePreview.name()) || TextUtils.equals(str, a.CreateLive.name()) || TextUtils.equals(str, a.CreateStartLivePreview.name()) || TextUtils.equals(str, a.ShowBInteractionFirstWidget.name())) {
            return f9254c;
        }
        if (TextUtils.equals(str, a.StartLivePlay.name()) || TextUtils.equals(str, a.ScrollWatchLivePlay.name()) || TextUtils.equals(str, a.ShowCInteractionFirstWidget.name()) || TextUtils.equals(str, a.ShowBarrage.name()) || TextUtils.equals(str, a.ShowVideoGift.name())) {
            return f9255d;
        }
        if (TextUtils.equals(str, a.LivePk.name())) {
            return f9256e;
        }
        return str2;
    }

    public static HashMap<String, String> a(String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static void a(a aVar, HashMap<String, String> hashMap) {
        if (f9252a && f9257f.containsKey(aVar.name())) {
            f9258g.put(aVar.name(), Long.valueOf(SystemClock.elapsedRealtime()));
            a(aVar.name(), hashMap);
        }
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        String str2;
        if (f9258g.containsKey(str) && f9257f.containsKey(str)) {
            long longValue = f9258g.get(str).longValue() - f9257f.get(str).longValue();
            if (hashMap != null) {
                str2 = e.a.f9628b.b(hashMap);
            } else {
                str2 = "";
            }
            com.bytedance.android.live.core.c.a.a(3, "TimeCostUtil", str + "->" + longValue + ":" + str2);
            f9258g.remove(str);
            f9257f.remove(str);
            a(str, longValue, str2);
        }
    }

    public static void a(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("TimeCostUtil", "", e2);
        }
    }

    private static void a(String str, long j2, String str2) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "biz", str);
        a(jSONObject, "duration", j2);
        if (!TextUtils.isEmpty(str2)) {
            a(jSONObject, "extra", str2);
        }
        c.b(a(str), 0, jSONObject);
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("TimeCostUtil", "", e2);
        }
    }
}
