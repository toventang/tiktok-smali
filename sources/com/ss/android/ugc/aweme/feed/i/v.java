package com.ss.android.ugc.aweme.feed.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.playerkit.model.n;
import h.f.b.l;
import java.util.HashMap;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final n f93495a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f93496b;

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f93497c;

    static {
        Covode.recordClassIndex(59235);
    }

    public final HashMap<String, String> a() {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        Aweme aweme = this.f93496b;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "be_null";
        }
        hashMap.put("current_aweme_id", str);
        hashMap.put("player_aweme_id", this.f93495a.f148789a);
        hashMap.put("current_aweme_order", ac.b(this.f93496b, 0));
        if (this.f93497c != null) {
            hashMap.put("player_aweme_find_in_cache", "1");
            hashMap.put("player_aweme_order", ac.b(this.f93497c, 0));
        } else {
            hashMap.put("player_aweme_find_in_cache", "0");
            hashMap.put("player_aweme_order", "be_null");
        }
        if (l.a((Object) hashMap.get("current_aweme_id"), (Object) hashMap.get("player_aweme_id"))) {
            hashMap.put("is_synchronize", "1");
        } else {
            hashMap.put("is_synchronize", "0");
        }
        return hashMap;
    }

    public v(n nVar, Aweme aweme, Aweme aweme2) {
        l.d(nVar, "");
        this.f93495a = nVar;
        this.f93496b = aweme;
        this.f93497c = aweme2;
    }
}
