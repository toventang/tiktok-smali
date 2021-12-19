package com.ss.android.ugc.aweme.detail.e;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.g;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.experiment.b;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79626a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(49468);
    }

    private static boolean b(String str) {
        if (2 != b.a() || !TextUtils.equals(str, "from_follow_tab")) {
            return false;
        }
        return true;
    }

    public static boolean a(String str) {
        if (b(str) || TextUtils.equals("from_nearby", str) || TextUtils.equals("from_search", str) || TextUtils.equals("from_search_similar_aweme", str) || g.a(str)) {
            return true;
        }
        return false;
    }

    public final void a(Aweme aweme, String str, int i2, String str2, long j2, boolean z, int i3, com.ss.android.ugc.aweme.feed.param.b bVar) {
        String str3;
        if (aweme != null) {
            if (a(str) || TextUtils.equals("from_search_jedi", str) || TextUtils.equals("potential_friends", str) || TextUtils.equals("from_no_request", str) || TextUtils.equals("from_commerce_seed", str) || TextUtils.equals("from_commerce_bill_share", str) || TextUtils.equals("from_anchor_video", str) || TextUtils.equals("from_profile_self", str) || TextUtils.equals("from_profile_other", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_visual_search_result", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_channel", str) || TextUtils.equals("from_search_commodity", str) || TextUtils.equals("from_mix_detail", str) || TextUtils.equals("from_trending_inflow", str) || TextUtils.equals("from_search_live", str) || TextUtils.equals("from_follow_often_watch", str) || TextUtils.equals("from_search_continuous_loading_card", str)) {
                ag agVar = new ag(21, aweme);
                agVar.f93454e = str;
                agVar.f93457h = i2;
                agVar.f93462m = z;
                if (g.a(str)) {
                    i O = v.O();
                    l.b(O, "");
                    agVar.f93460k = O.n();
                    i O2 = v.O();
                    l.b(O2, "");
                    agVar.f93461l = O2.o();
                    agVar.f93455f = str2;
                }
                agVar.f93456g = j2;
                agVar.f93458i = i3;
                Bundle bundle = new Bundle();
                if (bVar != null) {
                    str3 = bVar.getSearchType();
                } else {
                    str3 = null;
                }
                bundle.putString("key_search_type", str3);
                agVar.f93452c = bundle;
                c.a(agVar);
            }
        }
    }
}
