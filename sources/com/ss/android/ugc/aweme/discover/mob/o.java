package com.ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.q;
import java.util.HashMap;
import java.util.Map;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, String> f81935a;

    static {
        Covode.recordClassIndex(50862);
        HashMap hashMap = new HashMap();
        f81935a = hashMap;
        hashMap.put(3, "general_search");
        f81935a.put(6, "search_sug");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        }
        return "click_search_result";
    }

    public static String a(int i2) {
        String str = f81935a.get(Integer.valueOf(i2));
        if (str == null || TextUtils.isEmpty(str)) {
            return "search_result";
        }
        return str;
    }

    public static void a(int i2, String str, String str2) {
        c cVar = new c();
        if (i2 != 3) {
            cVar.a("group_id", "");
            cVar.a("request_id", str);
            cVar.a("enter_from", "search_result");
            cVar.a("enter_method", "click_card");
            cVar.a("enter_type", "normal_way");
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(cVar.a()));
            return;
        }
        cVar.a("enter_from", "general_search");
        cVar.a("enter_method", "click_card");
        cVar.a("enter_type", "normal_way");
        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(cVar.a()));
    }

    public static void b(int i2, String str, String str2) {
        if (i2 == 3) {
            r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("general_search").setValue(str));
            return;
        }
        c cVar = new c();
        if (!TextUtils.isEmpty(str2)) {
            cVar.a("search_keyword", str2);
            r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setExtValueString(str).setJsonObject(cVar.a()));
            return;
        }
        cVar.a("source", "recommend");
        cVar.a("id", str);
        r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setJsonObject(cVar.a()));
    }

    public static void a(View view, String str, Aweme aweme, String str2, int i2) {
        a(view, str, aweme, str2, i2, "", "", "");
    }

    public static void a(int i2, String str, String str2, com.ss.android.ugc.aweme.metrics.c cVar, int i3, String str3) {
        new g().setOrder(i2).setSearchKeyword(str).setRid(str2).setEnterFrom(a(i3)).setEnterMethod(str3).installToMetrics(cVar);
        cVar.f();
    }

    public static void a(View view, String str, Aweme aweme, String str2, int i2, String str3, String str4, String str5) {
        if (str.equals("general_search") || str.equals("search_result") || str.equals("ecommerce")) {
            d.a(view, aweme.getAid(), i2);
            i.b(new p(str, aweme, view, str2, str3, str4, str5), g.c());
        }
    }

    public static void a(View view, int i2, String str, int i3, String str2, String str3, String str4, String str5, Map<String, String> map) {
        d.a(view, str3, i2);
        q o = ((q) new q().b()).o(a(i3));
        o.r = str2;
        q qVar = (q) o.c().b(String.valueOf(i2));
        qVar.q = str3;
        qVar.ae = com.ss.android.ugc.aweme.discover.adapter.b.g.f80504a;
        qVar.ac = str5;
        if (map != null) {
            qVar.a(map);
        }
        a(i2, str, str2, qVar, i3, str4);
        a(i3, str2, str3);
    }
}
