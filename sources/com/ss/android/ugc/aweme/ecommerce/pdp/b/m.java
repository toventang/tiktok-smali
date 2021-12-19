package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class m extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86398b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86399a;

    static {
        Covode.recordClassIndex(54120);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54121);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("photo_id", this.f86399a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super("tiktokec_product_detail_page_photo_click");
        l.d(str, "");
        this.f86399a = str;
    }
}
