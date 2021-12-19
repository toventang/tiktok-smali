package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class q extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86408b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f86409a;

    static {
        Covode.recordClassIndex(54128);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54129);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("shop_id", this.f86409a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(String str) {
        super("tiktokec_report_entrance_show");
        l.d(str, "");
        this.f86409a = str;
    }
}
