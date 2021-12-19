package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.ar;
import com.ss.android.ugc.aweme.utils.w;

public final class bm extends ar {
    public static final String av = "video_play_finish";
    public static final a aw = new a((byte) 0);
    public final r au;

    public static final class a {
        static {
            Covode.recordClassIndex(78999);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78998);
    }

    @Override // com.ss.android.ugc.aweme.metrics.h, com.ss.android.ugc.aweme.metrics.c
    public final void d() {
        super.d();
        a(w.a(this.U, bo.aD, this.f109556h, this.au));
    }

    public bm(r rVar) {
        this.au = rVar;
    }
}
