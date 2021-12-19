package com.ss.android.ugc.aweme.discover.mixfeed.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.m.f;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.al;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f81643a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(50736);
    }

    public static final al a(String str, r rVar, User user) {
        String str2;
        l.d(str, "");
        l.d(rVar, "");
        l.d(user, "");
        al alVar = new al(str);
        alVar.a(rVar.f121274i).g(user.getUid()).b(rVar.f121271f).d(rVar.f121275j).o(rVar.f121272g);
        alVar.c("to_user_id", user.getUid());
        String str3 = "0";
        if (f.a(user)) {
            str2 = str3;
        } else {
            str2 = "1";
        }
        alVar.c("can_message", str2);
        if (user.getFollowStatus() == 4) {
            str3 = "1";
        }
        alVar.c("is_requested", str3);
        return alVar;
    }

    public static final v a(r rVar, String str, int i2, User user, Map<String, String> map, boolean z) {
        String str2 = "";
        l.d(rVar, str2);
        l.d(str, str2);
        l.d(user, str2);
        if (i2 == 1) {
            if (user.getFollowerStatus() == 1) {
                str2 = "mutual";
            } else {
                str2 = "single";
            }
        }
        v vVar = new v(str);
        if (map != null) {
            vVar.a(map);
        }
        if (!z) {
            vVar.s = "click_search_result";
            vVar.f109606c = "follow_button";
        }
        v vVar2 = (v) vVar.l(rVar.f121274i);
        vVar2.ah = 1;
        v a2 = ((v) vVar2.f(user.getUid())).a(rVar.f121272g);
        a2.f109608e = user.getUid();
        v vVar3 = (v) a2.k(rVar.f121275j);
        vVar3.f109605b = rVar.f121272g;
        vVar3.v = str2;
        vVar3.q = user.getRequestId();
        vVar3.a("search_keyword", rVar.f121271f).a("is_search_scene", "1").a("relation_tag", d.a(user));
        return vVar;
    }
}
