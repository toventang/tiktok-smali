package com.ss.android.ugc.aweme.im.sdk.common.controller.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.data.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f102187a;

    /* renamed from: b  reason: collision with root package name */
    public static String f102188b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, String> f102189c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f102190d;

    static {
        Covode.recordClassIndex(65392);
    }

    private b() {
    }

    public static void a(String str, boolean z, String str2) {
        if (!TextUtils.isEmpty(str)) {
            r.a("livesdk_live_event_card", new d().a("enter_from", "chat").a("live_event_id", str).a("is_free_event", z ? "0" : "1").a("live_event_cnt", 1).a("action_type", str2).f66730a);
        }
    }

    public static b a() {
        MethodCollector.i(6036);
        if (f102190d == null) {
            synchronized (b.class) {
                try {
                    if (f102190d == null) {
                        f102190d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6036);
                    throw th;
                }
            }
        }
        b bVar = f102190d;
        MethodCollector.o(6036);
        return bVar;
    }

    public static void a(String str) {
        f102188b = str;
        if (TextUtils.isEmpty(str)) {
            f102188b = "";
        }
    }

    public static void b(String str) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("action_type", str);
        r.a("search_contact", aVar);
    }

    public static void c(String str) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("chat_type", str);
        r.a("inner_push_alert_show", aVar);
    }

    public static void d(String str) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("action_type", str);
        r.a("im_official_alert", aVar);
    }

    public static int a(ai aiVar) {
        if (aiVar == null) {
            return 0;
        }
        return com.ss.android.ugc.aweme.im.sdk.group.a.a.a.d(a.C0745a.a().a(aiVar.getConversationId()));
    }

    public static void b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (f102189c == null) {
                f102189c = new ConcurrentHashMap();
            }
            if (str2 == null) {
                str2 = "";
            }
            f102189c.put(str, str2);
        }
    }

    public static void c(String str, String str2) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("chat_type", str2);
        aVar.put("conversation_id", str);
        r.a("chat_report_click", aVar);
    }

    public static void d(String str, String str2) {
        r.a("click_report", new d().a("author_id", str).a("object_type", "im").a("enter_method", str2).a("enter_from", "chat").f66730a);
    }

    public static String a(String str, String str2) {
        Map<String, String> map;
        String str3;
        if (str2 == null) {
            str2 = "";
        }
        return (TextUtils.isEmpty(str) || (map = f102189c) == null || (str3 = map.get(str)) == null) ? str2 : str3;
    }

    public static void a(SharePackage sharePackage, String str) {
        Bundle bundle = sharePackage.f124595i;
        String string = bundle.getString("previous_page");
        String string2 = bundle.getString("enter_from");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_method", str);
        aVar.put("enter_from", string2);
        aVar.put("previous_page", string);
        r.a("enter_more_friend_list", aVar);
    }

    public static void a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            jSONObject = null;
        }
        r.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }

    public static void b(String str, String str2, String str3, String str4) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("conversation_id", str);
        aVar.put("chat_type", str2);
        aVar.put("to_status", str3);
        r.a(str4, aVar);
    }

    public static void a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "chat");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("group_id", str2);
            }
            jSONObject.put("enter_method", str4);
            jSONObject.put("user_type", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(jSONObject));
    }

    public static void a(String str, String str2, int i2, String str3, int i3) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", str);
        aVar.put("user_type", str2);
        aVar.put("action_type", String.valueOf(i2));
        if (i2 == 1) {
            aVar.put("to_status", str3);
        }
        aVar.put("times", String.valueOf(i3));
        r.a("click_dm_permission_pop_up", aVar);
    }
}
