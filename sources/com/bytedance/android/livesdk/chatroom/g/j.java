package com.bytedance.android.livesdk.chatroom.g;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNewFeedFirstFrameOpSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15538a;

    static {
        Covode.recordClassIndex(8591);
    }

    public static void a(long j2) {
        if (LiveForuTopLivesEnterOptSetting.INSTANCE.getValue() == 1) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23299c.R = j2;
            enterRoomConfig.f23299c.u = 0;
            enterRoomConfig.f23299c.aa = "outside_with_feed";
            ((com.bytedance.android.livesdkapi.host.j) a.a(com.bytedance.android.livesdkapi.host.j.class)).b(y.e(), enterRoomConfig);
        }
    }

    public static void b(long j2) {
        if (LiveNewFeedFirstFrameOpSetting.INSTANCE.getValue() == 1) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23299c.R = j2;
            enterRoomConfig.f23299c.u = 0;
            enterRoomConfig.f23299c.aa = "outside_with_feed";
            ((com.bytedance.android.livesdkapi.host.j) a.a(com.bytedance.android.livesdkapi.host.j.class)).b(y.e(), enterRoomConfig);
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/webcast/feed/")) {
            return str;
        }
        if (f.f23137c == null) {
            f.f23137c = Boolean.valueOf(((IHostContext) a.a(IHostContext.class)).isOffline());
        }
        if (!f.f23137c.booleanValue() || str.contains("&debug=true")) {
            return str;
        }
        return str + "&debug=true";
    }

    public static void a(long j2, EnterRoomConfig enterRoomConfig) {
        System.currentTimeMillis();
        b(j2, enterRoomConfig);
    }

    private static EnterRoomConfig a(FeedItem feedItem, com.bytedance.android.live.base.model.c.a aVar) {
        String str = null;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        EnterRoomConfig a2 = com.bytedance.android.livesdkapi.g.a.a((Room) feedItem.item, new EnterRoomConfig());
        if (aVar != null) {
            try {
                a2.f23298b.f23315g = String.valueOf(aVar.a());
                if (TextUtils.isEmpty(aVar.f7383f) && !TextUtils.isEmpty(String.valueOf(aVar.a()))) {
                    aVar.f7383f = new JSONObject(aVar.a().toString()).getString("impr_id");
                }
                a2.f23298b.f23309a = aVar.f7383f;
                EnterRoomConfig.RoomsData roomsData = a2.f23299c;
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                roomsData.Z = str;
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("NewFeedStyleEntranceUtils", e2);
            }
        }
        return a2;
    }

    private static EnterRoomConfig b(FeedItem feedItem, com.bytedance.android.live.base.model.c.a aVar) {
        String str = null;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        EnterRoomConfig a2 = com.bytedance.android.livesdkapi.g.a.a((Room) feedItem.item, true);
        if (aVar != null) {
            try {
                a2.f23298b.f23315g = String.valueOf(aVar.a());
                if (TextUtils.isEmpty(aVar.f7383f) && !TextUtils.isEmpty(String.valueOf(aVar.a()))) {
                    aVar.f7383f = new JSONObject(aVar.a().toString()).getString("impr_id");
                }
                a2.f23298b.f23309a = aVar.f7383f;
                EnterRoomConfig.RoomsData roomsData = a2.f23299c;
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                roomsData.Z = str;
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("NewFeedStyleEntranceUtils", e2);
            }
        }
        return a2;
    }

    private static EnterRoomConfig a(EnterRoomConfig enterRoomConfig, List<FeedItem> list) {
        if (!(enterRoomConfig == null || list == null)) {
            if (f.f23137c == null) {
                f.f23137c = Boolean.valueOf(((IHostContext) a.a(IHostContext.class)).isOffline());
            }
            if (f.f23137c.booleanValue()) {
                HashMap<Long, String> hashMap = new HashMap<>();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    FeedItem feedItem = list.get(i2);
                    hashMap.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
                }
                enterRoomConfig.f23299c.aC = hashMap;
            }
        }
        return enterRoomConfig;
    }

    public static void b(long j2, EnterRoomConfig enterRoomConfig) {
        HashMap hashMap = new HashMap();
        if (j2 > 0 && enterRoomConfig != null) {
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - j2));
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("anchor_id", enterRoomConfig.f23298b.f23310b);
            hashMap.put("room_id", String.valueOf(enterRoomConfig.f23299c.R));
            hashMap.put("request_id", enterRoomConfig.f23298b.f23309a);
            hashMap.put("action_type", "click");
            hashMap.put("live_window_mode", "full_screen");
            hashMap.put("log_pb", enterRoomConfig.f23298b.f23315g);
            b.a.a("livesdk_new_style_feed_duration").a((Map<String, String>) hashMap).b();
        }
    }

    public static void a(long j2, String str, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_from", str);
            jSONObject.put("feed_count", i2);
        } catch (JSONException unused) {
        }
        c.a(d.a("ttlive_toplives_query_feed_api"), 0, SystemClock.elapsedRealtime() - j2, jSONObject);
    }

    public static EnterRoomConfig a(List<FeedItem> list, com.bytedance.android.live.base.model.c.a aVar, String str, long j2, Map<String, String> map) {
        FeedItem feedItem = list.get(0);
        boolean z = list.get(0).isRecommendCard;
        String str2 = null;
        EnterRoomConfig a2 = (feedItem == null || !(feedItem.item instanceof Room)) ? null : a(feedItem, aVar);
        a2.f23299c.A = str;
        a2.f23299c.O = true;
        a2.f23299c.Q = "live_square";
        a2.f23299c.W = "full_screen";
        a2.f23298b.w = j2;
        a2.f23299c.J = "live_merge";
        a2.f23299c.L = "live_cover";
        EnterRoomConfig.RoomsData roomsData = a2.f23299c;
        if (z) {
            str2 = "pop_card";
        }
        roomsData.Z = str2;
        EnterRoomConfig a3 = a(a2, list);
        if (map != null && map.containsKey("enter_from_merge")) {
            a3.f23299c.J = map.get("enter_from_merge");
            map.remove("enter_from_merge");
        }
        SparseArray<EnterRoomConfig> sparseArray = new SparseArray<>(list.size());
        int size = list.size();
        for (int i2 = 1; i2 < size; i2++) {
            EnterRoomConfig b2 = b(list.get(i2), aVar);
            if (b2 != null) {
                sparseArray.put(i2, b2);
            }
        }
        a3.f23299c.B = sparseArray;
        if (aVar != null) {
            a3.f23299c.x = Boolean.valueOf(aVar.hasMore);
            a3.f23299c.w = aVar.f7381d;
            a3.f23299c.v = aVar.f7379b;
        }
        if (map != null && !map.isEmpty() && map.containsKey("live.intent.extra.FROM_NEW_STYLE_SOURCE")) {
            String str3 = map.get("live.intent.extra.FROM_NEW_STYLE_SOURCE");
            EnterRoomConfig.RoomsData roomsData2 = a3.f23299c;
            if (str3 == null) {
                str3 = "";
            }
            roomsData2.P = str3;
        }
        f.a.f23366a.a(new EnterRoomLinkSession(a3));
        return a3;
    }

    public static void a(com.bytedance.android.livesdk.feed.l.a aVar, String str, long j2, Map<String, String> map, long j3) {
        if (aVar == null || h.a(aVar.f17588a) || aVar.f17588a.get(0) == null) {
            b(-4);
            ao.a(y.e(), (int) R.string.gni);
            return;
        }
        EnterRoomConfig a2 = a(aVar.f17588a, aVar.f17589b, a(str), j3, map);
        a2.f23298b.G = map.get("toplive_position");
        b(j2, a2);
        a(j3, a2);
        a(j2, "message", aVar.f17588a.size());
        a2.f23299c.R = aVar.f17588a.get(0).item.getId();
        a2.f23299c.aa = "outside_with_feed";
        ((com.bytedance.android.livesdkapi.host.j) a.a(com.bytedance.android.livesdkapi.host.j.class)).b(y.e(), a2);
    }
}
