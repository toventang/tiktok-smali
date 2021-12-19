package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.as;
import com.ss.android.ugc.aweme.utils.w;

public final class bo extends as {
    public static final String aD = "play_time";
    public static final String aE = "result_source";
    public static final String aF = "volume_status";
    public static final a aG = new a((byte) 0);
    public final r aC;

    public static final class a {
        static {
            Covode.recordClassIndex(79003);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(79002);
    }

    @Override // com.ss.android.ugc.aweme.metrics.h, com.ss.android.ugc.aweme.metrics.c
    public final void d() {
        super.d();
        a(w.a(this.U, aD, this.f109556h, this.aC));
    }

    public bo(r rVar) {
        this.aC = rVar;
    }
}
