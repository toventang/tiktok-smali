package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class al extends c<al> {
    public static final String A = "utm_source";
    public static final a B = new a((byte) 0);
    public static final String r = "search";
    public static final String s = "duration";
    public static final String t = "is_success";
    public static final String u = "is_bonus";
    public static final String v = "from_search_subtab";
    public static final String w = "sug_type";
    public static final String x = "pre_search_id";
    public static final String y = "new_sug_session_id";
    public static final String z = "event_keyword";

    public static final class a {
        static {
            Covode.recordClassIndex(78948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78947);
    }

    public final al r(String str) {
        c(v, str);
        return this;
    }

    public final al s(String str) {
        c(x, str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al(String str) {
        super(str);
        l.d(str, "");
    }
}
