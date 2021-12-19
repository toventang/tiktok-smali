package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.k.bk;
import h.f.b.l;

public class bk<T extends bk<T>> extends c<T> {
    public static final String A = "query_type";
    public static final String B = "sug_type";
    public static final String C = "user_tag";
    public static final String D = "order";
    public static final String E = "input_keyword";
    public static final String F = "words_type";
    public static final String G = "action_type";
    public static final String H = "search_subtab_name";
    public static final String I = "display_query";
    public static final String J = "gs_query";
    public static final String K = "new_sug_session_id";
    public static final String L = "tab_name";
    public static final a M = new a((byte) 0);
    public static final String s = "words_num";
    public static final String t = "words_source";
    public static final String u = "words_position";
    public static final String v = "words_content";
    public static final String w = "raw_query";
    public static final String x = "query";
    public static final String y = "search_position";
    public static final String z = "query_id";

    public static final class a {
        static {
            Covode.recordClassIndex(78995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78994);
    }

    public final T A(String str) {
        c(F, str);
        return this;
    }

    public final T B(String str) {
        c(E, str);
        return this;
    }

    public final T C(String str) {
        c(I, str);
        return this;
    }

    public final T D(String str) {
        c(J, str);
        return this;
    }

    public final T E(String str) {
        c(K, str);
        return this;
    }

    public final T t(String str) {
        c(C, str);
        return this;
    }

    public final T u(String str) {
        c(B, str);
        return this;
    }

    public final T v(String str) {
        c(t, str);
        return this;
    }

    public final T w(String str) {
        c(v, str);
        return this;
    }

    public final T x(String str) {
        c(w, str);
        return this;
    }

    public final T y(String str) {
        c(y, str);
        return this;
    }

    public final T z(String str) {
        c(z, str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(String str) {
        super(str);
        l.d(str, "");
    }

    public final T a(Object obj) {
        if (obj != null) {
            a(L, obj.toString());
        }
        return this;
    }

    public final T c(Integer num) {
        c(s, String.valueOf(num));
        return this;
    }

    public final T d(Integer num) {
        c(u, String.valueOf(num));
        return this;
    }
}
