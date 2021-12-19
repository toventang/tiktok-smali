package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.p;
import java.util.HashMap;

public final class h extends g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f86373f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f86374a;

    /* renamed from: b  reason: collision with root package name */
    public final long f86375b;

    /* renamed from: c  reason: collision with root package name */
    public final int f86376c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f86377d;

    static {
        Covode.recordClassIndex(54090);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54091);
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
        String str2;
        p[] pVarArr = new p[4];
        if (this.f86374a) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[0] = new p("page_show_type", str);
        pVarArr[1] = new p("photo_view_cnt", Integer.valueOf(this.f86376c));
        pVarArr[2] = new p("duration", Long.valueOf(this.f86375b));
        if (this.f86377d) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        pVarArr[3] = new p("is_address_deliverable", str2);
        return ag.c(pVarArr);
    }

    public h(boolean z, long j2, int i2, boolean z2) {
        super("tiktokec_product_detail_fullhalfpage_time");
        this.f86374a = z;
        this.f86375b = j2;
        this.f86376c = i2;
        this.f86377d = z2;
    }
}
