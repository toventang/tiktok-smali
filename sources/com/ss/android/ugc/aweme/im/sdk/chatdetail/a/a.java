package com.ss.android.ugc.aweme.im.sdk.chatdetail.a;

import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.ac;
import h.f.b.j;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a */
    public static String f101506a = "";

    /* renamed from: b */
    public static String f101507b = "";

    /* renamed from: c */
    public static String f101508c = "";

    /* renamed from: d */
    public static int f101509d;

    /* renamed from: e */
    public static final a f101510e = new a();

    private a() {
    }

    public static void c() {
        a("choose_add_member", new p[0]);
    }

    static {
        Covode.recordClassIndex(64921);
    }

    public static void a() {
        r.a("click_create_group", v.a(f101506a, "enter_from"));
    }

    public static void b() {
        r.a("choose_group_member", v.a(f101506a, "previous_page"), v.a("member_list", "enter_from"));
    }

    public static void d() {
        r.a("click_share_group_inv", v.a(f101508c, "conversation_id"), v.a(Integer.valueOf(f101509d), "is_master"), v.a(f101507b, "enter_method"));
    }

    public static void a(boolean z) {
        f101509d = z ? 1 : 0;
    }

    public static void a(String str) {
        l.d(str, "");
        f101506a = str;
    }

    public static void b(String str) {
        l.d(str, "");
        f101507b = str;
    }

    public static /* synthetic */ void a(int i2) {
        b bVar = b.f101512a;
        l.d(bVar, "");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("conversation_id", f101508c);
        arrayMap.put("is_master", String.valueOf(f101509d));
        arrayMap.put("member_number", String.valueOf(i2));
        arrayMap.put("enter_from", f101507b);
        bVar.invoke("send_group_env", arrayMap);
    }

    public static void b(List<String> list) {
        l.d(list, "");
        a("finish_add_member", v.a(c(list), "to_user_id_set"));
    }

    private static String c(List<String> list) {
        String str = "";
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                str = i2 == 0 ? t : str + ',' + ((String) t);
                i2++;
            }
        }
        return str;
    }

    public static void c(String str) {
        l.d(str, "");
        r.a("choose_group_inv", v.a(f101508c, "conversation_id"), v.a(Integer.valueOf(f101509d), "is_master"), v.a(str, "member_type"), v.a(f101507b, "enter_from"));
    }

    public static void a(List<String> list) {
        l.d(list, "");
        r.a("finish_create_group", v.a(c(list), "to_user_id_set"), v.a(f101506a, "enter_from"));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a$a */
    public static final /* synthetic */ class C2522a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final C2522a f101511a = new C2522a();

        static {
            Covode.recordClassIndex(64922);
        }

        C2522a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final b f101512a = new b();

        static {
            Covode.recordClassIndex(64923);
        }

        b() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static void a(String str, p<? extends Object, String>... pVarArr) {
        l.d(str, "");
        l.d(pVarArr, "");
        ac acVar = new ac(3);
        acVar.a((Object) pVarArr);
        acVar.b(v.a(f101508c, "conversation_id"));
        acVar.b(v.a(Integer.valueOf(f101509d), "is_master"));
        r.a(str, (p[]) acVar.a((Object[]) new p[acVar.f158713a.size()]));
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        a("click_report", v.a(str, "enter_from"), v.a(str2, "object_id"), v.a(str3, "object_type"));
    }

    public static /* synthetic */ void a(int i2, h hVar, String str, List list) {
        String str2;
        int i3;
        C2522a aVar = C2522a.f101511a;
        l.d(str, "");
        l.d(aVar, "");
        String str3 = null;
        if (list != null) {
            str2 = c(list);
        } else {
            str2 = null;
        }
        if (hVar != null) {
            i3 = hVar.getMemberCount();
        } else {
            i3 = 0;
        }
        d a2 = new d().a("enter_from", f101506a).a("chat_num", i3).a(StringSet.type, str);
        if (hVar != null) {
            str3 = hVar.getConversationId();
        }
        d a3 = a2.a("conversation_id", str3).a("error_code", i2);
        if (str2 != null) {
            a3.a("to_user_id_set", str2);
        }
        Map<String, String> map = a3.f66730a;
        l.b(map, "");
        aVar.invoke("create_chat", map);
    }
}
