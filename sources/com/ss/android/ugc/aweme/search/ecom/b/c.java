package com.ss.android.ugc.aweme.search.ecom.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.a.a;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.s.e;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f121055a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(78863);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static Map<String, String> a(Map<String, String> map) {
        String str = "";
        l.d(map, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        Object remove = linkedHashMap.remove("enter_from");
        if (remove != 0) {
            str = remove;
        }
        linkedHashMap.put("enter_from_info", str);
        linkedHashMap.remove("page_name");
        linkedHashMap.put("source_page_type", "search");
        return linkedHashMap;
    }

    public static Map<String, String> a(User user, a aVar, r rVar) {
        Map<String, String> b2 = b(user, aVar, rVar);
        String str = b2.get("enter_from");
        if (str == null) {
            str = "";
        }
        b2.put("page_name", str);
        b2.put("entrance_form", "user_showcase_card");
        return b2;
    }

    public static Map<String, String> a(Aweme aweme, a aVar, r rVar) {
        User user;
        String str;
        String str2;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        Map<String, String> b2 = b(user, aVar, rVar);
        String a2 = e.a(b2.get("enter_from"));
        if (a2 != null) {
            b2.put("enter_from", a2);
        }
        String str3 = b2.get("enter_from");
        if (str3 == null) {
            str3 = "";
        }
        b2.put("page_name", str3);
        b2.put("entrance_form", com.ss.android.ugc.aweme.search.s.a.a(aweme));
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        b2.put("group_id", str);
        b2.put("is_single_anchor", com.ss.android.ugc.aweme.search.s.a.b(aweme));
        if (b.s(aweme)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        b2.put("is_ad", str2);
        b2.put("anchor_tag", "");
        return b2;
    }

    public static Map<String, String> b(Aweme aweme, a aVar, r rVar) {
        User user;
        int i2;
        String str;
        User author;
        a.b bVar;
        Long l2 = null;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        Map<String, String> b2 = b(user, aVar, rVar);
        String remove = b2.remove("enter_from");
        if (remove == null) {
            remove = "";
        }
        if (aVar == null || (bVar = aVar.f121045m) == null) {
            i2 = 0;
        } else {
            i2 = bVar.f121048a;
        }
        if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
            l2 = Long.valueOf(author.roomId);
        }
        b2.put("room_id", String.valueOf(l2));
        b2.put("is_ad", "0");
        if (rVar == null || (str = rVar.f121275j) == null) {
            str = "";
        }
        b2.put("request_id", str);
        b2.put("enter_method", "");
        b2.put("action_type", "");
        b2.put("page_name", remove);
        b2.put("enter_from_merge", remove);
        b2.put("entrance_form", "search_live_merge_entrance");
        b2.put("card_type", String.valueOf(i2));
        return b2;
    }

    private static Map<String, String> b(User user, a aVar, r rVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        String str9;
        Integer num;
        String str10 = "";
        if (user == null || (str = user.getUid()) == null) {
            str = str10;
        }
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, str10);
        String curUserId = e2.getCurUserId();
        p[] pVarArr = new p[10];
        pVarArr[0] = v.a("author_id", str);
        if (aVar == null || (num = aVar.f121042j) == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = str10;
        }
        pVarArr[1] = v.a("product_source", str2);
        if (aVar == null || (str3 = aVar.f121043k) == null) {
            str3 = str10;
        }
        pVarArr[2] = v.a("source_from", str3);
        if (aVar == null || (str4 = aVar.f121044l) == null) {
            str4 = str10;
        }
        pVarArr[3] = v.a("source", str4);
        if (aVar == null || (str5 = aVar.f121033a) == null) {
            str5 = str10;
        }
        pVarArr[4] = v.a("product_id", str5);
        if (l.a((Object) str, (Object) curUserId)) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        pVarArr[5] = v.a("is_self", str6);
        if (rVar == null || (str7 = rVar.f121274i) == null) {
            str7 = str10;
        }
        pVarArr[6] = v.a("search_id", str7);
        if (rVar == null || (str8 = rVar.n) == null) {
            str8 = str10;
        }
        pVarArr[7] = v.a("search_result_id", str8);
        if (!(rVar == null || (str9 = rVar.f121272g) == null)) {
            str10 = str9;
        }
        pVarArr[8] = v.a("enter_from", str10);
        pVarArr[9] = v.a("EVENT_ORIGIN_FEATURE", "TEMAI");
        Map<String, String> b2 = ag.b(pVarArr);
        if (h.m.p.a(b2.get("is_self"), "0", false)) {
            if (user != null) {
                i2 = user.getFollowStatus();
            } else {
                i2 = -1;
            }
            b2.put("follow_status", String.valueOf(i2));
        }
        return b2;
    }
}
