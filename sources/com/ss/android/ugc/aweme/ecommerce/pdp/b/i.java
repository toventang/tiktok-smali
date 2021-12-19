package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.p;
import java.util.HashMap;

public final class i extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86378b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f86379a;

    static {
        Covode.recordClassIndex(54092);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54093);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        p[] pVarArr = new p[1];
        if (this.f86379a) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[0] = new p("page_show_type", str);
        return ag.c(pVarArr);
    }

    public i(boolean z) {
        super("tiktokec_product_detail_fullhalfpage_show");
        this.f86379a = z;
    }
}
