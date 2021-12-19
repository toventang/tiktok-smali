package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class u extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86414c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86415a;

    /* renamed from: b  reason: collision with root package name */
    public final int f86416b;

    static {
        Covode.recordClassIndex(54134);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54135);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("video_id", this.f86415a), new p("duration", Integer.valueOf(this.f86416b)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(String str, int i2) {
        super("tiktokec_product_detail_page_video_stay_time");
        l.d(str, "");
        this.f86415a = str;
        this.f86416b = i2;
    }
}
