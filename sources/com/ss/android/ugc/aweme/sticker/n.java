package com.ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class n {
    static {
        Covode.recordClassIndex(88254);
    }

    private static final boolean a(String str) {
        if (str == null || ((!p.b(str, "prop_panel_", false) || !(!l.a((Object) str, (Object) "prop_panel_prop_reuse")) || !(!l.a((Object) str, (Object) "prop_panel_challenge"))) && !p.b(str, "duet", false))) {
            return false;
        }
        return true;
    }

    private static final boolean b(String str) {
        if (l.a((Object) str, (Object) "prop_reuse") || l.a((Object) str, (Object) "prop_collect") || l.a((Object) str, (Object) "homepage_prop_maker") || l.a((Object) str, (Object) "favorite_prop") || l.a((Object) str, (Object) "single_song") || l.a((Object) str, (Object) "prop_page") || l.a((Object) str, (Object) "qr_code") || l.a((Object) str, (Object) "challenge") || l.a((Object) str, (Object) "direct_shoot") || l.a((Object) str, (Object) "outer_rec") || l.a((Object) str, (Object) "outer_save") || l.a((Object) str, (Object) "bubble_rec") || l.a((Object) str, (Object) "duet") || l.a((Object) str, (Object) "prop_search") || l.a((Object) str, (Object) "prop_recommend")) {
            return true;
        }
        return false;
    }

    public static final String a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (z && !a(str) && !b(str)) {
            return "other";
        }
        return str;
    }
}
