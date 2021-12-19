package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84766a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f84767b;

    static {
        Covode.recordClassIndex(52977);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52978);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(new p("button_for", "add address"), new p("button_place", this.f84767b));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super("tiktokec_order_submit_add_address_click");
        l.d(str, "");
        this.f84767b = str;
    }
}
