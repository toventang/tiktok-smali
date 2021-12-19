package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;

public final class BlockStruct extends BaseResponse {
    public static final Companion Companion = new Companion(null);
    @c(a = "block_status")
    public int blockStatus;

    static {
        Covode.recordClassIndex(75208);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(75209);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }
}
