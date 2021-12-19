package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.p;
import java.util.HashMap;

public final class l extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86395c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86396a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f86397b;

    static {
        Covode.recordClassIndex(54118);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54119);
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
        p[] pVarArr = new p[2];
        pVarArr[0] = new p("module_for", this.f86396a);
        if (this.f86397b) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[1] = new p("page_show_type", str);
        return ag.c(pVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, boolean z) {
        super("tiktokec_product_detail_page_module_show");
        h.f.b.l.d(str, "");
        this.f86396a = str;
        this.f86397b = z;
    }
}
