package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.track.a;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f86362a;

    /* renamed from: b  reason: collision with root package name */
    public final long f86363b;

    /* renamed from: c  reason: collision with root package name */
    public final long f86364c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f86365d;

    /* renamed from: e  reason: collision with root package name */
    public final int f86366e;

    /* renamed from: f  reason: collision with root package name */
    public final String f86367f;

    /* renamed from: g  reason: collision with root package name */
    public final int f86368g;

    /* renamed from: h  reason: collision with root package name */
    public final long f86369h;

    /* renamed from: i  reason: collision with root package name */
    public final long f86370i;

    /* renamed from: j  reason: collision with root package name */
    public final int f86371j;

    static {
        Covode.recordClassIndex(54088);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        String str;
        String str2;
        p[] pVarArr = new p[8];
        if (this.f86362a) {
            str = "full";
        } else {
            str = "half";
        }
        pVarArr[0] = new p("style", str);
        if (this.f86365d) {
            str2 = "video";
        } else {
            str2 = "";
        }
        pVarArr[1] = new p("business", str2);
        pVarArr[2] = new p("retry_count", Integer.valueOf(this.f86366e));
        pVarArr[3] = new p("preload_type", Integer.valueOf(this.f86368g));
        pVarArr[4] = new p("template", this.f86367f);
        pVarArr[5] = new p("start_click_to_now", Long.valueOf(this.f86369h));
        pVarArr[6] = new p("image_load_duration", Long.valueOf(this.f86370i));
        pVarArr[7] = new p("load_success", Integer.valueOf(this.f86371j));
        return ag.c(pVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(boolean z, long j2, long j3, boolean z2, int i2, String str, int i3, long j4, long j5, int i4) {
        super("rd_tiktokec_anchor_product_detail_duration");
        l.d(str, "");
        this.f86362a = z;
        this.f86363b = j2;
        this.f86364c = j3;
        this.f86365d = z2;
        this.f86366e = i2;
        this.f86367f = str;
        this.f86368g = i3;
        this.f86369h = j4;
        this.f86370i = j5;
        this.f86371j = i4;
    }
}
