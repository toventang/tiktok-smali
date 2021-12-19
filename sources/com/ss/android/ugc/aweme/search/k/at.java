package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;

public final class at extends d<at> {
    public static final a q = new a((byte) 0);

    static {
        Covode.recordClassIndex(78960);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78961);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public at(r rVar) {
        super("search_result_click", rVar);
    }

    public final at A(String str) {
        c("button_type", str);
        return this;
    }

    public final at B(String str) {
        c("aladdin_button_type", str);
        return this;
    }
}
