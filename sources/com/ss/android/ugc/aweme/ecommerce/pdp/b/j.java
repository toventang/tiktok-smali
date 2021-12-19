package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class j extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86380b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86381a;

    static {
        Covode.recordClassIndex(54094);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54095);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("glide_type", this.f86381a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super("tiktokec_product_detail_page_glide");
        l.d(str, "");
        this.f86381a = str;
    }
}
