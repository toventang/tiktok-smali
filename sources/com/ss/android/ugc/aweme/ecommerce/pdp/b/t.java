package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class t extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86411c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f86413b;

    static {
        Covode.recordClassIndex(54132);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54133);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("video_id", this.f86412a), new p("video_whole_duration", Integer.valueOf(this.f86413b)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(String str, int i2) {
        super("tiktokec_product_detail_page_video_click");
        l.d(str, "");
        this.f86412a = str;
        this.f86413b = i2;
    }
}
