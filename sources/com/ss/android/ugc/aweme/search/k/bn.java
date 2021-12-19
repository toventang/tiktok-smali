package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.ap;
import com.ss.android.ugc.aweme.utils.w;

public final class bn extends ap {
    public static final String aw = "video_play";
    public static final String ax = "result_source";
    public static final a ay = new a((byte) 0);
    public final r av;

    public static final class a {
        static {
            Covode.recordClassIndex(79001);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(79000);
    }

    @Override // com.ss.android.ugc.aweme.metrics.h, com.ss.android.ugc.aweme.metrics.c
    public final void d() {
        super.d();
        a(w.a(this.U, bo.aD, this.f109556h, this.av));
    }

    public bn(r rVar) {
        this.av = rVar;
    }
}
