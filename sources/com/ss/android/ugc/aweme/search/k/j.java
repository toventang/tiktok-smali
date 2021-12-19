package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;

public final class j extends b<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121258a = new a((byte) 0);

    static {
        Covode.recordClassIndex(79025);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79026);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public j() {
        super("enter_search_blankpage");
    }

    public final j a(Object obj) {
        if (obj != null) {
            a("tab_name", obj.toString());
        }
        return this;
    }

    public final j b(Object obj) {
        if (obj != null) {
            a("is_from_video", obj.toString());
        }
        return this;
    }
}
