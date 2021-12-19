package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class n extends g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f86400d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86401a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f86402b;

    /* renamed from: c  reason: collision with root package name */
    public final String f86403c;

    static {
        Covode.recordClassIndex(54122);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54123);
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
        p[] pVarArr = new p[3];
        pVarArr[0] = new p("photo_show_type", this.f86401a);
        if (this.f86402b) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[1] = new p("page_show_type", str);
        pVarArr[2] = new p("photo_id", this.f86403c);
        return ag.c(pVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, boolean z, String str2) {
        super("tiktokec_product_detail_page_photo_glide");
        l.d(str, "");
        l.d(str2, "");
        this.f86401a = str;
        this.f86402b = z;
        this.f86403c = str2;
    }
}
