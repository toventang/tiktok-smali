package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import java.util.HashMap;

public final class p extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86407a = new a((byte) 0);

    static {
        Covode.recordClassIndex(54126);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54127);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public p() {
        super("tiktokec_report_entrance_click");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new h.p("button_for", "report"));
    }
}
