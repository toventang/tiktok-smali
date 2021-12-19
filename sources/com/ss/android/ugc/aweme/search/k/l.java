package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class l extends d<l> {
    public static final a q = new a((byte) 0);

    static {
        Covode.recordClassIndex(79029);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79030);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public l(r rVar) {
        super("feed_enter", rVar);
    }

    public final l f(Aweme aweme) {
        if (aweme != null) {
            j(aweme.getAuthorUid());
            i(aweme.getGroupId());
            n(aweme.getRequestId());
            if (aweme.getRank() != -1) {
                a(Integer.valueOf(aweme.getRank()));
            }
        }
        return this;
    }
}
