package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;

public final class ac extends c<ac> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121170a = new a((byte) 0);

    static {
        Covode.recordClassIndex(78930);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78931);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ac() {
        super("search_correction");
    }

    public final ac r(String str) {
        c("correction_type", str);
        return this;
    }

    public final ac s(String str) {
        c("corrected_keyword", str);
        return this;
    }

    public final ac t(String str) {
        c("original_keyword", str);
        return this;
    }

    public final ac u(String str) {
        c("click_type", str);
        return this;
    }
}
